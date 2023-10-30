package net.horizonexpand.world_expansion.procedures;

public class Baobab4DopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Baobab4SpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
