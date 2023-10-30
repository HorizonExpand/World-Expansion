package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class TumbleweedProjectileKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
		}
	}
}
