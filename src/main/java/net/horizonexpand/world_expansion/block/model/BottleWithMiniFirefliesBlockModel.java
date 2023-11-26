package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;

public class BottleWithMiniFirefliesBlockModel extends GeoModel<BottleWithMiniFirefliesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BottleWithMiniFirefliesTileEntity animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle_witn_mini_fireflies.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleWithMiniFirefliesTileEntity animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle_witn_mini_fireflies.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleWithMiniFirefliesTileEntity entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_witn_mini_fireflies.png");
	}
}
