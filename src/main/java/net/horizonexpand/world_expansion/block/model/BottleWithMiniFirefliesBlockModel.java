package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;

public class BottleWithMiniFirefliesBlockModel extends GeoModel<BottleWithMiniFirefliesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BottleWithMiniFirefliesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("world_expansion:animations/bottle.animation.json");
		return ResourceLocation.parse("world_expansion:animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleWithMiniFirefliesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("world_expansion:geo/bottle.geo.json");
		return ResourceLocation.parse("world_expansion:geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleWithMiniFirefliesTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return ResourceLocation.parse("world_expansion:textures/block/bottle_witn_mini_fireflies_top.png");
		return ResourceLocation.parse("world_expansion:textures/block/bottle_witn_mini_fireflies.png");
	}
}
