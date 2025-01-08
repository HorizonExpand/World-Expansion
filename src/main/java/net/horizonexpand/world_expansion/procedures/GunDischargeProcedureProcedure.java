package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.item.GamblersShotgunItem;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class GunDischargeProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorldExpansionModItems.GAMBLERS_SHOTGUN.get()) {
			if ((entity instanceof Player _plrCldRem3 ? _plrCldRem3.getCooldowns().getCooldownPercent((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 0f) * 100 : 0) == 0) {
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag()
						.getString(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total")))))
						.equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString())) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof GamblersShotgunItem)
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString("geckoAnim", "animation.gamblers_shotgun.discharge_live"));
					{
						final String _tagName = ("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total")));
						final String _tagValue = "Empty";
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
					{
						final String _tagName = "total";
						final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total") - 1);
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					WorldExpansionMod.queueServerWork(20, () -> {
						if (world instanceof Level)
							((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_shell")), SoundSource.PLAYERS, 1, 1);
					});
				} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag()
						.getString(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total")))))
						.equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString())) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof GamblersShotgunItem)
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString("geckoAnim", "animation.gamblers_shotgun.discharge_blank"));
					{
						final String _tagName = ("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total")));
						final String _tagValue = "Empty";
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
					{
						final String _tagName = "total";
						final double _tagValue = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total") - 1);
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					WorldExpansionMod.queueServerWork(20, () -> {
						if (world instanceof Level)
							((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_shell")), SoundSource.PLAYERS, 1, 1);
					});
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof GamblersShotgunItem)
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString("geckoAnim", "animation.gamblers_shotgun.discharge"));
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 33);
				WorldExpansionMod.queueServerWork(12, () -> {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_forearm")), SoundSource.PLAYERS, 1, 1);
				});
			}
		}
	}
}
