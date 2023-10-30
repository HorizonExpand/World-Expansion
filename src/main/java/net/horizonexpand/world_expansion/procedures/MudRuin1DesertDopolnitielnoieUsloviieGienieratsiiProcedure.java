package net.horizonexpand.world_expansion.procedures;

public class MudRuin1DesertDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (MudRuin1DesertSpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
