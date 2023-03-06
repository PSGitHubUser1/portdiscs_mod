
package net.mojang.portdiscs.network;

import net.mojang.portdiscs.world.inventory.MusicBoxGUIMenu;
import net.mojang.portdiscs.procedures.SleighRunProcedure;
import net.mojang.portdiscs.procedures.ShriekerRunProcedure;
import net.mojang.portdiscs.procedures.RaidersRunProcedure;
import net.mojang.portdiscs.procedures.OvertuneRunProcedure;
import net.mojang.portdiscs.procedures.OchreRunProcedure;
import net.mojang.portdiscs.procedures.NothernLightsRunProcedure;
import net.mojang.portdiscs.procedures.NEXTGUIClickProcedure;
import net.mojang.portdiscs.procedures.LuminousRunProcedure;
import net.mojang.portdiscs.procedures.LightningProcedure;
import net.mojang.portdiscs.procedures.HuskRunProcedure;
import net.mojang.portdiscs.procedures.GuardianRunProcedure;
import net.mojang.portdiscs.procedures.GlideRunProcedure;
import net.mojang.portdiscs.procedures.ForestRunProcedure;
import net.mojang.portdiscs.procedures.CometRunProcedure;
import net.mojang.portdiscs.procedures.CascadeRunProcedure;
import net.mojang.portdiscs.procedures.BruteRunProcedure;
import net.mojang.portdiscs.procedures.AliveRunProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class MusicBoxGUIButtonMessage extends FriendlyByteBuf {
	public MusicBoxGUIButtonMessage(int buttonID, int x, int y, int z) {
		super(Unpooled.buffer());
		writeInt(buttonID);
		writeInt(x);
		writeInt(y);
		writeInt(z);
	}

	public static void apply(MinecraftServer server, ServerPlayer entity, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
		int buttonID = buf.readInt();
		double x = buf.readInt();
		double y = buf.readInt();
		double z = buf.readInt();
		server.execute(() -> {
			Level world = entity.getLevel();
			HashMap guistate = MusicBoxGUIMenu.guistate;
			if (buttonID == 0) {

				AliveRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 1) {

				BruteRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 2) {

				CascadeRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 3) {

				CometRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 4) {

				NEXTGUIClickProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
			}
			if (buttonID == 5) {

				ForestRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 6) {

				GlideRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 7) {

				GuardianRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 8) {

				HuskRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 9) {

				LightningProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 10) {

				LuminousRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 11) {

				NothernLightsRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 12) {

				OchreRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 13) {

				OvertuneRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 14) {

				RaidersRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 15) {

				ShriekerRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 16) {

				SleighRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
		});
	}
}
