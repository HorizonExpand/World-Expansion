package net.horizonexpand.world_expansion.procedures;

import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetDenseFogProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "boolean") == true) {
		} else {
		}
	}
}
