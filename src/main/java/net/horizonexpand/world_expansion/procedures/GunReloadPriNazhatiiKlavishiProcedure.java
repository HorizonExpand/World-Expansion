package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.item.DealersShotgunItem;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class GunReloadPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 0f) * 100 : 0) == 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") < 5) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") > 0) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof DealersShotgunItem)
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.dealers_shotgun.fast_reload");
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
							((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
					if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
								("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
								(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
								("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
								(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 10);
					WorldExpansionMod.queueServerWork(3, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_reload_continue")), SoundSource.PLAYERS, 1, 1);
							}
						}
					});
				} else {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof DealersShotgunItem)
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("geckoAnim", "animation.dealers_shotgun.reload");
					if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
								((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
								("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
								(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
									((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
									("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
									(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
										((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
										("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
										(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
								}
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
											((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
											("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
											(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
									}
									if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get())) : false) {
										(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
												((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
										(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
												("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
												(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString()));
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								}
							}
						}
					} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
								((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
								("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
								(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
									((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
									("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
									(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
										((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
										("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
										(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
								}
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
											((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
											("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
											(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
									}
									if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get())) : false) {
										(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("total",
												((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total") + 1));
										(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString(
												("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("total"))),
												(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString()));
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
										}
									}
								}
							}
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 75);
					WorldExpansionMod.queueServerWork(15, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_forearm_start")), SoundSource.PLAYERS, 1, 1);
							}
						}
					});
					WorldExpansionMod.queueServerWork(40, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_reload_start")), SoundSource.PLAYERS, 1, 1);
							}
						}
					});
					WorldExpansionMod.queueServerWork(49, () -> {
						new Object() {
							void timedLoop(int current, int total, int ticks) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_reload_continue")), SoundSource.PLAYERS, 1, 1);
									}
								}
								final int tick2 = ticks;
								WorldExpansionMod.queueServerWork(tick2, () -> {
									if (total > current + 1) {
										timedLoop(current + 1, total, tick2);
									}
								});
							}
						}.timedLoop(0, 4, 4);
					});
					WorldExpansionMod.queueServerWork(70, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_forearm_end")), SoundSource.PLAYERS, 1, 1);
							}
						}
					});
				}
			}
		}
	}
}
