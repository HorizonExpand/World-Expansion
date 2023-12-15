package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class PieceOfPowderSnowKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WorldExpansionModBlocks.SNOW_CANNON_BARREL.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:replaceable")))) {
				if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
				}
			}
		}
	}
}
