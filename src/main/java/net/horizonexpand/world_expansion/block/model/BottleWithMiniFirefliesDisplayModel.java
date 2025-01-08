package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.display.BottleWithMiniFirefliesDisplayItem;

public class BottleWithMiniFirefliesDisplayModel extends GeoModel<BottleWithMiniFirefliesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BottleWithMiniFirefliesDisplayItem animatable) {
		return ResourceLocation.parse("world_expansion:animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleWithMiniFirefliesDisplayItem animatable) {
		return ResourceLocation.parse("world_expansion:geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleWithMiniFirefliesDisplayItem entity) {
		return ResourceLocation.parse("world_expansion:textures/block/bottle_witn_mini_fireflies.png");
	}
}
