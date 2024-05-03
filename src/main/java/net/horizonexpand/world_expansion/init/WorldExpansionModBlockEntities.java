
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.horizonexpand.world_expansion.block.entity.SuspiciousMudBlockEntity;
import net.horizonexpand.world_expansion.block.entity.SnowCannonBaseBlockEntity;
import net.horizonexpand.world_expansion.block.entity.MultiCraftingTableBlockEntity;
import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;
import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SUSPICIOUS_MUD = register("suspicious_mud", WorldExpansionModBlocks.SUSPICIOUS_MUD, SuspiciousMudBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MULTI_CRAFTING_TABLE = register("multi_crafting_table", WorldExpansionModBlocks.MULTI_CRAFTING_TABLE, MultiCraftingTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CANNON_BASE = register("cannon_base", WorldExpansionModBlocks.CANNON_BASE, SnowCannonBaseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BottleTileEntity>> BOTTLE = REGISTRY.register("bottle", () -> BlockEntityType.Builder.of(BottleTileEntity::new, WorldExpansionModBlocks.BOTTLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BottleWithMiniFirefliesTileEntity>> BOTTLE_WITH_MINI_FIREFLIES = REGISTRY.register("bottle_with_mini_fireflies",
			() -> BlockEntityType.Builder.of(BottleWithMiniFirefliesTileEntity::new, WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
