package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MudRuin1BadlandDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (MudRuin1BadlandsSpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
