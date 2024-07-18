
package net.horizonexpand.world_expansion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.horizonexpand.world_expansion.entity.CannonCoordsAreaEntity;
import net.horizonexpand.world_expansion.client.model.Modelcannon_coords_area;

import com.mojang.blaze3d.vertex.PoseStack;

public class CannonCoordsAreaRenderer extends MobRenderer<CannonCoordsAreaEntity, Modelcannon_coords_area<CannonCoordsAreaEntity>> {
	public CannonCoordsAreaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcannon_coords_area(context.bakeLayer(Modelcannon_coords_area.LAYER_LOCATION)), 0f);
	}

	@Override
	protected void scale(CannonCoordsAreaEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(100f, 100f, 100f);
	}

	@Override
	public ResourceLocation getTextureLocation(CannonCoordsAreaEntity entity) {
		return new ResourceLocation("world_expansion:textures/entities/cannon_coords_area.png");
	}
}
