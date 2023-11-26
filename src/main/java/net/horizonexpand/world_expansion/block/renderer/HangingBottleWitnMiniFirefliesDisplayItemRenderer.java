package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.HangingBottleWitnMiniFirefliesDisplayModel;
import net.horizonexpand.world_expansion.block.display.HangingBottleWitnMiniFirefliesDisplayItem;

public class HangingBottleWitnMiniFirefliesDisplayItemRenderer extends GeoItemRenderer<HangingBottleWitnMiniFirefliesDisplayItem> {
	public HangingBottleWitnMiniFirefliesDisplayItemRenderer() {
		super(new HangingBottleWitnMiniFirefliesDisplayModel());
	}

	@Override
	public RenderType getRenderType(HangingBottleWitnMiniFirefliesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
