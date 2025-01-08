
package net.horizonexpand.world_expansion.block;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.MenuProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.block.entity.SuspiciousMudBlockEntity;

public class SuspiciousMudBlock extends Block implements EntityBlock {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);

	public SuspiciousMudBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY)
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:suspicious_mud_break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.mud.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:suspicious_mud_break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:suspicious_mud_break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.mud.fall"))))
				.strength(0.8f, 2f).lightLevel(s -> (new Object() {
					public int getLightLevel() {
						if (s.getValue(BLOCKSTATE) == 1)
							return 0;
						if (s.getValue(BLOCKSTATE) == 2)
							return 0;
						if (s.getValue(BLOCKSTATE) == 3)
							return 0;
						return 0;
					}
				}.getLightLevel())).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(0, 0, 0, 16, 14, 16);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BLOCKSTATE);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SuspiciousMudBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}
}
