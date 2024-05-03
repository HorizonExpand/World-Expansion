package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class TNTProjectileKazhdyiTikPriPoliotieSnariadaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0, 0, 0);
	}
}
