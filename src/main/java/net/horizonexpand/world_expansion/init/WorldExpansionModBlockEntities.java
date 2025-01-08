
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.horizonexpand.world_expansion.block.entity.SuspiciousMudBlockEntity;
import net.horizonexpand.world_expansion.block.entity.MultiCraftingTableBlockEntity;
import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;
import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WorldExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, WorldExpansionMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SUSPICIOUS_MUD = register("suspicious_mud", WorldExpansionModBlocks.SUSPICIOUS_MUD, SuspiciousMudBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MULTI_CRAFTING_TABLE = register("multi_crafting_table", WorldExpansionModBlocks.MULTI_CRAFTING_TABLE, MultiCraftingTableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BOTTLE = register("bottle", WorldExpansionModBlocks.BOTTLE, BottleTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BOTTLE_WITH_MINI_FIREFLIES = register("bottle_with_mini_fireflies", WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES, BottleWithMiniFirefliesTileEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SUSPICIOUS_MUD.get(), (blockEntity, side) -> ((SuspiciousMudBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MULTI_CRAFTING_TABLE.get(), (blockEntity, side) -> ((MultiCraftingTableBlockEntity) blockEntity).getItemHandler());
	}
}
