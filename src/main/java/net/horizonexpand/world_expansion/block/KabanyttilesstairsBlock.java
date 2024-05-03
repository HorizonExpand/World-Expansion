
package net.horizonexpand.world_expansion.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class KabanyttilesstairsBlock extends StairBlock {
	public KabanyttilesstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_RED).sound(SoundType.STONE).strength(1.2f, 4.5f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 4.5f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
