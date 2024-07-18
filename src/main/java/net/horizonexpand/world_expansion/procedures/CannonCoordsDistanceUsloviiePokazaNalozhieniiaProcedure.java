package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.entity.Entity;

public class CannonCoordsDistanceUsloviiePokazaNalozhieniiaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("CannonCoords");
	}
}
