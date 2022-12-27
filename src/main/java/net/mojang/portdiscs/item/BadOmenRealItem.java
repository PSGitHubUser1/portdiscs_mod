
package net.mojang.portdiscs.item;

import net.mojang.portdiscs.procedures.BadOmenLivingEntityIsHitWithItemProcedure;
import net.mojang.portdiscs.init.PortdiscsModTabs;
import net.mojang.portdiscs.init.PortdiscsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class BadOmenRealItem extends RecordItem {
	public BadOmenRealItem() {
		super(4, PortdiscsModSounds.BADOMEN, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD).stacksTo(1).rarity(Rarity.RARE),
				2420);
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BadOmenLivingEntityIsHitWithItemProcedure
				.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}
}
