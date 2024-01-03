
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<SimpleParticleType> REDSTONE_ON = REGISTRY.register("redstone_on", () -> new SimpleParticleType(false));
}
