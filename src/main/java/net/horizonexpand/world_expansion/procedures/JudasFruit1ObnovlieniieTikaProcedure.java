package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class JudasFruit1ObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) != 2) {
			if (Math.random() < 0.3) {
				{
					int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3)
							: -1) + 1);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else {
			if (WorldExpansionModBlocks.BAOBAB_SAPLING.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				{
					BlockPos _pos = BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), WorldExpansionModBlocks.BAOBAB_SAPLING.get().defaultBlockState(), 3);
			} else {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
