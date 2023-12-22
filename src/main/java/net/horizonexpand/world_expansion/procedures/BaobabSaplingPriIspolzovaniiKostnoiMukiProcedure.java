package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BaobabSaplingPriIspolzovaniiKostnoiMukiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Mth.nextInt(RandomSource.create(), 1, 4);
		if (random == 1) {
			Baobab1SaplingGrowProcedure.execute(world, x, y, z);
		} else if (random == 2) {
			Baobab2SaplingGrowProcedure.execute(world, x, y, z);
		} else if (random == 3) {
			Baobab3SaplingGrowProcedure.execute(world, x, y, z);
		} else if (random == 4) {
			Baobab4SaplingGrowProcedure.execute(world, x, y, z);
		}
	}
}
