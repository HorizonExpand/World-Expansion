
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.horizonexpand.world_expansion.client.gui.MultiCraftingTableGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorldExpansionModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(WorldExpansionModMenus.MULTI_CRAFTING_TABLE_GUI_COPPER_HORN.get(), MultiCraftingTableGUIScreen::new);
	}
}
