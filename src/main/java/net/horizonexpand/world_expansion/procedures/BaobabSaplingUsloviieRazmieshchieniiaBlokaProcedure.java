package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BaobabSaplingUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt"))) && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof LiquidBlock)
				&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() instanceof LiquidBlock) && !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() instanceof LiquidBlock)
				&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() instanceof LiquidBlock) && !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() instanceof LiquidBlock)) {
			return true;
		}
		return false;
	}
}
