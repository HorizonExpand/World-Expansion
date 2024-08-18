
package net.horizonexpand.world_expansion.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class LittleShroomlightBlock extends FlowerBlock {
	public LittleShroomlightBlock() {
		super(() -> MobEffects.NIGHT_VISION, 100, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.SHROOMLIGHT).instabreak().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 12)
				.noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(3, 0, 3, 13, 16, 13).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.WALKABLE;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(WorldExpansionModBlocks.KABANYT.get()) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.MYCELIUM) || groundState.is(Blocks.DIRT) || groundState.is(Blocks.COARSE_DIRT) || groundState.is(Blocks.PODZOL)
				|| groundState.is(Blocks.ROOTED_DIRT) || groundState.is(Blocks.MUD) || groundState.is(Blocks.MOSS_BLOCK) || groundState.is(Blocks.SAND) || groundState.is(Blocks.RED_SAND) || groundState.is(Blocks.FARMLAND)
				|| groundState.is(Blocks.NETHERRACK) || groundState.is(Blocks.CRIMSON_NYLIUM) || groundState.is(Blocks.WARPED_NYLIUM) || groundState.is(Blocks.SOUL_SAND) || groundState.is(Blocks.SOUL_SOIL) || groundState.is(Blocks.SHROOMLIGHT)
				|| groundState.is(Blocks.STONE);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}
}
