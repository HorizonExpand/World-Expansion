package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;

public class BottleBlockModel extends GeoModel<BottleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BottleTileEntity animatable) {
		return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleTileEntity animatable) {
		return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleTileEntity entity) {
		return new ResourceLocation("world_expansion", "textures/block/bottle_stayed.png");
	}
}
