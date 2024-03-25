package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

public class WindGetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("North")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.get").getString() + " " + Component.translatable("wind.world_expansion.north").getString())), false);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("South")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.get").getString() + " " + Component.translatable("wind.world_expansion.south").getString())), false);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("East")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.get").getString() + " " + Component.translatable("wind.world_expansion.east").getString())), false);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("West")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.get").getString() + " " + Component.translatable("wind.world_expansion.west").getString())), false);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Wind).equals("Still")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("command.world_expansion.wind.get").getString() + " " + Component.translatable("wind.world_expansion.still").getString())), false);
		}
	}
}
