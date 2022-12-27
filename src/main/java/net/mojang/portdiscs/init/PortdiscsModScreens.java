
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.client.gui.MusicBoxGUIScreen;
import net.mojang.portdiscs.client.gui.MusicBoxGUI2Screen;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class PortdiscsModScreens {
	public static void load() {
		ScreenRegistry.register(PortdiscsModMenus.MUSIC_BOX_GUI, MusicBoxGUIScreen::new);
		ScreenRegistry.register(PortdiscsModMenus.MUSIC_BOX_GUI_2, MusicBoxGUI2Screen::new);
	}
}
