package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class Baobab2DopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Baobab2SpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
