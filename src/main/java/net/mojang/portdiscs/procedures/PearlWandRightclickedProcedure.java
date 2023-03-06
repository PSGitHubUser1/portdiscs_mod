package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.entity.projectile.EvokerFangs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class PearlWandRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency world for procedure PearlWandRightclicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency x for procedure PearlWandRightclicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency y for procedure PearlWandRightclicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency z for procedure PearlWandRightclicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure PearlWandRightclicked!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency itemstack for procedure PearlWandRightclicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
		if (!entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putDouble("blockX", (entity.getX()));
			itemstack.getOrCreateTag().putDouble("blockY", (entity.getY()));
			itemstack.getOrCreateTag().putDouble("blockZ", (entity.getZ()));
			itemstack.getOrCreateTag().putBoolean("canTeleport", (true));
			if ((entity.getDirection()) == Direction.EAST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x + 10), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.SOUTH) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo(x, y, (z + 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.NORTH) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo(x, y, (z - 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.WEST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x - 10), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.SOUTH && (entity.getDirection()) == Direction.EAST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x + 10), y, (z + 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.NORTH && (entity.getDirection()) == Direction.EAST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x + 10), y, (z - 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.SOUTH && (entity.getDirection()) == Direction.WEST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x - 10), y, (z + 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((entity.getDirection()) == Direction.NORTH && (entity.getDirection()) == Direction.WEST) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ThrownEnderpearl(EntityType.ENDER_PEARL, _level);
					entityToSpawn.moveTo((x - 10), y, (z - 10), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (entity.isShiftKeyDown()) {
			if (!((world.getBlockState(new BlockPos(x, y, z))) == Blocks.WATER.defaultBlockState() || (world.getBlockState(new BlockPos(x, y, z))) == Blocks.BUBBLE_COLUMN.defaultBlockState()
					|| (world.getBlockState(new BlockPos(x, y, z))) == Blocks.LAVA.defaultBlockState() || (world.getBlockState(new BlockPos(x, y, z))) == Blocks.LAVA.defaultBlockState()
					|| (world.getBlockState(new BlockPos(x, y, z))) == Blocks.WATER.defaultBlockState()) == true) {
				if (entity instanceof Player || entity instanceof ServerPlayer) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
					if ((entity.getDirection()) == Direction.EAST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 1.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.NORTH && (entity.getDirection()) == Direction.EAST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 1.5), y, (z - 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2), y, (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2.5), y, (z - 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3), y, (z - 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3.5), y, (z - 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.SOUTH && (entity.getDirection()) == Direction.EAST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 1.5), y, (z + 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2), y, (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 2.5), y, (z + 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3), y, (z + 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x + 3.5), y, (z + 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.NORTH && (entity.getDirection()) == Direction.WEST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 1.5), y, (z - 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2), y, (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2.5), y, (z - 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3), y, (z - 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3.5), y, (z - 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.SOUTH && (entity.getDirection()) == Direction.WEST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 1.5), y, (z + 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2), y, (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2.5), y, (z + 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3), y, (z + 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3.5), y, (z + 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.SOUTH) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z + 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z + 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z + 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z + 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z + 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.NORTH) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z - 1.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z - 2), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z - 2.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z - 3), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo(x, y, (z - 3.5), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					if ((entity.getDirection()) == Direction.WEST) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 1.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 2.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new EvokerFangs(EntityType.EVOKER_FANGS, _level);
							entityToSpawn.moveTo((x - 3.5), y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				} else if ((entity.getDirection()) == Direction.UP) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
				} else if ((entity.getDirection()) == Direction.DOWN) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 30));
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
