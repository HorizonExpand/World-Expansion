
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.horizonexpand.world_expansion.world.features.BaobabFeature;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, WorldExpansionMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> BAOBAB = REGISTRY.register("baobab", BaobabFeature::new);
}
