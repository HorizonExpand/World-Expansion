
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.horizonexpand.world_expansion.block.entity.WindometerBlockEntity;
import net.horizonexpand.world_expansion.block.entity.SuspiciousMudBlockEntity;
import net.horizonexpand.world_expansion.block.entity.SnowCannonBaseBlockEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SUSPICIOUS_MUD = register("suspicious_mud", WorldExpansionModBlocks.SUSPICIOUS_MUD, SuspiciousMudBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CANNON_BASE = register("cannon_base", WorldExpansionModBlocks.CANNON_BASE, SnowCannonBaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WINDOMETER = register("windometer", WorldExpansionModBlocks.WINDOMETER, WindometerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
