package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class Baobab5DopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Baobab5SpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
