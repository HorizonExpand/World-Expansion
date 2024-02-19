package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class PieceOfSnowKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.SNOW_BLOCK.defaultBlockState()));
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WorldExpansionModBlocks.CANNON_BARREL.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:replaceable")))) {
				if (Mth.nextInt(RandomSource.create(), 1, 3) != 3) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SNOW_BLOCK.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SNOW.defaultBlockState(), 3);
				}
			}
		}
	}
}
