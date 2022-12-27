package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.Map;

public class HuskTenmLivingEntityIsHitWithItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure HuskTenmLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Husk) {
			entity.hurt(DamageSource.GENERIC, 100);
		}
	}
}
