package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class MusicBoxOnBlockHitByProjectileProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure MusicBoxOnBlockHitByProjectile!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure MusicBoxOnBlockHitByProjectile!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure MusicBoxOnBlockHitByProjectile!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure MusicBoxOnBlockHitByProjectile!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean yes = false;
		boolean no = false;
		yes = true;
		no = false;
		if ((world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z), Direction.NORTH) : 0) < 1 || yes
				|| (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z), Direction.SOUTH) : 0) < 1 || yes
				|| (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z), Direction.EAST) : 0) < 1 || yes
				|| (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z), Direction.WEST) : 0) < 1 || yes
				|| (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(new BlockPos(x, y, z), Direction.DOWN) : 0) < 1 || yes) {
			if (Math.random() < 0.03) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.DIAMOND_BLOCK));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_INGOT));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_INGOT));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_INGOT));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.IRON_BLOCK));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.IRON_BLOCK));
					entityToSpawn.setPickUpDelay(5);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
