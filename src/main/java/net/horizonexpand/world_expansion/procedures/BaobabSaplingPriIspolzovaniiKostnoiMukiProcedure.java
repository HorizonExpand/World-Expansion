package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BaobabSaplingPriIspolzovaniiKostnoiMukiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 0, 2);
		if (random == 0) {
			Baobab0SaplingProcedure.execute(world, x, y, z);
		} else if (random == 1) {
			Baobab1SaplingProcedure.execute(world, x, y, z);
		} else if (random == 2) {
			Baobab2SaplingProcedure.execute(world, x, y, z);
		}
	}
}
