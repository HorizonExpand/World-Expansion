package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class ShotgunBlastKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = WorldExpansionModEntities.MINI_FIREFLIES.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("world_expansion:bullets_capability")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
		}
	}
}
