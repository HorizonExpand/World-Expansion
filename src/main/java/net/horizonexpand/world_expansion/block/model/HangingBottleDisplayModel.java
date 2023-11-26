package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.display.HangingBottleDisplayItem;

public class HangingBottleDisplayModel extends GeoModel<HangingBottleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HangingBottleDisplayItem animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingBottleDisplayItem animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingBottleDisplayItem entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_top.png");
	}
}
