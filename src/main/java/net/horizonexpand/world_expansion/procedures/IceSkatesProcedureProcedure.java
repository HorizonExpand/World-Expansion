package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class IceSkatesProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean found = false;
		double sy = 0;
		found = false;
		sy = -3;
		for (int index0 = 0; index0 < 3; index0++) {
			if ((world.getBlockState(BlockPos.containing(x, y + sy, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))
					&& ((world.getBlockState(BlockPos.containing(x, y + sy + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))
							&& (world.getBlockState(BlockPos.containing(x, y + sy + 2, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))
							&& (world.getBlockState(BlockPos.containing(x, y + sy + 3, z))).is(BlockTags.create(new ResourceLocation("minecraft:ice")))
							|| world.isEmptyBlock(BlockPos.containing(x, y + sy + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + sy + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + sy + 3, z)))) {
				found = true;
			}
			sy = sy + 1;
		}
		if (found == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 2, 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1, false, false));
			if (Math.random() < 0.05 && !(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) && (!entity.onGround() || entity.isSprinting())) {
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 1, false, false));
		}
	}
}
