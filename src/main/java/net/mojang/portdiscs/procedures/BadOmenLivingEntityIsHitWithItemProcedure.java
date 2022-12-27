package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.Map;

public class BadOmenLivingEntityIsHitWithItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure BadOmenLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Piglin || entity instanceof PiglinBrute || entity instanceof ZombifiedPiglin) {
			entity.hurt(DamageSource.GENERIC, 120);
		}
	}
}
