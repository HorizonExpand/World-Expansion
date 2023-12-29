
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.horizonexpand.world_expansion.client.renderer.PieceOfSnowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorldExpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorldExpansionModEntities.TUMBLEWEED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.PIECE_OF_SNOW.get(), PieceOfSnowRenderer::new);
	}
}
