package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetDenseFogProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "boolean") == true) {
			WorldExpansionModVariables.MapVariables.get(world).DenseFog = true;
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else {
			WorldExpansionModVariables.MapVariables.get(world).DenseFog = false;
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
