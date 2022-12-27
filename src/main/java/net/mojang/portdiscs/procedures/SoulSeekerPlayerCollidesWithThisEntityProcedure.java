package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;

import java.util.Map;

public class SoulSeekerPlayerCollidesWithThisEntityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure SoulSeekerPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure SoulSeekerPlayerCollidesWithThisEntity!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getDifficulty() == Difficulty.PEACEFUL) {
			entity.hurt(DamageSource.GENERIC, 0);
		} else if (world.getDifficulty() == Difficulty.EASY) {
			entity.hurt(DamageSource.GENERIC, 4);
		} else if (world.getDifficulty() == Difficulty.NORMAL) {
			entity.hurt(DamageSource.GENERIC, (float) 6.5);
		} else if (world.getDifficulty() == Difficulty.HARD) {
			entity.hurt(DamageSource.GENERIC, 8);
		}
	}
}
