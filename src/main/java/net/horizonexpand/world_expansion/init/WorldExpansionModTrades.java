
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class WorldExpansionModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(WorldExpansionModBlocks.BAOBAB_SAPLING.get()), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(WorldExpansionModBlocks.TIGER_ALOE_VERA.get()), 8, 5, 0.1f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Blocks.CARVED_PUMPKIN), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(Items.ECHO_SHARD), 5, 5, 0.5f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.HONEY_BOTTLE), 6, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(Items.EXPERIENCE_BOTTLE), 4, 5, 0.55f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(WorldExpansionModItems.COPPER_HORN7.get()), 2, 5, 0.2f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(WorldExpansionModItems.BRUTE_ARMOR_TRIM_SMITHING_TEMPLATE.get()), new ItemStack(Items.EMERALD, 16), 4, 8, 0f));
	}
}
