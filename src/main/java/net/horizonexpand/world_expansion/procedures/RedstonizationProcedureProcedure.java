package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RedstonizationProcedureProcedure {
	@SubscribeEvent
	public static void onBlockMultiPlace(BlockEvent.EntityMultiPlaceEvent event) {
		execute(event, event.getPlacedAgainst(), event.getEntity());
	}

	public static void execute(BlockState placedagainst, Entity entity) {
		execute(null, placedagainst, entity);
	}

	private static void execute(@Nullable Event event, BlockState placedagainst, Entity entity) {
		if (entity == null)
			return;
		if (placedagainst.getBlock() == Blocks.IRON_BLOCK) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("world_expansion:redstonization"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
