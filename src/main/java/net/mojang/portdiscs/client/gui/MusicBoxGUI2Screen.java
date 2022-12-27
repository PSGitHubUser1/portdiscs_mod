
package net.mojang.portdiscs.client.gui;

import net.mojang.portdiscs.world.inventory.MusicBoxGUI2Menu;
import net.mojang.portdiscs.network.MusicBoxGUI2ButtonMessage;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MusicBoxGUI2Screen extends AbstractContainerScreen<MusicBoxGUI2Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MusicBoxGUI2Screen(MusicBoxGUI2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 340;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("portdiscs:textures/screens/music_box_gui_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + -35, this.topPos + -23, 46, 20, Component.literal("PREV"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 0), new MusicBoxGUI2ButtonMessage(0, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 10, 72, 20, Component.literal("Snowstorm"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 1), new MusicBoxGUI2ButtonMessage(1, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 38, 67, 20, Component.literal("Soulless"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 2), new MusicBoxGUI2ButtonMessage(2, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 64, 51, 20, Component.literal("Storm"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 3), new MusicBoxGUI2ButtonMessage(3, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 91, 56, 20, Component.literal("Stride"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 4), new MusicBoxGUI2ButtonMessage(4, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 119, 108, 20, Component.literal("The Ender Dragon"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 5), new MusicBoxGUI2ButtonMessage(5, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 145, 77, 20, Component.literal("The Wither"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 6), new MusicBoxGUI2ButtonMessage(6, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 122, this.topPos + 10, 46, 20, Component.literal("Time"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 7), new MusicBoxGUI2ButtonMessage(7, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 122, this.topPos + 38, 77, 20, Component.literal("Underscore"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 8), new MusicBoxGUI2ButtonMessage(8, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 122, this.topPos + 64, 77, 20, Component.literal("Warden Run"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 9), new MusicBoxGUI2ButtonMessage(9, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 122, this.topPos + 91, 61, 20, Component.literal("Pumpkin"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui2_button_" + 10), new MusicBoxGUI2ButtonMessage(10, x, y, z));
		}));
	}

	public static void screenInit() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_0"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_1"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_2"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_3"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_4"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_5"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_6"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_7"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_8"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_9"),
				MusicBoxGUI2ButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui2_button_10"),
				MusicBoxGUI2ButtonMessage::apply);
	}
}
