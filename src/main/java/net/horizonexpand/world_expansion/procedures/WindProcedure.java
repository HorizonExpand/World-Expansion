package net.horizonexpand.world_expansion.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WindProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.dayTime() % 4000 == 0) {
			if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
				WorldExpansionModVariables.MapVariables.get(world).Wind = "North";
				WorldExpansionModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
				WorldExpansionModVariables.MapVariables.get(world).Wind = "South";
				WorldExpansionModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
				WorldExpansionModVariables.MapVariables.get(world).Wind = "West";
				WorldExpansionModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 4) {
				WorldExpansionModVariables.MapVariables.get(world).Wind = "East";
				WorldExpansionModVariables.MapVariables.get(world).syncData(world);
			} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 5) {
				WorldExpansionModVariables.MapVariables.get(world).Wind = "Still";
				WorldExpansionModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
