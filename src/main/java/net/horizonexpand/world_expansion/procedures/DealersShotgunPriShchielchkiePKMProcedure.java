package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.item.DealersShotgunItem;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class DealersShotgunPriShchielchkiePKMProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("total") != 0) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_forearm")), SoundSource.PLAYERS, 1, 1);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * (-0.1)), (entity.getLookAngle().y * (-0.1)), (entity.getLookAngle().z * (-0.1))));
			{
				Entity _ent = entity;
				_ent.setYRot(entity.getYRot());
				_ent.setXRot((float) (entity.getXRot() - 10));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			if ((itemstack.getOrCreateTag().getString(("" + itemstack.getOrCreateTag().getDouble("total")))).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof DealersShotgunItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.dealers_shotgun.shoot_live");
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new SpectralArrow(EntityType.SPECTRAL_ARROW, level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else if ((itemstack.getOrCreateTag().getString(("" + itemstack.getOrCreateTag().getDouble("total")))).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof DealersShotgunItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.dealers_shotgun.shoot_blank");
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			itemstack.getOrCreateTag().putString(("" + itemstack.getOrCreateTag().getDouble("total")), "Empty");
			itemstack.getOrCreateTag().putDouble("total", (itemstack.getOrCreateTag().getDouble("total") - 1));
			WorldExpansionMod.queueServerWork(20, () -> {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_shell")), SoundSource.PLAYERS, 1, 1);
					}
				}
			});
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:empty_dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
				}
			}
		}
	}
}
