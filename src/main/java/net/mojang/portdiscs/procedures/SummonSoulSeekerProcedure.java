package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModEntities;
import net.mojang.portdiscs.entity.SoulSeekerEntity;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Map;
import java.util.HashMap;

import io.github.fabricators_of_create.porting_lib.event.common.BlockPlaceCallback;

public class SummonSoulSeekerProcedure {
	public SummonSoulSeekerProcedure() {
		BlockPlaceCallback.EVENT.register((event) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("px", event.getPlayer().getX());
			dependencies.put("py", event.getPlayer().getY());
			dependencies.put("pz", event.getPlayer().getZ());
			dependencies.put("world", event.getLevel());
			dependencies.put("entity", event.getPlayer());
			dependencies.put("x", (event.replacingClickedOnBlock() ? event.getHitResult().getBlockPos().getX() : event.relativePos.getX()));
			dependencies.put("y", (event.replacingClickedOnBlock() ? event.getHitResult().getBlockPos().getY() : event.relativePos.getY()));
			dependencies.put("z", (event.replacingClickedOnBlock() ? event.getHitResult().getBlockPos().getZ() : event.relativePos.getZ()));
			dependencies.put("blockstate", (((BlockItem) event.getItemInHand().getItem()).getBlock().defaultBlockState()));
			dependencies.put("placedagainst", (event.getLevel().getBlockState(event.getHitResult().getBlockPos())));
			dependencies.put("event", event);
			Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
				execute(dependencies);
			}, 1, TimeUnit.MILLISECONDS);
			return InteractionResult.PASS;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure SummonSoulSeeker!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure SummonSoulSeeker!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure SummonSoulSeeker!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure SummonSoulSeeker!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WITHER_SKELETON_SKULL
				&& (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIAMOND_BLOCK
				&& (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.SOUL_SOIL) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SoulSeekerEntity(PortdiscsModEntities.SOUL_SEEKER, _level);
				entityToSpawn.moveTo(x, (y - 2), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y - 2, z)));
				entityToSpawn.setVisualOnly(false);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
