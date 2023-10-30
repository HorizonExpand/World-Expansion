package net.horizonexpand.world_expansion.procedures;

public class BaobabSaplingUsloviieUspiekhaKostnoiMukiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			return true;
		}
		return false;
	}
}
