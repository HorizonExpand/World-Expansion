
package net.horizonexpand.world_expansion.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BaobabLeavesBlock extends LeavesBlock {
	public BaobabLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().mapColor(MapColor.PLANT).sound(SoundType.GRASS).strength(0.2f).noOcclusion().randomTicks().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 10;
	}
}
