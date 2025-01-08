
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIMenu;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, WorldExpansionMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MultiCraftingTableGUIMenu>> MULTI_CRAFTING_TABLE_GUI_COPPER_HORN = REGISTRY.register("multi_crafting_table_gui_copper_horn",
			() -> IMenuTypeExtension.create(MultiCraftingTableGUIMenu::new));
}
