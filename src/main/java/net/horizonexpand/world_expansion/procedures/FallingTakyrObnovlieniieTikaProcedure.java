package net.horizonexpand.world_expansion.procedures;

public class FallingTakyrObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}
