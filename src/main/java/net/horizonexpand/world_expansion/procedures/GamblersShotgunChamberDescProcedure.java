package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class GamblersShotgunChamberDescProcedure {
	public static String execute(ItemStack itemstack) {
		return "\u00A77" + new java.text.DecimalFormat("#").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total")) + " / 7";
	}
}
