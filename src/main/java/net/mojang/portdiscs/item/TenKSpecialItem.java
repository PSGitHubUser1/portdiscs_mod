
package net.mojang.portdiscs.item;

import net.mojang.portdiscs.init.PortdiscsModSounds;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class TenKSpecialItem extends RecordItem {
	public TenKSpecialItem() {
		super(5, PortdiscsModSounds.MASHUP_TUNE, new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE), 4640);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("All in one.."));
	}
}
