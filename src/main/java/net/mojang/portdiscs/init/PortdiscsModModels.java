
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.client.model.Modelsoulseeker;
import net.mojang.portdiscs.client.model.Modelcustom_model;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PortdiscsModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelsoulseeker.LAYER_LOCATION, Modelsoulseeker::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
