package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModEntities;
import net.mojang.portdiscs.entity.SoulfishEntity;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class SoulSeekerEntityIsHurtProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure SoulSeekerEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure SoulSeekerEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure SoulSeekerEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure SoulSeekerEntityIsHurt!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.6) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SoulfishEntity(PortdiscsModEntities.SOULFISH, _level);
				entityToSpawn.moveTo(x, y, (z + 3), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x - 3, y - 1, z), Blocks.SOUL_SOIL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z), Blocks.SOUL_SOIL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 3), Blocks.SOUL_SOIL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 2), Blocks.SOUL_SOIL.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z - 4), Blocks.SOUL_SOIL.defaultBlockState(), 3);
			if (Math.random() < 0.3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new SoulfishEntity(PortdiscsModEntities.SOULFISH, _level);
					entityToSpawn.moveTo((x - 3), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (Math.random() < Math.max(0.45, 0.6)) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + Math.random() * 10), y, (z + Math.random() * 10), 1, Explosion.BlockInteraction.BREAK);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x - Math.random() * 10), y, (z - Math.random() * 10), 1, Explosion.BlockInteraction.BREAK);
		} else if (Math.random() < Math.max(0.61, 0.85)) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Math.max(1, 8), y, z)));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + Math.max(1, 8))));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - Math.max(1, 8))));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
