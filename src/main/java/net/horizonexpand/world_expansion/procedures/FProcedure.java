package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class FProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						("data merge block ~ ~-1 ~ {front_text: {messages: ['{\"text\":\"\"}', '{\"text\":\"\"}', '{\"text\":\"\"}', '{\"text\":\"" + "" + Component.translatable("advancements.summer_resort_in_winter.title").getString() + "\"}']}}"));
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"data merge block ~ ~-1 ~ {front_text: {messages: ['{\"text\":\"\u043F\u0438fa\"}', '{\"text\":\"\"}', '{\"text\":\"\"}', '{\"text\":\"\"}']}}");
		}
	}
}
