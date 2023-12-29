package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

public class AnemometerDopolnitielnaiaInformatsiiaProcedure {
	public static String execute(LevelAccessor world) {
		return WorldExpansionModVariables.MapVariables.get(world).Wind;
	}
}
