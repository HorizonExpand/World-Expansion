
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.horizonexpand.world_expansion.block.entity.TakyrBlockEntity;
import net.horizonexpand.world_expansion.block.entity.SuspiciousMudBlockEntity;
import net.horizonexpand.world_expansion.block.entity.MultiCraftingTableBlockEntity;
import net.horizonexpand.world_expansion.block.entity.JudasFruit3BlockEntity;
import net.horizonexpand.world_expansion.block.entity.JudasFruit2BlockEntity;
import net.horizonexpand.world_expansion.block.entity.JudasFruit1BlockEntity;
import net.horizonexpand.world_expansion.block.entity.HangingBottleWitnMiniFirefliesTileEntity;
import net.horizonexpand.world_expansion.block.entity.HangingBottleTileEntity;
import net.horizonexpand.world_expansion.block.entity.DryDirtBlockEntity;
import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;
import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;
import net.horizonexpand.world_expansion.block.entity.BaobabSaplingBlockEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SUSPICIOUS_MUD = register("suspicious_mud", WorldExpansionModBlocks.SUSPICIOUS_MUD, SuspiciousMudBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TAKYR = register("takyr", WorldExpansionModBlocks.TAKYR, TakyrBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DRY_DIRT = register("dry_dirt", WorldExpansionModBlocks.DRY_DIRT, DryDirtBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BAOBAB_SAPLING = register("baobab_sapling", WorldExpansionModBlocks.BAOBAB_SAPLING, BaobabSaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BottleTileEntity>> BOTTLE = REGISTRY.register("bottle", () -> BlockEntityType.Builder.of(BottleTileEntity::new, WorldExpansionModBlocks.BOTTLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BottleWithMiniFirefliesTileEntity>> BOTTLE_WITH_MINI_FIREFLIES = REGISTRY.register("bottle_with_mini_fireflies",
			() -> BlockEntityType.Builder.of(BottleWithMiniFirefliesTileEntity::new, WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> JUDAS_FRUIT1 = register("judas_fruit1", WorldExpansionModBlocks.JUDAS_FRUIT1, JudasFruit1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUDAS_FRUIT_2 = register("judas_fruit_2", WorldExpansionModBlocks.JUDAS_FRUIT_2, JudasFruit2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUDAS_FRUIT_3 = register("judas_fruit_3", WorldExpansionModBlocks.JUDAS_FRUIT_3, JudasFruit3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<HangingBottleTileEntity>> HANGING_BOTTLE = REGISTRY.register("hanging_bottle",
			() -> BlockEntityType.Builder.of(HangingBottleTileEntity::new, WorldExpansionModBlocks.HANGING_BOTTLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<HangingBottleWitnMiniFirefliesTileEntity>> HANGING_BOTTLE_WITN_MINI_FIREFLIES = REGISTRY.register("hanging_bottle_witn_mini_fireflies",
			() -> BlockEntityType.Builder.of(HangingBottleWitnMiniFirefliesTileEntity::new, WorldExpansionModBlocks.HANGING_BOTTLE_WITN_MINI_FIREFLIES.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> MULTI_CRAFTING_TABLE = register("multi_crafting_table", WorldExpansionModBlocks.MULTI_CRAFTING_TABLE, MultiCraftingTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
