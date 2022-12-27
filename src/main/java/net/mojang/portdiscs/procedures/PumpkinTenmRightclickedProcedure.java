package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModItems;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.Map;

public class PumpkinTenmRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure PumpkinTenmRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double eightyfive = 0;
		eightyfive = Math.random();
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.PUMPKIN_TENM)) : false) {
			if (eightyfive < 0.75) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.PUMPKIN);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			} else if (eightyfive < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.PUMPKIN);
					_setstack.setCount(2);
					_player.getInventory().add(_setstack);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.PUMPKIN_PIE);
				_setstack.setCount(8);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
