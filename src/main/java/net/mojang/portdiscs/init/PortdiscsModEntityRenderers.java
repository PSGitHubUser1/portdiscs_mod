
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.client.renderer.StaffMinionRenderer;
import net.mojang.portdiscs.client.renderer.SoulfishRenderer;
import net.mojang.portdiscs.client.renderer.SoulSeekerRenderer;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PortdiscsModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(PortdiscsModEntities.SOUL_SEEKER, SoulSeekerRenderer::new);
		EntityRendererRegistry.register(PortdiscsModEntities.SOULFISH, SoulfishRenderer::new);
		EntityRendererRegistry.register(PortdiscsModEntities.STAFF_OF_TRAPPED_SOULS, ThrownItemRenderer::new);
		EntityRendererRegistry.register(PortdiscsModEntities.LEAVE_SHOOTER, ThrownItemRenderer::new);
		EntityRendererRegistry.register(PortdiscsModEntities.STAFF_MINION, StaffMinionRenderer::new);
	}
}
