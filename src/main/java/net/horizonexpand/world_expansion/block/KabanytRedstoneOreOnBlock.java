
package net.horizonexpand.world_expansion.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.procedures.KabanytRedstoneOreOnObnovlieniieTikaProcedure;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class KabanytRedstoneOreOnBlock extends Block {
	public KabanytRedstoneOreOnBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(2.4f, 2.25f).lightLevel(s -> 9).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE.get());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 10);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		KabanytRedstoneOreOnObnovlieniieTikaProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 10);
	}
}
