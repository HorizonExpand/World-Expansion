package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModParticleTypes;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

import java.util.Map;

public class KabanytRedstoneOreOnObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			world.addParticle((SimpleParticleType) (WorldExpansionModParticleTypes.REDSTONE_ON.get()), (x + 0.5), (y + 1), (z + 0.5), (Mth.nextInt(RandomSource.create(), -1, 1)), (Mth.nextInt(RandomSource.create(), -1, 1)),
					(Mth.nextInt(RandomSource.create(), -1, 1)));
		}
		if (Math.random() < 0.005) {
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
