package net.horizonexpand.world_expansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;

public class BottleBlockModel extends GeoModel<BottleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BottleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
		return new ResourceLocation("world_expansion", "animations/bottle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BottleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
		return new ResourceLocation("world_expansion", "geo/bottle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BottleTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("world_expansion", "textures/block/bottle_top.png");
		return new ResourceLocation("world_expansion", "textures/block/bottle_stayed.png");
	}
}
