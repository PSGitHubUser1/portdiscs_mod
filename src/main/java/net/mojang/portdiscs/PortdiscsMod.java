/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mojang.portdiscs;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mojang.portdiscs.init.PortdiscsModTabs;
import net.mojang.portdiscs.init.PortdiscsModSounds;
import net.mojang.portdiscs.init.PortdiscsModProcedures;
import net.mojang.portdiscs.init.PortdiscsModMenus;
import net.mojang.portdiscs.init.PortdiscsModItems;
import net.mojang.portdiscs.init.PortdiscsModFeatures;
import net.mojang.portdiscs.init.PortdiscsModEntities;
import net.mojang.portdiscs.init.PortdiscsModBlocks;

import net.minecraft.nbt.CompoundTag;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.api.ModInitializer;

public class PortdiscsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "portdiscs";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PortdiscsMod");
		PortdiscsModTabs.load();

		PortdiscsModEntities.load();
		PortdiscsModBlocks.load();
		PortdiscsModItems.load();

		PortdiscsModFeatures.load();

		PortdiscsModProcedures.load();

		PortdiscsModMenus.load();

		PortdiscsModSounds.load();

		GeckoLib.initialize();
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if (handler.getPlayer().getExtraCustomData().getCompound("PlayerPersisted").isEmpty()) {
				handler.getPlayer().getExtraCustomData().put("PlayerPersisted", new CompoundTag());
			}
			PortdiscsMod.LOGGER.info(handler.getPlayer().getExtraCustomData());
		});
	}
}
