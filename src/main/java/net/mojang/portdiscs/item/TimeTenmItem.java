
package net.mojang.portdiscs.item;

import net.mojang.portdiscs.init.PortdiscsModTabs;
import net.mojang.portdiscs.init.PortdiscsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TimeTenmItem extends RecordItem {
	public TimeTenmItem() {
		super(4, PortdiscsModSounds.TIME_T_EN_M, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD).stacksTo(1).rarity(Rarity.RARE), 2980);
	}
}
