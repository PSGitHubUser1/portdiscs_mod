package net.mojang.portdiscs.procedures;

import net.mojang.portdiscs.init.PortdiscsModItems;
import net.mojang.portdiscs.init.PortdiscsModBlocks;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class UnlockRecipeKeyOnKeyPressedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PortdiscsMod.LOGGER.warn("Failed to load dependency entity for procedure UnlockRecipeKeyOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.CITRINE)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:citrine_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:compressed_citrine_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:staff_recipe_2")});
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModBlocks.SOUL_SEEKER_HEAD))
				: false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:staff_recipe_1")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.NETHERITE_INGOT)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:staff_recipe_1")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:strom_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.GLOWSTONE)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:ochre_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.DIAMOND)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:warden_run_recipe")});
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.BRUTE_TENM)) : false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.SHRIEKER_TENM))
						: false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.BRUTE_TENM))
						: false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PortdiscsModItems.SHRIEKER_TENM))
								: false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:shriekxbrute")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.NETHER_STAR)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:wither_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.OBSIDIAN)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("portdiscs:ender_dragon_recipe")});
		}
	}
}
