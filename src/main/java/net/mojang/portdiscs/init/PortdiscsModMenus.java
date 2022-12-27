
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.world.inventory.MusicBoxGUIMenu;
import net.mojang.portdiscs.world.inventory.MusicBoxGUI2Menu;
import net.mojang.portdiscs.client.gui.MusicBoxGUIScreen;
import net.mojang.portdiscs.client.gui.MusicBoxGUI2Screen;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

public class PortdiscsModMenus {
	public static MenuType<MusicBoxGUIMenu> MUSIC_BOX_GUI;
	public static MenuType<MusicBoxGUI2Menu> MUSIC_BOX_GUI_2;

	public static void load() {
		MUSIC_BOX_GUI = ScreenHandlerRegistry.registerExtended(new ResourceLocation(PortdiscsMod.MODID, "music_box_gui"), MusicBoxGUIMenu::new);
		MusicBoxGUIScreen.screenInit();
		MUSIC_BOX_GUI_2 = ScreenHandlerRegistry.registerExtended(new ResourceLocation(PortdiscsMod.MODID, "music_box_gui_2"), MusicBoxGUI2Menu::new);
		MusicBoxGUI2Screen.screenInit();
	}
}
