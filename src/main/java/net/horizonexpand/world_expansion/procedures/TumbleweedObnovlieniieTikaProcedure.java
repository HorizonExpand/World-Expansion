package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class TumbleweedObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("South")) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z - 1))
					&& (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z - 1))
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y - 1, z - 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z - 1))
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z - 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("North")) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z + 1))
					&& (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z + 1))
					&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y - 1, z + 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z + 1))
					&& (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z + 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("West")) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y, z))
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y - 1, z))
					&& (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x + 1, y - 1, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, y + 1, z))
					&& (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x + 1, y + 1, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("East")) {
			if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y, z))
					&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y - 1, z))
					&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x - 1, y - 1, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, y + 1, z))
					&& (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x - 1, y + 1, z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			}
		}
	}
}
