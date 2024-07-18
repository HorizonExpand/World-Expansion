package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class CannonCoordsProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.ADVENTURE);
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
		entity.getPersistentData().putDouble("CannonX", x);
		entity.getPersistentData().putDouble("CannonY", y);
		entity.getPersistentData().putDouble("CannonZ", z);
		entity.getPersistentData().putBoolean("CannonCoords", true);
	}
}
