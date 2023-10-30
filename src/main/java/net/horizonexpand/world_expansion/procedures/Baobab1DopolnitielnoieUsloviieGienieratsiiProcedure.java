package net.horizonexpand.world_expansion.procedures;

public class Baobab1DopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (SmallStructureGenProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
