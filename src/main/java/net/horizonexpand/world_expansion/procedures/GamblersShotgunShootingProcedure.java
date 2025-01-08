package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.item.GamblersShotgunItem;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModAttributes;
import net.horizonexpand.world_expansion.entity.ShotgunBlastEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class GamblersShotgunShootingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total") != 0) {
			WorldExpansionMod.queueServerWork(4, () -> {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_forearm")), SoundSource.PLAYERS, 1, 1);
			});
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 16);
			if ((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total"))))
					.equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof GamblersShotgunItem)
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString("geckoAnim", "animation.gamblers_shotgun.shoot_live"));
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
				for (int index0 = 0; index0 < 6; index0++) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), level) {
									@Override
									public byte getPierceLevel() {
										return piercing;
									}

									@Override
									protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
										if (knockback > 0) {
											double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
											Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
											if (vec3.lengthSqr() > 0.0) {
												livingEntity.push(vec3.x, 0.1, vec3.z);
											}
										}
									}
								};
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 0, 2, (byte) 1);
						_entityToSpawn.setPos((entity.getX() + entity.getLookAngle().x / 6), (y + 1.4), (entity.getZ() + entity.getLookAngle().z / 6));
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.05), (entity.getLookAngle().z), 4, (float) Mth.nextDouble(RandomSource.create(), -2, 2));
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					world.addParticle(ParticleTypes.SMOKE, (entity.getX() + entity.getLookAngle().x / 6), (y + 1.8), (entity.getZ() + entity.getLookAngle().z / 6), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0.1,
							(Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
				}
				entity.setDeltaMovement(new Vec3(
						(entity.getLookAngle().x * (-0.1)
								* (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER)
										? _livingEntity32.getAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER).getBaseValue()
										: 0)),
						(entity.getLookAngle().y * (-0.1)
								* (entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER)
										? _livingEntity34.getAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER).getBaseValue()
										: 0)),
						(entity.getLookAngle().z * (-0.1)
								* (entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER)
										? _livingEntity36.getAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER).getBaseValue()
										: 0))));
				{
					Entity _ent = entity;
					_ent.setYRot(entity.getYRot());
					_ent.setXRot((float) (entity.getXRot() - 10 * (entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER)
							? _livingEntity40.getAttribute(WorldExpansionModAttributes.KICKBACK_MULTIPLIER).getBaseValue()
							: 0)));
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			} else if ((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString(("" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total"))))
					.equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof GamblersShotgunItem)
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString("geckoAnim", "animation.gamblers_shotgun.shoot_blank"));
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:empty_dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
			}
			{
				final String _tagName = ("" + itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total"));
				final String _tagValue = "Empty";
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString(_tagName, _tagValue));
			}
			WorldExpansionMod.queueServerWork(1, () -> {
				{
					final String _tagName = "total";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("total") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			});
			WorldExpansionMod.queueServerWork(20, () -> {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:dealers_shotgun_shell")), SoundSource.PLAYERS, 1, 1);
			});
		} else {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("world_expansion:empty_dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
		}
	}
}
