package net.horizonexpand.world_expansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.item.DealersShotgunItem;

public class DealersShotgunItemModel extends GeoModel<DealersShotgunItem> {
	@Override
	public ResourceLocation getAnimationResource(DealersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "animations/dealers_shotgun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DealersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "geo/dealers_shotgun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DealersShotgunItem animatable) {
		return new ResourceLocation("world_expansion", "textures/item/dealers_shotgun.png");
	}
}
