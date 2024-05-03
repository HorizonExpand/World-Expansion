
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.horizonexpand.world_expansion.world.features.BaobabFeature;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber
public class WorldExpansionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WorldExpansionMod.MODID);
	public static final RegistryObject<Feature<?>> BAOBAB = REGISTRY.register("baobab", BaobabFeature::new);
}
