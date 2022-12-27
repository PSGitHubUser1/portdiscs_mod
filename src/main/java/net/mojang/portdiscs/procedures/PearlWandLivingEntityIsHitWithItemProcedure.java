package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class PearlWandLivingEntityIsHitWithItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure PearlWandLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure PearlWandLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure PearlWandLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure PearlWandLivingEntityIsHitWithItem!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
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
			_level.explode(null, (x + 5), y, z, 2, Explosion.BlockInteraction.DESTROY);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, (z + 5), 2, Explosion.BlockInteraction.DESTROY);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 5), y, (z + 5), 2, Explosion.BlockInteraction.DESTROY);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 5), y, z, 2, Explosion.BlockInteraction.DESTROY);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, (z - 5), 2, Explosion.BlockInteraction.DESTROY);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 5), y, (z - 5), 2, Explosion.BlockInteraction.DESTROY);
	}
}
