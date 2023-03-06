
package net.mojang.portdiscs.network;

import net.mojang.portdiscs.world.inventory.MusicBoxGUI2Menu;
import net.mojang.portdiscs.procedures.WardenrunRunProcedure;
import net.mojang.portdiscs.procedures.UnderscoreRunProcedure;
import net.mojang.portdiscs.procedures.TimeRunProcedure;
import net.mojang.portdiscs.procedures.TheWitherRunProcedure;
import net.mojang.portdiscs.procedures.TheEnderDragonsusRunProcedure;
import net.mojang.portdiscs.procedures.StrideRunProcedure;
import net.mojang.portdiscs.procedures.StormRunProcedure;
import net.mojang.portdiscs.procedures.SoullessRunProcedure;
import net.mojang.portdiscs.procedures.SnowstormRunProcedure;
import net.mojang.portdiscs.procedures.PumpkinRunProcedure;
import net.mojang.portdiscs.procedures.PREVGUIClickProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class MusicBoxGUI2ButtonMessage extends FriendlyByteBuf {
	public MusicBoxGUI2ButtonMessage(int buttonID, int x, int y, int z) {
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
			HashMap guistate = MusicBoxGUI2Menu.guistate;
			if (buttonID == 0) {

				PREVGUIClickProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).put("entity", entity).build());
			}
			if (buttonID == 1) {

				SnowstormRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 2) {

				SoullessRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 3) {

				StormRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 4) {

				StrideRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 5) {

				TheEnderDragonsusRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 6) {

				TheWitherRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 7) {

				TimeRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 8) {

				UnderscoreRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 9) {

				WardenrunRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
			if (buttonID == 10) {

				PumpkinRunProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
			}
		});
	}
}
