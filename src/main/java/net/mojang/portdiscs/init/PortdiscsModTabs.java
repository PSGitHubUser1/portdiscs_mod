
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class PortdiscsModTabs {
	public static CreativeModeTab TAB_INFOYS_PORTDISCS_MOD;

	public static void load() {
		TAB_INFOYS_PORTDISCS_MOD = FabricItemGroupBuilder.create(new ResourceLocation("portdiscs", "infoys_portdiscs_mod")).icon(() -> new ItemStack(PortdiscsModItems.MASHUP_DISC)).build();
	}
}
