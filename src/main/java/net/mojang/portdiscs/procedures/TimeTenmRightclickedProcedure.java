package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import java.util.Map;

public class TimeTenmRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure TimeTenmRightclicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		if (world.dayTime() == Math.max(18000, 22999)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(23000);
		} else if (world.dayTime() == Math.max(23000, 1000)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(1000);
		} else if (world.dayTime() == Math.max(1000, 5999)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(6000);
		} else if (world.dayTime() == Math.max(6000, 11999)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(12000);
		} else if (world.dayTime() == Math.max(12000, 12999)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(13000);
		} else if (world.dayTime() == Math.max(13000, 17999)) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(18000);
		}
	}
}
