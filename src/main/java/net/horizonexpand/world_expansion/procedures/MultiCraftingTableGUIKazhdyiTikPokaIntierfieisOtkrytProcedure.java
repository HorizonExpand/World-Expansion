package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class MultiCraftingTableGUIKazhdyiTikPokaIntierfieisOtkrytProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double OutputSlot = 0;
		OutputSlot = 9;
		if (DyeConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.parse((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) OutputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (CopperHornConditionProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.parse((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) OutputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) OutputSlot)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
