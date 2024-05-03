package net.horizonexpand.world_expansion.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlockEntities;
import net.horizonexpand.world_expansion.block.renderer.BottleWithMiniFirefliesTileRenderer;
import net.horizonexpand.world_expansion.block.renderer.BottleTileRenderer;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber(modid = WorldExpansionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(WorldExpansionModBlockEntities.BOTTLE.get(), context -> new BottleTileRenderer());
		event.registerBlockEntityRenderer(WorldExpansionModBlockEntities.BOTTLE_WITH_MINI_FIREFLIES.get(), context -> new BottleWithMiniFirefliesTileRenderer());
	}
}
