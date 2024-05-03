package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.BottleWithMiniFirefliesBlockModel;
import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;

public class BottleWithMiniFirefliesTileRenderer extends GeoBlockRenderer<BottleWithMiniFirefliesTileEntity> {
	public BottleWithMiniFirefliesTileRenderer() {
		super(new BottleWithMiniFirefliesBlockModel());
	}

	@Override
	public RenderType getRenderType(BottleWithMiniFirefliesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
