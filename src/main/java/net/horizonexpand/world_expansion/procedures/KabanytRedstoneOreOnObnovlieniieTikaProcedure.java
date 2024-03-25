package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

import java.util.Map;

public class KabanytRedstoneOreOnObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(new BlockParticleOption(ParticleTypes.BLOCK, Blocks.REDSTONE_WIRE.defaultBlockState()), (x + 0.5), (y + 0.7), (z + 0.5), 8, 0.3, 0.3, 0.3, 0.3);
		}
		if (Math.random() < 0.002) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = WorldExpansionModBlocks.KABANYT_REDSTONE_ORE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
