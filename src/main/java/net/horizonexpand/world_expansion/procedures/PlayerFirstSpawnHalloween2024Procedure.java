package net.horizonexpand.world_expansion.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.AdvancementEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerFirstSpawnHalloween2024Procedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent.AdvancementEarnEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).FirstJoin) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((Component.translatable("message.first_join").getString())), false);
			if (!world.isClientSide() && world.getServer() != null) {
				BlockPos _bpLootTblWorld = BlockPos.containing(x, y, z);
				for (ItemStack itemstackiterator : world.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.parse("world_expansion:chests/tavern_map")))
						.getRandomItems(new LootParams.Builder((ServerLevel) world).withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(_bpLootTblWorld)).withParameter(LootContextParams.BLOCK_STATE, world.getBlockState(_bpLootTblWorld))
								.withOptionalParameter(LootContextParams.BLOCK_ENTITY, world.getBlockEntity(_bpLootTblWorld)).create(LootContextParamSets.EMPTY))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = itemstackiterator.copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
		{
			WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
			_vars.FirstJoin = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
