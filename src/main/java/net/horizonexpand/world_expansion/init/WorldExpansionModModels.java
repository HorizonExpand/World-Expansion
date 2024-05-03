
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.horizonexpand.world_expansion.client.model.Modelpiece_of_powder_snow;
import net.horizonexpand.world_expansion.client.model.Modelengineer_armor_1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WorldExpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpiece_of_powder_snow.LAYER_LOCATION, Modelpiece_of_powder_snow::createBodyLayer);
		event.registerLayerDefinition(Modelengineer_armor_1.LAYER_LOCATION, Modelengineer_armor_1::createBodyLayer);
	}
}
