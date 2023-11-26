package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.HangingBottleTileEntity;

public class HangingBottleBlockModel extends GeoModel<HangingBottleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HangingBottleTileEntity animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HangingBottleTileEntity animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HangingBottleTileEntity entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_top.png");
	}
}
