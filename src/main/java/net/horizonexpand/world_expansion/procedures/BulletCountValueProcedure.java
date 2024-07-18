package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class BulletCountValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total")) + "/" + "5";
	}
}
