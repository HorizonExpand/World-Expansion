package net.horizonexpand.world_expansion.procedures;

public class Baobab9DopProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Baobab9SpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
