package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class DyeConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double item1Count = 0;
		double slotCount = 0;
		double airCount = 0;
		double slot = 0;
		slotCount = 9;
		item1Count = 0;
		slot = 0;
		for (int index0 = 0; index0 < (int) slotCount; index0++) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY)
					.getItem() == WorldExpansionModBlocks.ASTILBA_MULTICOLORED.get().asItem()) {
				item1Count = item1Count + 1;
			}
			slot = slot + 1;
		}
		slot = 0;
		for (int index1 = 0; index1 < (int) slotCount; index1++) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) slot)).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
				airCount = airCount + 1;
			}
			slot = slot + 1;
		}
		return item1Count == 1 && airCount == slotCount - 1;
	}
}
