package net.horizonexpand.world_expansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.entity.MiniFireflyEntity;

public class MiniFireflyModel extends GeoModel<MiniFireflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(MiniFireflyEntity entity) {
		return new ResourceLocation("world_expansion", "animations/mini_fireflies.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MiniFireflyEntity entity) {
		return new ResourceLocation("world_expansion", "geo/mini_fireflies.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MiniFireflyEntity entity) {
		return new ResourceLocation("world_expansion", "textures/entities/" + entity.getTexture() + ".png");
	}

}
