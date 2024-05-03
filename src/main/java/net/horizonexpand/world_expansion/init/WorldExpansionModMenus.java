
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.horizonexpand.world_expansion.world.inventory.TheCoordinateTemplateForSnowCannonGUIMenu;
import net.horizonexpand.world_expansion.world.inventory.SnowCannonGUIMenu;
import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIMenu;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<MenuType<MultiCraftingTableGUIMenu>> MULTI_CRAFTING_TABLE_GUI_COPPER_HORN = REGISTRY.register("multi_crafting_table_gui_copper_horn", () -> IForgeMenuType.create(MultiCraftingTableGUIMenu::new));
	public static final RegistryObject<MenuType<SnowCannonGUIMenu>> SNOW_CANNON_GUI = REGISTRY.register("snow_cannon_gui", () -> IForgeMenuType.create(SnowCannonGUIMenu::new));
	public static final RegistryObject<MenuType<TheCoordinateTemplateForSnowCannonGUIMenu>> THE_COORDINATE_TEMPLATE_FOR_SNOW_CANNON_GUI = REGISTRY.register("the_coordinate_template_for_snow_cannon_gui",
			() -> IForgeMenuType.create(TheCoordinateTemplateForSnowCannonGUIMenu::new));
}
