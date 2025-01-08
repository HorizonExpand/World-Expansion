package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetDenseFogProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "boolean") == true) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.DenseFog = true;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.DenseFog = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
