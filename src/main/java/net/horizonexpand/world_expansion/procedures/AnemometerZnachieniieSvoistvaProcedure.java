package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

public class AnemometerZnachieniieSvoistvaProcedure {
	public static double execute(LevelAccessor world) {
		if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("North")) {
			return 1;
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("South")) {
			return 2;
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("West")) {
			return 3;
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("East")) {
			return 4;
		}
		return 0;
	}
}
