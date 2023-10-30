package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class TumbleweedObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 4) == 1) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 2) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y, z)) && world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 4) == 3) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z + 1)) && world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z - 1)) && world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		}
	}
}
