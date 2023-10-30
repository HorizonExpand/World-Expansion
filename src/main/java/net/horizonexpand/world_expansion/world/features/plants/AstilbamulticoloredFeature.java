
package net.horizonexpand.world_expansion.world.features.plants;

import net.horizonexpand.world_expansion.procedures.AstilbamulticoloredDobavochnoieUsloviiePoGienieratsiiProcedure;

import java.util.Set;

public class AstilbamulticoloredFeature extends RandomPatchFeature {
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public AstilbamulticoloredFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!AstilbamulticoloredDobavochnoieUsloviiePoGienieratsiiProcedure.execute())
			return false;
		return super.place(context);
	}
}
