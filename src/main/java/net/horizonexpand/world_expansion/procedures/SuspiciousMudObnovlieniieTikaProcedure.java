package net.horizonexpand.world_expansion.procedures;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class SuspiciousMudObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x, y, z), WorldExpansionModBlocks.FALLING_SUSPICIOUS_MUD.get().defaultBlockState());
		}
	}
}
