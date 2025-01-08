package net.horizonexpand.world_expansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.entity.MiniFirefliesEntity;

public class MiniFirefliesModel extends GeoModel<MiniFirefliesEntity> {
	@Override
	public ResourceLocation getAnimationResource(MiniFirefliesEntity entity) {
		return ResourceLocation.parse("world_expansion:animations/mini_fireflies.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MiniFirefliesEntity entity) {
		return ResourceLocation.parse("world_expansion:geo/mini_fireflies.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MiniFirefliesEntity entity) {
		return ResourceLocation.parse("world_expansion:textures/entities/" + entity.getTexture() + ".png");
	}

}
