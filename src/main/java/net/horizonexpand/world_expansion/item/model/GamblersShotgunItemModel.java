package net.horizonexpand.world_expansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.item.GamblersShotgunItem;

public class GamblersShotgunItemModel extends GeoModel<GamblersShotgunItem> {
	@Override
	public ResourceLocation getAnimationResource(GamblersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "animations/gamblers_shotgun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GamblersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "geo/gamblers_shotgun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GamblersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "textures/item/gamblers_shotgun.png");
	}
}
