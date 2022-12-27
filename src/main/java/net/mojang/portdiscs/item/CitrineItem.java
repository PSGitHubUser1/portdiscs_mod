
package net.mojang.portdiscs.item;

import net.mojang.portdiscs.init.PortdiscsModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CitrineItem extends Item {
	public CitrineItem() {
		super(new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
