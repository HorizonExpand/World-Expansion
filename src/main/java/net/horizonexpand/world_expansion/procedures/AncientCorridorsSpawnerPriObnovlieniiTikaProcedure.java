package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import java.util.Comparator;

public class AncientCorridorsSpawnerPriObnovlieniiTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		String entity = "";
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 0) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Recharge") > 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("Recharge", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "Recharge")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7 ? blockstate.getValue(_getip7) : -1) == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SMALL_FLAME, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), (int) 0.1, 0.1, 0.1, 0.1, 0.05);
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()
					&& !(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip17 ? blockstate.getValue(_getip17) : -1) == 2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 1)), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 1, 0.1, 0.1, 0.1, 0.05);
		}
		WorldExpansionModVariables.MapVariables.get(world).ancient_corridors_spawner_entity_yaw = WorldExpansionModVariables.MapVariables.get(world).ancient_corridors_spawner_entity_yaw < 360
				? WorldExpansionModVariables.MapVariables.get(world).ancient_corridors_spawner_entity_yaw + 8
				: 0;
		WorldExpansionModVariables.MapVariables.get(world).syncData(world);
	}
}
