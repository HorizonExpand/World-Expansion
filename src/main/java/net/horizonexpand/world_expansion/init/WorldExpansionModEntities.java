
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.horizonexpand.world_expansion.entity.TumbleweedProjectileProjectileEntity;
import net.horizonexpand.world_expansion.entity.ShotgunBlastEntity;
import net.horizonexpand.world_expansion.entity.MiniFirefliesEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WorldExpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, WorldExpansionMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<TumbleweedProjectileProjectileEntity>> TUMBLEWEED_PROJECTILE = register("tumbleweed_projectile",
			EntityType.Builder.<TumbleweedProjectileProjectileEntity>of(TumbleweedProjectileProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<MiniFirefliesEntity>> MINI_FIREFLIES = register("mini_fireflies",
			EntityType.Builder.<MiniFirefliesEntity>of(MiniFirefliesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<ShotgunBlastEntity>> SHOTGUN_BLAST = register("shotgun_blast",
			EntityType.Builder.<ShotgunBlastEntity>of(ShotgunBlastEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		MiniFirefliesEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MINI_FIREFLIES.get(), MiniFirefliesEntity.createAttributes().build());
	}
}
