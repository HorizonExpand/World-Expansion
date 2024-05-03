package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MiniFirefliesUsloviieGienieratsiiSushchnostiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) > 10 && ((world.dayTime())) > (12000) && ((world.dayTime())) < (23000);
	}
}
