
package net.mojang.portdiscs.entity;

import net.mojang.portdiscs.procedures.SoulSeekerPlayerCollidesWithThisEntityProcedure;
import net.mojang.portdiscs.procedures.SoulSeekerEntityIsHurtProcedure;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.core.BlockPos;

import java.util.EnumSet;

public class SoulSeekerEntity extends Monster {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.BLUE,
			ServerBossEvent.BossBarOverlay.NOTCHED_20);

	public SoulSeekerEntity(EntityType<SoulSeekerEntity> type, Level world) {
		super(type, world);
		xpReward = 300;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (SoulSeekerEntity.this.getTarget() != null && !SoulSeekerEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return SoulSeekerEntity.this.getMoveControl().hasWanted() && SoulSeekerEntity.this.getTarget() != null
						&& SoulSeekerEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = SoulSeekerEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				SoulSeekerEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = SoulSeekerEntity.this.getTarget();
				if (SoulSeekerEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					SoulSeekerEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = SoulSeekerEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						SoulSeekerEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.2));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = SoulSeekerEntity.this.getRandom();
				double dir_x = SoulSeekerEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = SoulSeekerEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = SoulSeekerEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(Blocks.TORCH, this, 1, (int) 3));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return SoundEvents.WITHER_SKELETON_AMBIENT;
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(SoundEvents.WITHER_SKELETON_STEP, 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return SoundEvents.WITHER_SKELETON_HURT;
	}

	@Override
	public SoundEvent getDeathSound() {
		return SoundEvents.WITHER_SKELETON_DEATH;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		Entity sourceentity = source.getEntity();

		SoulSeekerEntityIsHurtProcedure.execute(
				com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		Entity entity = this;
		Level world = this.level;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();

		SoulSeekerPlayerCollidesWithThisEntityProcedure
				.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("entity", entity).build());
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 300);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4);
		return builder;
	}
}
