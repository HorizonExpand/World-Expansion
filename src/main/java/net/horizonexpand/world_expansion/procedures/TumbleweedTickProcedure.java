package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class TumbleweedTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("South")) {
			if (((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)))) > ((-3)) && ((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)))) < (8)
					&& WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)), z - 1))
					&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)), z - 1))).is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)), z - 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 1)) > 8) {
				if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)) > 16) {
					if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)) > 24) {
						if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 4)) < 33) {
							if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 4)), z - 4))
									&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 4)), z - 4)))
											.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
								world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 4)), z - 4), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)), z - 3))
							&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)), z - 3)))
									.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
						world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)), z - 3), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2))
						&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2)))
								.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
					world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("North")) {
			if (((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)))) > ((-3)) && ((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)))) < (8)
					&& WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)), z + 1))
					&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)), z + 1))).is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)), z + 1), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 1)) > 8) {
				if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)) > 16) {
					if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)) > 24) {
						if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 4)) < 33) {
							if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 4)), z + 4))
									&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 4)), z + 4)))
											.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
								world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 4)), z + 4), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3))
							&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3)))
									.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
						world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2))
						&& (world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2)))
								.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
					world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("West")) {
			if (((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z))) > ((-3)) && ((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z))) < (8)
					&& WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z), z))
					&& (world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z), z))).is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) z) > 8) {
				if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z) > 16) {
					if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z) > 24) {
						if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) z) < 33) {
							if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) z), z))
									&& (world.getBlockState(BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) z), z)))
											.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
								world.setBlock(BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 4), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z), z))
							&& (world.getBlockState(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z), z)))
									.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
						world.setBlock(BlockPos.containing(x + 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z))
						&& (world.getBlockState(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z)))
								.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
					world.setBlock(BlockPos.containing(x + 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("East")) {
			if (((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z))) > ((-3)) && ((y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z))) < (8)
					&& WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z), z))
					&& (world.getBlockState(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z), z))).is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
				world.setBlock(BlockPos.containing(x - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) z) > 8) {
				if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z) > 16) {
					if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z) > 24) {
						if (y - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z) < 33) {
							if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z), z))
									&& (world.getBlockState(BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z), z)))
											.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
								world.setBlock(BlockPos.containing(x - 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z), z))
							&& (world.getBlockState(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z), z)))
									.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
						world.setBlock(BlockPos.containing(x - 3, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else if (WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState().canSurvive(world, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z), z))
						&& (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z), z)))
								.is(BlockTags.create(new ResourceLocation("world_expansion:tumbleweed_replaceable")))) {
					world.setBlock(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) z), z), WorldExpansionModBlocks.TUMBLEWEED.get().defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}
}
