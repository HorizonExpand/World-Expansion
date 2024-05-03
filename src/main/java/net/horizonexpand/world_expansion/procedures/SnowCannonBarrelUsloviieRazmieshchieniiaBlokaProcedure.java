package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class SnowCannonBarrelUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorldExpansionModBlocks.CANNON_BASE.get()) {
			return true;
		}
		return false;
	}
}
