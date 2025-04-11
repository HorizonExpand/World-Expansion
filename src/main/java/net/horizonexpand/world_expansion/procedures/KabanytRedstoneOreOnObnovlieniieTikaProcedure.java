package net.horizonexpand.world_expansion.procedures;

import org.joml.Vector3f;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class KabanytRedstoneOreOnObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel)
			((ServerLevel) world).sendParticles((new DustParticleOptions(new Vector3f(255 / 255.0F, 0 / 255.0F, 0 / 255.0F), 1)), (x + 0.5), (y + 0.7), (z + 0.5), 16, 0.4, 0.4, 0.4, 0.1);
		if (Math.random() < 0.005) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = WorldExpansionModBlocks.KABANYT_REDSTONE_ORE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
