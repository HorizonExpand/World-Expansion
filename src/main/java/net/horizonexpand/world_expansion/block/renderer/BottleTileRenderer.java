package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.BottleBlockModel;
import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;

public class BottleTileRenderer extends GeoBlockRenderer<BottleTileEntity> {
	public BottleTileRenderer() {
		super(new BottleBlockModel());
	}

	@Override
	public RenderType getRenderType(BottleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
