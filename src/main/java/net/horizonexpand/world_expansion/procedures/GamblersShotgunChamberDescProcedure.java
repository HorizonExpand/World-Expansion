package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.ItemStack;

public class GamblersShotgunChamberDescProcedure {
	public static String execute(ItemStack itemstack) {
		return new java.text.DecimalFormat("#").format(itemstack.getOrCreateTag().getDouble("total")) + " / 7";
	}
}
