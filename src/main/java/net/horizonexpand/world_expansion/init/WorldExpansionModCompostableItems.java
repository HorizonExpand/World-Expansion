
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldExpansionModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.ASTILBA.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.ASTILBA_MULTICOLORED.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.BAOBAB_SAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.ALOE_VERA.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.TIGER_ALOE_VERA.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.YELLOW_ASTILBA.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModItems.JUDAS_FRUIT.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModItems.SPLIT_JUDAS_FRUIT.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModItems.LEAVE_OF_ALOE_VERA.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModItems.TUMBLEWEED_ITEM.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WorldExpansionModBlocks.BAOBAB_LEAVES.get().asItem(), 0.3f);
	}
}
