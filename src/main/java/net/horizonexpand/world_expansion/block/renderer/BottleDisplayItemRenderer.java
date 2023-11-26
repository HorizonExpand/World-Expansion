package net.horizonexpand.world_expansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.block.model.BottleDisplayModel;
import net.horizonexpand.world_expansion.block.display.BottleDisplayItem;

public class BottleDisplayItemRenderer extends GeoItemRenderer<BottleDisplayItem> {
	public BottleDisplayItemRenderer() {
		super(new BottleDisplayModel());
	}

	@Override
	public RenderType getRenderType(BottleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
