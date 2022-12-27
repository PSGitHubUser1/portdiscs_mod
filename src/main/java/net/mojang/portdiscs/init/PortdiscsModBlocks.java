
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.block.SoulSeekerHeadBlock;
import net.mojang.portdiscs.block.MusicBoxBlock;
import net.mojang.portdiscs.block.CompressedCitrineBlock;
import net.mojang.portdiscs.block.CitrineoreBlock;
import net.mojang.portdiscs.block.CitrineblockBlock;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PortdiscsModBlocks {
	public static Block CITRINEBLOCK;
	public static Block CITRINEORE;
	public static Block COMPRESSED_CITRINE;
	public static Block SOUL_SEEKER_HEAD;
	public static Block MUSIC_BOX;

	public static void load() {
		CITRINEBLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(PortdiscsMod.MODID, "citrineblock"), new CitrineblockBlock());
		CITRINEORE = Registry.register(Registry.BLOCK, new ResourceLocation(PortdiscsMod.MODID, "citrineore"), new CitrineoreBlock());
		COMPRESSED_CITRINE = Registry.register(Registry.BLOCK, new ResourceLocation(PortdiscsMod.MODID, "compressed_citrine"),
				new CompressedCitrineBlock());
		SOUL_SEEKER_HEAD = Registry.register(Registry.BLOCK, new ResourceLocation(PortdiscsMod.MODID, "soul_seeker_head"), new SoulSeekerHeadBlock());
		MUSIC_BOX = Registry.register(Registry.BLOCK, new ResourceLocation(PortdiscsMod.MODID, "music_box"), new MusicBoxBlock());
	}

	public static void clientLoad() {
		CitrineblockBlock.clientInit();
		CitrineoreBlock.clientInit();
		CompressedCitrineBlock.clientInit();
		SoulSeekerHeadBlock.clientInit();
		MusicBoxBlock.clientInit();
	}
}
