package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModItems;
import net.mojang.portdiscs.init.PortdiscsModEntities;
import net.mojang.portdiscs.entity.StaffMinionEntity;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.Screen;

import java.util.Map;

public class StaffOfTrappedSoulsRangedItemUsedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure StaffOfTrappedSoulsRangedItemUsed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure StaffOfTrappedSoulsRangedItemUsed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure StaffOfTrappedSoulsRangedItemUsed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure StaffOfTrappedSoulsRangedItemUsed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure StaffOfTrappedSoulsRangedItemUsed!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isShiftKeyDown()) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) == 2) {
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(1));
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 5, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 5, y, z + 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - 5, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - 5, y, z - 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 5), y, z, 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z + 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 5), y, (z + 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 5), y, z, 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z - 5), 2, Explosion.BlockInteraction.DESTROY);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 5), y, (z - 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(PortdiscsModItems.STAFF_OF_TRAPPED_SOULS, 60);
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(1));
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 5, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + 5, y, z + 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - 5, y, z)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - 5, y, z - 5)));
					entityToSpawn.setVisualOnly(false);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 5), y, z, 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z + 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 5), y, (z + 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 5), y, z, 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z - 5), 2, Explosion.BlockInteraction.DESTROY);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 5), y, (z - 5), 2, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.NEUTRAL, (float) 1.2, 1);
					} else {
						_level.playLocalSound(x, y, z, SoundEvents.AMETHYST_BLOCK_STEP, SoundSource.NEUTRAL, (float) 1.2, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(PortdiscsModItems.STAFF_OF_TRAPPED_SOULS, 60);
			} else if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) < 2) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("title @s actionbar {\"text\":\"Not Enough XP Level (Need 2 Levels)\",\"color\":\"red\"}"), (false));
			}
		}
		if (Screen.hasAltDown()) {
			if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) > 2) {
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(2));
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new StaffMinionEntity(PortdiscsModEntities.STAFF_MINION, _level);
					entityToSpawn.moveTo((x + Math.random() * 7), (y + 2), (z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new StaffMinionEntity(PortdiscsModEntities.STAFF_MINION, _level);
					entityToSpawn.moveTo((x - Math.random() * 7), (y + 2), (z + Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new StaffMinionEntity(PortdiscsModEntities.STAFF_MINION, _level);
					entityToSpawn.moveTo((x - Math.random() * 7), (y + 2), (z - Math.random() * 7), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("title @s actionbar {\"text\":\"Not Enough XP (Need 3 Levels)\",\"color\":\"red\"}"), (false));
			}
		}
	}
}
