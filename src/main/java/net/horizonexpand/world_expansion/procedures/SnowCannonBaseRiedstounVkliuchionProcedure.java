package net.horizonexpand.world_expansion.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;
import net.horizonexpand.world_expansion.entity.PieceOfSnowEntity;

import java.util.concurrent.atomic.AtomicReference;
import java.util.HashMap;

public class SnowCannonBaseRiedstounVkliuchionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap guistate) {
		if (guistate == null)
			return;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Items.PAPER) {
			if (guistate.get("text:X") instanceof EditBox _tf)
				_tf.setValue(("" + (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getOrCreateTag().getDouble("X")));
			if (guistate.get("text:Y") instanceof EditBox _tf)
				_tf.setValue(("" + (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getOrCreateTag().getDouble("Y")));
			if (guistate.get("text:Z") instanceof EditBox _tf)
				_tf.setValue(("" + (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getOrCreateTag().getDouble("Z")));
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == WorldExpansionModBlocks.SNOW_CANNON_BARREL.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Snow") > 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.break")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.powder_snow.break")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") > 0 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") <= 16) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") / 10), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") < 0 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") >= -16) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) / 10), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") >= 17 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") <= 25) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") / 15), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") <= -17 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") >= -25) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) / 15), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") >= 26 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") <= 64) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") / 20), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") <= -26 && new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") >= -64) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PieceOfSnowEntity(WorldExpansionModEntities.PIECE_OF_SNOW.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 4, 0);
						_entityToSpawn.setPos((x + 0.5), (y + 3), (z + 0.5));
						_entityToSpawn.shoot((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") / 3), (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) + 8), (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "") / 3), (float) (Math.abs(new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "")) / 20), (float) ((new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:X") ? ((EditBox) guistate.get("text:X")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") + new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert(guistate.containsKey("text:Z") ? ((EditBox) guistate.get("text:Z")).getValue() : "")) / 10));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("Snow", ((new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, BlockPos.containing(x, y, z), "Snow")) - 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") == 0 || new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") > 64 || new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:Y") ? ((EditBox) guistate.get("text:Y")).getValue() : "") < -64) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.BLOCKS, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.BLOCKS, (float) 0.5, 1, false);
						}
					}
				}
			}
		}
	}
}
