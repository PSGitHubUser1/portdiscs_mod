
package net.mojang.portdiscs.entity;

import net.mojang.portdiscs.procedures.StaffOfTrappedSoulsWhileProjectileFlyingTickProcedure;
import net.mojang.portdiscs.procedures.StaffOfTrappedSoulsProjectileHitsBlockProcedure;
import net.mojang.portdiscs.init.PortdiscsModEntities;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;

public class StaffOfTrappedSoulsEntity extends AbstractArrow implements ItemSupplier {
	public StaffOfTrappedSoulsEntity(EntityType<? extends StaffOfTrappedSoulsEntity> type, Level world) {
		super(type, world);
	}

	public StaffOfTrappedSoulsEntity(EntityType<? extends StaffOfTrappedSoulsEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public StaffOfTrappedSoulsEntity(EntityType<? extends StaffOfTrappedSoulsEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(Items.ENDER_PEARL);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Entity sourceentity = this.getOwner();
		Entity immediatesourceentity = this;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		StaffOfTrappedSoulsProjectileHitsBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		double x = blockHitResult.getBlockPos().getX();
		double y = blockHitResult.getBlockPos().getY();
		double z = blockHitResult.getBlockPos().getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity immediatesourceentity = this;
		StaffOfTrappedSoulsProjectileHitsBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity immediatesourceentity = this;
		StaffOfTrappedSoulsWhileProjectileFlyingTickProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
		if (this.inGround)
			this.discard();
	}

	public static StaffOfTrappedSoulsEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		StaffOfTrappedSoulsEntity entityarrow = new StaffOfTrappedSoulsEntity(PortdiscsModEntities.STAFF_OF_TRAPPED_SOULS, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENDER_PEARL_THROW, SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static StaffOfTrappedSoulsEntity shoot(LivingEntity entity, LivingEntity target) {
		StaffOfTrappedSoulsEntity entityarrow = new StaffOfTrappedSoulsEntity(PortdiscsModEntities.STAFF_OF_TRAPPED_SOULS, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z, SoundEvents.ENDER_PEARL_THROW, SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
