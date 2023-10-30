package net.horizonexpand.world_expansion.procedures;

public class Baobab6DopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Baobab6SpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
