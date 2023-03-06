
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.item.WardenRunTenmItem;
import net.mojang.portdiscs.item.UnderscoreTenmItem;
import net.mojang.portdiscs.item.TimeTenmItem;
import net.mojang.portdiscs.item.TheWitherTenmItem;
import net.mojang.portdiscs.item.TheEnderDragonTenmItem;
import net.mojang.portdiscs.item.TenKSpecialItem;
import net.mojang.portdiscs.item.StrideItem;
import net.mojang.portdiscs.item.StormTenmItem;
import net.mojang.portdiscs.item.StaffOfTrappedSoulsItem;
import net.mojang.portdiscs.item.StaffOfDarkWoodsItem;
import net.mojang.portdiscs.item.SoullessTenmItem;
import net.mojang.portdiscs.item.SnowstormTenmItem;
import net.mojang.portdiscs.item.SleighTenmItem;
import net.mojang.portdiscs.item.ShulkerTenmItem;
import net.mojang.portdiscs.item.ShriekerItem;
import net.mojang.portdiscs.item.ShriekerBruteItem;
import net.mojang.portdiscs.item.RaidersItem;
import net.mojang.portdiscs.item.PumpkinTenmItem;
import net.mojang.portdiscs.item.OvertuneItem;
import net.mojang.portdiscs.item.OchreTenmItem;
import net.mojang.portdiscs.item.NothernLightsTenmItem;
import net.mojang.portdiscs.item.LuminousTenmItem;
import net.mojang.portdiscs.item.LightingTenmItem;
import net.mojang.portdiscs.item.LeaveShooterItem;
import net.mojang.portdiscs.item.LeaveItem;
import net.mojang.portdiscs.item.HuskTenmItem;
import net.mojang.portdiscs.item.GuardianTenmItem;
import net.mojang.portdiscs.item.GlideTenmItem;
import net.mojang.portdiscs.item.ForestTenmItem;
import net.mojang.portdiscs.item.CometTenmItem;
import net.mojang.portdiscs.item.CitrineItem;
import net.mojang.portdiscs.item.CascadeTenmItem;
import net.mojang.portdiscs.item.BruteTenmItem;
import net.mojang.portdiscs.item.BadOmenRealItem;
import net.mojang.portdiscs.item.AlldiscItem;
import net.mojang.portdiscs.item.AlivetenmItem;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PortdiscsModItems {
	public static Item ALIVETENM;
	public static Item BAD_OMEN_TENM;
	public static Item BRUTE_TENM;
	public static Item CASCADE_TENM;
	public static Item CITRINE;
	public static Item CITRINEBLOCK;
	public static Item CITRINEORE;
	public static Item COMET_TENM;
	public static Item COMPRESSED_CITRINE;
	public static Item FOREST_TENM;
	public static Item GLIDE_TENM;
	public static Item GUARDIAN_TENM;
	public static Item HUSK_TENM;
	public static Item LIGHTNING_TENM;
	public static Item LUMINOUS_TENM;
	public static Item NOTHERN_LIGHTS_TENM;
	public static Item OCHRE_TENM;
	public static Item OVERTUNE_TENM;
	public static Item PUMPKIN_TENM;
	public static Item RAIDERS_TENM;
	public static Item SHRIEKER_TENM;
	public static Item SHRIEKER_BRUTE;
	public static Item SHULKER_TENM;
	public static Item SLEIGH_TENM;
	public static Item SNOWSTORM_TENM;
	public static Item SOUL_SEEKER_SPAWN_EGG;
	public static Item SOUL_SEEKER_HEAD;
	public static Item SOULFISH_SPAWN_EGG;
	public static Item SOULLESS_TENM;
	public static Item STAFF_OF_DARK_WOODS;
	public static Item STAFF_OF_TRAPPED_SOULS;
	public static Item STRIDE_TENM;
	public static Item THE_ENDER_DRAGON_TENM;
	public static Item THE_WITHER_TENM;
	public static Item THUNDERSTORM_TENM;
	public static Item TIME_TENM;
	public static Item UNDERSCORE_TENM;
	public static Item WARDEN_RUN_TENM;
	public static Item MUSIC_BOX;
	public static Item MASHUP_DISC;
	public static Item ALLDISC;
	public static Item LEAVE;
	public static Item LEAVE_SHOOTER;

	public static void load() {
		ALIVETENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "alivetenm"), new AlivetenmItem());
		BAD_OMEN_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "bad_omen_tenm"), new BadOmenRealItem());
		BRUTE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "brute_tenm"), new BruteTenmItem());
		CASCADE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "cascade_tenm"), new CascadeTenmItem());
		CITRINE = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "citrine"), new CitrineItem());
		CITRINEBLOCK = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "citrineblock"), new BlockItem(PortdiscsModBlocks.CITRINEBLOCK, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		CITRINEORE = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "citrineore"), new BlockItem(PortdiscsModBlocks.CITRINEORE, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		COMET_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "comet_tenm"), new CometTenmItem());
		COMPRESSED_CITRINE = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "compressed_citrine"), new BlockItem(PortdiscsModBlocks.COMPRESSED_CITRINE, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		FOREST_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "forest_tenm"), new ForestTenmItem());
		GLIDE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "glide_tenm"), new GlideTenmItem());
		GUARDIAN_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "guardian_tenm"), new GuardianTenmItem());
		HUSK_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "husk_tenm"), new HuskTenmItem());
		LIGHTNING_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "lightning_tenm"), new LightingTenmItem());
		LUMINOUS_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "luminous_tenm"), new LuminousTenmItem());
		NOTHERN_LIGHTS_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "nothern_lights_tenm"), new NothernLightsTenmItem());
		OCHRE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "ochre_tenm"), new OchreTenmItem());
		OVERTUNE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "overtune_tenm"), new OvertuneItem());
		PUMPKIN_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "pumpkin_tenm"), new PumpkinTenmItem());
		RAIDERS_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "raiders_tenm"), new RaidersItem());
		SHRIEKER_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "shrieker_tenm"), new ShriekerItem());
		SHRIEKER_BRUTE = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "shrieker_brute"), new ShriekerBruteItem());
		SHULKER_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "shulker_tenm"), new ShulkerTenmItem());
		SLEIGH_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "sleigh_tenm"), new SleighTenmItem());
		SNOWSTORM_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "snowstorm_tenm"), new SnowstormTenmItem());
		SOUL_SEEKER_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "soul_seeker_spawn_egg"),
				new SpawnEggItem(PortdiscsModEntities.SOUL_SEEKER, -14869219, -16745626, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		SOUL_SEEKER_HEAD = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "soul_seeker_head"), new BlockItem(PortdiscsModBlocks.SOUL_SEEKER_HEAD, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		SOULFISH_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "soulfish_spawn_egg"),
				new SpawnEggItem(PortdiscsModEntities.SOULFISH, -13423563, -16736610, new Item.Properties().tab(PortdiscsModTabs.TAB_INFOYS_PORTDISCS_MOD)));
		SOULLESS_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "soulless_tenm"), new SoullessTenmItem());
		STAFF_OF_DARK_WOODS = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "staff_of_dark_woods"), new StaffOfDarkWoodsItem());
		STAFF_OF_TRAPPED_SOULS = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "staff_of_trapped_souls"), new StaffOfTrappedSoulsItem());
		STRIDE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "stride_tenm"), new StrideItem());
		THE_ENDER_DRAGON_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "the_ender_dragon_tenm"), new TheEnderDragonTenmItem());
		THE_WITHER_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "the_wither_tenm"), new TheWitherTenmItem());
		THUNDERSTORM_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "thunderstorm_tenm"), new StormTenmItem());
		TIME_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "time_tenm"), new TimeTenmItem());
		UNDERSCORE_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "underscore_tenm"), new UnderscoreTenmItem());
		WARDEN_RUN_TENM = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "warden_run_tenm"), new WardenRunTenmItem());
		MUSIC_BOX = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "music_box"), new BlockItem(PortdiscsModBlocks.MUSIC_BOX, new Item.Properties().tab(null)));
		MASHUP_DISC = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "mashup_disc"), new TenKSpecialItem());
		ALLDISC = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "alldisc"), new AlldiscItem());
		LEAVE = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "leave"), new LeaveItem());
		LEAVE_SHOOTER = Registry.register(Registry.ITEM, new ResourceLocation(PortdiscsMod.MODID, "leave_shooter"), new LeaveShooterItem());
	}
}
