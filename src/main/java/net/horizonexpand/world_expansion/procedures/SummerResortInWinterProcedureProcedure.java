package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SummerResortInWinterProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("world_expansion:halloween_forest"))) {
			entity.getPersistentData().putBoolean("halloween_forest", true);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("world_expansion:halloween_dark_forest"))) {
			entity.getPersistentData().putBoolean("halloween_dark_forest", true);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("world_expansion:halloween_plains"))) {
			entity.getPersistentData().putBoolean("halloween_plains", true);
		}
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("world_expansion:halloween_pumpkin_field"))) {
			entity.getPersistentData().putBoolean("halloween_wheat_field", true);
		}
		if (entity.getPersistentData().getBoolean("halloween_forest") == true && entity.getPersistentData().getBoolean("halloween_dark_forest") == true && entity.getPersistentData().getBoolean("halloween_plains") == true
				&& entity.getPersistentData().getBoolean("halloween_wheat_field") == true) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("world_expansion:summer_resort_in_winter"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}
