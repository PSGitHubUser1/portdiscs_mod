
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
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class PortdiscsModMenus {
	public static MenuType<MusicBoxGUIMenu> MUSIC_BOX_GUI;
	public static MenuType<MusicBoxGUI2Menu> MUSIC_BOX_GUI_2;

	public static void load() {
		MUSIC_BOX_GUI = Registry.register(Registry.MENU, new ResourceLocation(PortdiscsMod.MODID, "music_box_gui"), new ExtendedScreenHandlerType<>(MusicBoxGUIMenu::new));
		MusicBoxGUIScreen.screenInit();
		MUSIC_BOX_GUI_2 = Registry.register(Registry.MENU, new ResourceLocation(PortdiscsMod.MODID, "music_box_gui_2"), new ExtendedScreenHandlerType<>(MusicBoxGUI2Menu::new));
		MusicBoxGUI2Screen.screenInit();
	}
}
