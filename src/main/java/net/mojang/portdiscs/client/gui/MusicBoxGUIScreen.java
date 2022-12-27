
package net.mojang.portdiscs.client.gui;

import net.mojang.portdiscs.world.inventory.MusicBoxGUIMenu;
import net.mojang.portdiscs.network.MusicBoxGUIButtonMessage;
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

public class MusicBoxGUIScreen extends AbstractContainerScreen<MusicBoxGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MusicBoxGUIScreen(MusicBoxGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 340;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("portdiscs:textures/screens/music_box_gui.png");

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
		this.font.draw(poseStack, "Music Box (Click to play the music)", 76, 11, -39424);
		this.font.draw(poseStack, "Play Musics:", 5, 47, -15438370);
		this.font.draw(poseStack, "[Click button another when first music ends!]", 53, 30, -3407821);
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
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 62, 51, 20, Component.literal("Alive"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 0), new MusicBoxGUIButtonMessage(0, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 89, 51, 20, Component.literal("Brute"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 1), new MusicBoxGUIButtonMessage(1, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 114, 61, 20, Component.literal("Cascade"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 2), new MusicBoxGUIButtonMessage(2, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 51, 20, Component.literal("Comet"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 3), new MusicBoxGUIButtonMessage(3, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 331, this.topPos + -23, 46, 20, Component.literal("NEXT"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 4), new MusicBoxGUIButtonMessage(4, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 75, this.topPos + 62, 56, 20, Component.literal("Forest"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 5), new MusicBoxGUIButtonMessage(5, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 75, this.topPos + 89, 51, 20, Component.literal("Glide"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 6), new MusicBoxGUIButtonMessage(6, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 75, this.topPos + 114, 67, 20, Component.literal("Guardian"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 7), new MusicBoxGUIButtonMessage(7, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 75, this.topPos + 142, 46, 20, Component.literal("Husk"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 8), new MusicBoxGUIButtonMessage(8, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 62, 72, 20, Component.literal("Lightning"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 9), new MusicBoxGUIButtonMessage(9, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 89, 67, 20, Component.literal("Luminous"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 10), new MusicBoxGUIButtonMessage(10, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 114, 103, 20, Component.literal("Northern Lights"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 11), new MusicBoxGUIButtonMessage(11, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 150, this.topPos + 142, 51, 20, Component.literal("Ochre"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 12), new MusicBoxGUIButtonMessage(12, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 257, this.topPos + 63, 67, 20, Component.literal("Overtune"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 13), new MusicBoxGUIButtonMessage(13, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 257, this.topPos + 89, 61, 20, Component.literal("Raiders"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 14), new MusicBoxGUIButtonMessage(14, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 257, this.topPos + 114, 67, 20, Component.literal("Shrieker"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 15), new MusicBoxGUIButtonMessage(15, x, y, z));
		}));
		this.addRenderableWidget(new Button(this.leftPos + 257, this.topPos + 142, 56, 20, Component.literal("Sleigh"), e -> {
			if (true)
				ClientPlayNetworking.send(new ResourceLocation("portdiscs:musicboxgui_button_" + 16), new MusicBoxGUIButtonMessage(16, x, y, z));
		}));
	}

	public static void screenInit() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_0"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_1"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_2"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_3"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_4"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_5"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_6"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_7"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_8"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_9"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_10"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_11"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_12"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_13"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_14"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_15"),
				MusicBoxGUIButtonMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(PortdiscsMod.MODID, "musicboxgui_button_16"),
				MusicBoxGUIButtonMessage::apply);
	}
}
