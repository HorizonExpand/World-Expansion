
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.horizonexpand.world_expansion.client.model.Modelshotgun_blast;
import net.horizonexpand.world_expansion.client.model.Modelengineer_armor_1;
import net.horizonexpand.world_expansion.client.model.Modelder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WorldExpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelshotgun_blast.LAYER_LOCATION, Modelshotgun_blast::createBodyLayer);
		event.registerLayerDefinition(Modelder.LAYER_LOCATION, Modelder::createBodyLayer);
		event.registerLayerDefinition(Modelengineer_armor_1.LAYER_LOCATION, Modelengineer_armor_1::createBodyLayer);
	}
}
