package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;

import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class GamblersShotgunChamberZnachieniieSvoistvaProcedure {
	public static double execute(ItemStack itemstack) {
		if ((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total"))))
				.equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString())) {
			return 1;
		}
		return 0;
	}
}
