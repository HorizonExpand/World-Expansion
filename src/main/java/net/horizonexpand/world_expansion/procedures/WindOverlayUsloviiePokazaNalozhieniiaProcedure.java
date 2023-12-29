package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class WindOverlayUsloviiePokazaNalozhieniiaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorldExpansionModItems.WINDOMETER.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorldExpansionModItems.WINDOMETER.get()) {
			return true;
		}
		return false;
	}
}
