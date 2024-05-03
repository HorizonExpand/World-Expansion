package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class BaobabDopolnitielnoieUsloviieGienieratsiiProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return BaobabSpawnConditionProcedure.execute(world, x, y, z);
	}
}
