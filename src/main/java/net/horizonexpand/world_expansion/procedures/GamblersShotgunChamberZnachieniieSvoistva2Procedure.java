package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;

import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class GamblersShotgunChamberZnachieniieSvoistva2Procedure {
	public static double execute(ItemStack itemstack) {
		if ((itemstack.getOrCreateTag().getString(("" + itemstack.getOrCreateTag().getDouble("total")))).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString())) {
			return 1;
		}
		return 0;
	}
}
