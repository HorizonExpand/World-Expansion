package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.BottleWithMiniFirefliesDisplayModel;
import net.horizonexpand.world_expansion.block.display.BottleWithMiniFirefliesDisplayItem;

public class BottleWithMiniFirefliesDisplayItemRenderer extends GeoItemRenderer<BottleWithMiniFirefliesDisplayItem> {
	public BottleWithMiniFirefliesDisplayItemRenderer() {
		super(new BottleWithMiniFirefliesDisplayModel());
	}

	@Override
	public RenderType getRenderType(BottleWithMiniFirefliesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
