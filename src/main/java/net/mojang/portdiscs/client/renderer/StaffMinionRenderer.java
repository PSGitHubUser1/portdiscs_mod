package net.mojang.portdiscs.client.renderer;

import net.mojang.portdiscs.entity.StaffMinionEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

public class StaffMinionRenderer extends MobRenderer<StaffMinionEntity, SilverfishModel<StaffMinionEntity>> {
	public StaffMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StaffMinionEntity entity) {
		return new ResourceLocation("portdiscs:textures/entities/soulfish.png");
	}
}
