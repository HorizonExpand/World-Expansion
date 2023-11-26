package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.HangingBottleWitnMiniFirefliesTileEntity;

public class HangingBottleWitnMiniFirefliesBlockModel extends GeoModel<HangingBottleWitnMiniFirefliesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HangingBottleWitnMiniFirefliesTileEntity animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle_witn_mini_fireflies.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingBottleWitnMiniFirefliesTileEntity animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle_witn_mini_fireflies.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingBottleWitnMiniFirefliesTileEntity entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_witn_mini_fireflies_top.png");
	}
}
