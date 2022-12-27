package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModSounds;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class MusicBoxRedstoneOnProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure MusicBoxRedstoneOn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure MusicBoxRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure MusicBoxRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure MusicBoxRedstoneOn!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), PortdiscsModSounds.LIGHTING_BOLT, SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, PortdiscsModSounds.LIGHTING_BOLT, SoundSource.RECORDS, 1, 1, false);
				}
			}
		} else if (Math.random() < 0.6) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), PortdiscsModSounds.LUSH_GT, SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, PortdiscsModSounds.LUSH_GT, SoundSource.RECORDS, 1, 1, false);
				}
			}
		} else if (Math.random() < 0.2) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), PortdiscsModSounds.FOREST, SoundSource.RECORDS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, PortdiscsModSounds.FOREST, SoundSource.RECORDS, 1, 1, false);
				}
			}
		}
	}
}
