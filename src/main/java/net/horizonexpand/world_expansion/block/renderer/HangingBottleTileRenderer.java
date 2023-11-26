package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.HangingBottleBlockModel;
import net.horizonexpand.world_expansion.block.entity.HangingBottleTileEntity;

public class HangingBottleTileRenderer extends GeoBlockRenderer<HangingBottleTileEntity> {
	public HangingBottleTileRenderer() {
		super(new HangingBottleBlockModel());
	}

	@Override
	public RenderType getRenderType(HangingBottleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
