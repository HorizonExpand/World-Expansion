
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.horizonexpand.world_expansion.client.renderer.TNTProjectileRenderer;
import net.horizonexpand.world_expansion.client.renderer.ShotgunBlastRenderer;
import net.horizonexpand.world_expansion.client.renderer.PowderSnowProjectileRenderer;
import net.horizonexpand.world_expansion.client.renderer.PieceOfSnowRenderer;
import net.horizonexpand.world_expansion.client.renderer.MiniFirefliesRenderer;
import net.horizonexpand.world_expansion.client.renderer.CannonCoordsAreaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorldExpansionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorldExpansionModEntities.TUMBLEWEED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.SNOW_PROJECTILE.get(), PieceOfSnowRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.TNT_PROJECTILE.get(), TNTProjectileRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.POWDER_SNOW_PROJECTILE.get(), PowderSnowProjectileRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.MINI_FIREFLIES.get(), MiniFirefliesRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.CANNON_COORDS_AREA.get(), CannonCoordsAreaRenderer::new);
		event.registerEntityRenderer(WorldExpansionModEntities.SHOTGUN_BLAST.get(), ShotgunBlastRenderer::new);
	}
}
