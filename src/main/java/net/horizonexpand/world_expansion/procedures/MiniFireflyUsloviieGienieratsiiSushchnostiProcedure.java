package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class MiniFireflyUsloviieGienieratsiiSushchnostiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) > 7 && !(world instanceof Level _lvl1 && _lvl1.isDay())) {
			return true;
		}
		return false;
	}
}
