
package net.mojang.portdiscs.item;

import net.mojang.portdiscs.procedures.StaffOfTrappedSoulsRangedItemUsedProcedure;
import net.mojang.portdiscs.procedures.StaffOfTrappedSoulsEntitySwingsItemProcedure;
import net.mojang.portdiscs.init.PortdiscsModTabs;
import net.mojang.portdiscs.entity.StaffOfTrappedSoulsEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import java.util.List;

import io.github.fabricators_of_create.porting_lib.item.EntitySwingListenerItem;

public class StaffOfTrappedSoulsItem extends Item implements EntitySwingListenerItem {
	public StaffOfTrappedSoulsItem() {
		super(new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD).durability(2200));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Right Click to teleport"));
		list.add(Component.literal("Shift RC to summon lightning (1 XP level)"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		LevelAccessor world = entity.level;
		StaffOfTrappedSoulsEntitySwingsItemProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world)
				.put("x", x).put("y", y).put("z", z).put("entity", entity).build());
		return false;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				StaffOfTrappedSoulsEntity entityarrow = StaffOfTrappedSoulsEntity.shoot(world, entity, world.getRandom(), 2f, 2, 2);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				StaffOfTrappedSoulsRangedItemUsedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder()
						.put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
			}
		}
	}
}
