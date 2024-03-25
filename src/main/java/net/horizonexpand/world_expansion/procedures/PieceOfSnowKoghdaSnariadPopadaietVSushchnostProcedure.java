package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.entity.Entity;

public class PieceOfSnowKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen((int) (entity.getTicksFrozen() + 10));
	}
}
