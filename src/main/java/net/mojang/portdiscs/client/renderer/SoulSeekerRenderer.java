package net.mojang.portdiscs.client.renderer;

import net.mojang.portdiscs.entity.SoulSeekerEntity;
import net.mojang.portdiscs.client.model.Modelsoulseeker;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SoulSeekerRenderer extends MobRenderer<SoulSeekerEntity, Modelsoulseeker<SoulSeekerEntity>> {
	public SoulSeekerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsoulseeker(context.bakeLayer(Modelsoulseeker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoulSeekerEntity entity) {
		return new ResourceLocation("portdiscs:textures/entities/soulseekertexturefinal.png");
	}
}
