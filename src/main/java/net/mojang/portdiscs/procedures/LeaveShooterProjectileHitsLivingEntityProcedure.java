package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;

public class LeaveShooterProjectileHitsLivingEntityProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure LeaveShooterProjectileHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Monster || entity instanceof Mob || entity instanceof Player) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 60, 5, (false), (true)));
			Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
				entity.hurt(DamageSource.MAGIC, (float) Math.max(1, 2));
				Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
					entity.hurt(DamageSource.MAGIC, (float) Math.max(1, 3));
					Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
						entity.hurt(DamageSource.MAGIC, (float) Math.max(1, 4));
					}, 1000, TimeUnit.MILLISECONDS);
				}, 1000, TimeUnit.MILLISECONDS);
			}, 1000, TimeUnit.MILLISECONDS);
		}
	}
}
