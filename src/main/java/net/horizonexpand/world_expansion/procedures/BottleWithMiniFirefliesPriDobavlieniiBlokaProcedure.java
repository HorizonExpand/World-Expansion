package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;

public class BottleWithMiniFirefliesPriDobavlieniiBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!Blocks.TORCH.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = WorldExpansionModEntities.MINI_FIREFLIES.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (!Blocks.TORCH.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z)) && !world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
