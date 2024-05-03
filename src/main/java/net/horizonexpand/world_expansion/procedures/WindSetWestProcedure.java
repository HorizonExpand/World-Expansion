package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

public class WindSetWestProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		WorldExpansionModVariables.MapVariables.get(world).Wind = "West";
		WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.set").getString() + " " + Component.translatable("wind.world_expansion.west").getString())), false);
	}
}
