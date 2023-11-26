package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.HangingBottleWitnMiniFirefliesBlockModel;
import net.horizonexpand.world_expansion.block.entity.HangingBottleWitnMiniFirefliesTileEntity;

public class HangingBottleWitnMiniFirefliesTileRenderer extends GeoBlockRenderer<HangingBottleWitnMiniFirefliesTileEntity> {
	public HangingBottleWitnMiniFirefliesTileRenderer() {
		super(new HangingBottleWitnMiniFirefliesBlockModel());
	}

	@Override
	public RenderType getRenderType(HangingBottleWitnMiniFirefliesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
