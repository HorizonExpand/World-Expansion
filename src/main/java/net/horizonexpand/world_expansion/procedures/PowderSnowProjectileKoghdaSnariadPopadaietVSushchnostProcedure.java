package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.entity.Entity;

public class PowderSnowProjectileKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setTicksFrozen((int) (entity.getTicksFrozen() + 40));
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}
