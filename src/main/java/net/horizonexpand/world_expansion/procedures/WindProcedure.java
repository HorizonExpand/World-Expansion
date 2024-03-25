package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WindProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
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
