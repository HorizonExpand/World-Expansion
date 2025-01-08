
package net.horizonexpand.world_expansion.entity;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;

import net.horizonexpand.world_expansion.procedures.ShotgunBlastKoghdaSnariadPopadaietVSushchnostProcedure;
import net.horizonexpand.world_expansion.procedures.ShotgunBlastKoghdaSnariadPopadaietVBlokProcedure;
import net.horizonexpand.world_expansion.procedures.ShotgunBlastKazhdyiTikPriPoliotieSnariadaProcedure;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;

import javax.annotation.Nullable;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ShotgunBlastEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
	private int knockback = 0;

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, Level world) {
		super(type, world);
	}

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, double x, double y, double z, Level world, @Nullable ItemStack firedFromWeapon) {
		super(type, x, y, z, world, PROJECTILE_ITEM, firedFromWeapon);
	}

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, LivingEntity entity, Level world, @Nullable ItemStack firedFromWeapon) {
		super(type, entity, world, PROJECTILE_ITEM, firedFromWeapon);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getDefaultPickupItem() {
		return new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	public void setKnockback(int knockback) {
		this.knockback = knockback;
	}

	@Override
	protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
		if (knockback > 0.0) {
			double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
			Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
			if (vec3.lengthSqr() > 0.0) {
				livingEntity.push(vec3.x, 0.1, vec3.z);
			}
		}
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		ShotgunBlastKoghdaSnariadPopadaietVSushchnostProcedure.execute(this.level(), entityHitResult.getEntity(), this);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		ShotgunBlastKoghdaSnariadPopadaietVBlokProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		ShotgunBlastKazhdyiTikPriPoliotieSnariadaProcedure.execute(this);
		if (this.inGround)
			this.discard();
	}

	public static ShotgunBlastEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 4f, 0, 2);
	}

	public static ShotgunBlastEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 4f, 0, 2);
	}

	public static ShotgunBlastEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		ShotgunBlastEntity entityarrow = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), entity, world, null);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static ShotgunBlastEntity shoot(LivingEntity entity, LivingEntity target) {
		ShotgunBlastEntity entityarrow = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), entity, entity.level(), null);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 4f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
