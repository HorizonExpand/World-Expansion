
package net.horizonexpand.world_expansion.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.horizonexpand.world_expansion.procedures.ShotgunBlastKoghdaSnariadPopadaietVSushchnostProcedure;
import net.horizonexpand.world_expansion.procedures.ShotgunBlastKoghdaSnariadPopadaietVBlokProcedure;
import net.horizonexpand.world_expansion.procedures.ShotgunBlastKazhdyiTikPriPoliotieSnariadaProcedure;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ShotgunBlastEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(WorldExpansionModItems.LIVE_SHOTGUN_BULLET.get());

	public ShotgunBlastEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(WorldExpansionModEntities.SHOTGUN_BLAST.get(), world);
	}

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, Level world) {
		super(type, world);
	}

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ShotgunBlastEntity(EntityType<? extends ShotgunBlastEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		ShotgunBlastKoghdaSnariadPopadaietVSushchnostProcedure.execute(this.level(), entityHitResult.getEntity(), this, this.getOwner());
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

	public static ShotgunBlastEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		ShotgunBlastEntity entityarrow = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static ShotgunBlastEntity shoot(LivingEntity entity, LivingEntity target) {
		ShotgunBlastEntity entityarrow = new ShotgunBlastEntity(WorldExpansionModEntities.SHOTGUN_BLAST.get(), entity, entity.level());
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
