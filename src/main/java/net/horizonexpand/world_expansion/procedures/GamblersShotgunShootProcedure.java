package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.item.GamblersShotgunItem;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModAttributes;
import net.horizonexpand.world_expansion.entity.ShotgunBlastEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class GamblersShotgunShootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("total") != 0) {
			WorldExpansionMod.queueServerWork(4, () -> {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_forearm")), SoundSource.PLAYERS, 1, 1);
			});
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 16);
			if ((itemstack.getOrCreateTag().getString(("" + itemstack.getOrCreateTag().getDouble("total")))).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof GamblersShotgunItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.gamblers_shotgun.shoot_live");
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
				for (int index0 = 0; index0 < 6; index0++) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
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
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * (-0.1) * ((LivingEntity) entity).getAttribute(WorldExpansionModAttributes.KICKBACKMULTIPLIERATTRIBUTE.get()).getValue()),
						(entity.getLookAngle().y * (-0.1) * ((LivingEntity) entity).getAttribute(WorldExpansionModAttributes.KICKBACKMULTIPLIERATTRIBUTE.get()).getValue()),
						(entity.getLookAngle().z * (-0.1) * ((LivingEntity) entity).getAttribute(WorldExpansionModAttributes.KICKBACKMULTIPLIERATTRIBUTE.get()).getValue())));
				{
					Entity _ent = entity;
					_ent.setYRot(entity.getYRot());
					_ent.setXRot((float) (entity.getXRot() - 10 * ((LivingEntity) entity).getAttribute(WorldExpansionModAttributes.KICKBACKMULTIPLIERATTRIBUTE.get()).getValue()));
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			} else if ((itemstack.getOrCreateTag().getString(("" + itemstack.getOrCreateTag().getDouble("total")))).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.BLANK_SHOTGUN_BULLET.get()).toString())) {
				if (itemstack.getItem() instanceof GamblersShotgunItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "animation.gamblers_shotgun.shoot_blank");
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:empty_dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
			}
			itemstack.getOrCreateTag().putString(("" + itemstack.getOrCreateTag().getDouble("total")), "Empty");
			WorldExpansionMod.queueServerWork(1, () -> {
				itemstack.getOrCreateTag().putDouble("total", (itemstack.getOrCreateTag().getDouble("total") - 1));
			});
			WorldExpansionMod.queueServerWork(20, () -> {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:dealers_shotgun_shell")), SoundSource.PLAYERS, 1, 1);
			});
		} else {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:empty_dealers_shotgun_shooting")), SoundSource.PLAYERS, 1, 1);
		}
	}
}
