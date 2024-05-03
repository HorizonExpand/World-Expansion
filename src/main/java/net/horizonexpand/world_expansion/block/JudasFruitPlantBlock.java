
package net.horizonexpand.world_expansion.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.procedures.JudasFruitPriIzmienieniiSosiednieghoBlokaProcedure;
import net.horizonexpand.world_expansion.procedures.JudasFruitPlantUsloviieRazrieshieniiaIspolzovaniiaKostnoiMukiProcedure;
import net.horizonexpand.world_expansion.procedures.JudasFruitPlantPriRazrushieniiBlokaIghrokomProcedure;
import net.horizonexpand.world_expansion.procedures.JudasFruit1PriIspolzovaniiKostnoiMukiProcedure;
import net.horizonexpand.world_expansion.procedures.JudasFruit1ObnovlieniieTikaProcedure;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class JudasFruitPlantBlock extends Block implements BonemealableBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);

	public JudasFruitPlantBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				return 0;
			}
		}.getLightLevel())).noCollission().noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(7, 12, 7, 9, 16, 9), box(5.5, 3, 5.5, 10.5, 13, 10.5));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(BLOCKSTATE);
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(WorldExpansionModItems.JUDAS_FRUIT.get());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		JudasFruitPriIzmienieniiSosiednieghoBlokaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		JudasFruit1ObnovlieniieTikaProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		JudasFruitPlantPriRazrushieniiBlokaIghrokomProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		if (worldIn instanceof LevelAccessor world) {
			return JudasFruitPlantUsloviieRazrieshieniiaIspolzovaniiaKostnoiMukiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
		return false;
	}

	@Override
	public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
		JudasFruit1PriIspolzovaniiKostnoiMukiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
