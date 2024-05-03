package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.display.BottleDisplayItem;

public class BottleDisplayModel extends GeoModel<BottleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BottleDisplayItem animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleDisplayItem animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleDisplayItem entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_stayed.png");
	}
}
