package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Map;

public class StopSoundRunProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure StopSoundRun!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure StopSoundRun!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure StopSoundRun!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure StopSoundRun!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.getLevelData().isRaining() || !world.getLevelData().isRaining()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:alivetenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:brute_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:cascade_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:comet_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:forest_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:glide_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:guardian_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:husk_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:lightning_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:nothern_lights_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:ochre_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:overtune_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:raiders_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:shrieker_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:sleigh_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:snowstorm_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:soulless_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:storm_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:stride_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:the_ender_dragon_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:the_wither_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a record portdiscs:time_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:underscore_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:warden_run_tenm");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
								Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"stopsound @a record portdiscs:pumpkin_tenm");
		}
	}
}
