
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.horizonexpand.world_expansion.client.gui.TheCoordinateTemplateForSnowCannonGUIScreen;
import net.horizonexpand.world_expansion.client.gui.SnowCannonGUIScreen;
import net.horizonexpand.world_expansion.client.gui.MultiCraftingTableGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorldExpansionModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WorldExpansionModMenus.MULTI_CRAFTING_TABLE_GUI_COPPER_HORN.get(), MultiCraftingTableGUIScreen::new);
			MenuScreens.register(WorldExpansionModMenus.SNOW_CANNON_GUI.get(), SnowCannonGUIScreen::new);
			MenuScreens.register(WorldExpansionModMenus.THE_COORDINATE_TEMPLATE_FOR_SNOW_CANNON_GUI.get(), TheCoordinateTemplateForSnowCannonGUIScreen::new);
		});
	}
}
