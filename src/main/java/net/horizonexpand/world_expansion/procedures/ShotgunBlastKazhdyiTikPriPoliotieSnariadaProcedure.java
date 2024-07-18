package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.entity.Entity;

public class ShotgunBlastKazhdyiTikPriPoliotieSnariadaProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.getPersistentData().putDouble("live", (immediatesourceentity.getPersistentData().getDouble("live") + 1));
	}
}
