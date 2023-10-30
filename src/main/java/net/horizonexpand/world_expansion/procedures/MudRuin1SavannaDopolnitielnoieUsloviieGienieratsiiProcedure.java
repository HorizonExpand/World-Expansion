package net.horizonexpand.world_expansion.procedures;

public class MudRuin1SavannaDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (MudRuin1SavannaSpawnProcedure.execute(world, x, y, z) == true) {
			return true;
		}
		return false;
	}
}
