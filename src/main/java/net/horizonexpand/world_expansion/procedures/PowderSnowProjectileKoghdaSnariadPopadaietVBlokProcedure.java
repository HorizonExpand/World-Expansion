package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class PowderSnowProjectileKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.POWDER_SNOW.defaultBlockState()));
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WorldExpansionModBlocks.CANNON_BARREL.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:replaceable")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.POWDER_SNOW.defaultBlockState(), 3);
			}
		}
	}
}
