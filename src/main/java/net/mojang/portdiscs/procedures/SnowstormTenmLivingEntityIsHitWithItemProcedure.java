package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.animal.SnowGolem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.Map;

public class SnowstormTenmLivingEntityIsHitWithItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure SnowstormTenmLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof SnowGolem) {
			entity.hurt(DamageSource.GENERIC, 50);
		}
	}
}
