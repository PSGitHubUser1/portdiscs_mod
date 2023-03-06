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

import net.mojang.portdiscs.init.PortdiscsModScreens;
import net.mojang.portdiscs.init.PortdiscsModModels;
import net.mojang.portdiscs.init.PortdiscsModEntityRenderers;
import net.mojang.portdiscs.init.PortdiscsModBlocks;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		PortdiscsModBlocks.clientLoad();
		PortdiscsModScreens.load();
		PortdiscsModModels.load();
		PortdiscsModEntityRenderers.load();

	}
}
