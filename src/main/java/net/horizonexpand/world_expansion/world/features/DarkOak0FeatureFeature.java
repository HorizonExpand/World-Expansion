
package net.horizonexpand.world_expansion.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.horizonexpand.world_expansion.procedures.DarkOak0DopolnitielnoieUsloviieGienieratsiiProcedure;

public class DarkOak0FeatureFeature extends TreeFeature {
	public DarkOak0FeatureFeature() {
		super(TreeConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!DarkOak0DopolnitielnoieUsloviieGienieratsiiProcedure.execute(world, x, y, z))
			return false;
		return super.place(context);
	}
}
