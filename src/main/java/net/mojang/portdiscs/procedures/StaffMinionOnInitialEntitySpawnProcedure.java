package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;

public class StaffMinionOnInitialEntitySpawnProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure StaffMinionOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
			entity.hurt(DamageSource.GENERIC, 2);
			Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
				entity.hurt(DamageSource.GENERIC, 2);
				Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
					entity.hurt(DamageSource.GENERIC, 2);
					Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
						entity.hurt(DamageSource.GENERIC, 2);
					}, 5000, TimeUnit.MILLISECONDS);
				}, 5000, TimeUnit.MILLISECONDS);
			}, 5000, TimeUnit.MILLISECONDS);
		}, 10000, TimeUnit.MILLISECONDS);
	}
}
