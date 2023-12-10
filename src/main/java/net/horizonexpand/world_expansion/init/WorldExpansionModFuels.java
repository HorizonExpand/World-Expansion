
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class WorldExpansionModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_BUTTON.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_DOOR.get().asItem())
			event.setBurnTime(200);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == WorldExpansionModBlocks.BAOBAB_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == WorldExpansionModItems.TUMBLEWEED_ITEM.get())
			event.setBurnTime(100);
	}
}
