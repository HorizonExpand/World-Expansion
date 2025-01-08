package net.horizonexpand.world_expansion.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlockEntities;
import net.horizonexpand.world_expansion.block.renderer.BottleWithMiniFirefliesTileRenderer;
import net.horizonexpand.world_expansion.block.renderer.BottleTileRenderer;
import net.horizonexpand.world_expansion.block.entity.BottleWithMiniFirefliesTileEntity;
import net.horizonexpand.world_expansion.block.entity.BottleTileEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@EventBusSubscriber(modid = WorldExpansionMod.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<BottleTileEntity>) WorldExpansionModBlockEntities.BOTTLE.get(), context -> new BottleTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<BottleWithMiniFirefliesTileEntity>) WorldExpansionModBlockEntities.BOTTLE_WITH_MINI_FIREFLIES.get(), context -> new BottleWithMiniFirefliesTileRenderer());
	}
}
