
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.horizonexpand.world_expansion.entity.TumbleweedProjectileProjectileEntity;
import net.horizonexpand.world_expansion.entity.TNTProjectileEntity;
import net.horizonexpand.world_expansion.entity.PowderSnowProjectileEntity;
import net.horizonexpand.world_expansion.entity.PieceOfSnowEntity;
import net.horizonexpand.world_expansion.entity.MiniFirefliesEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldExpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<EntityType<TumbleweedProjectileProjectileEntity>> TUMBLEWEED_PROJECTILE = register("tumbleweed_projectile",
			EntityType.Builder.<TumbleweedProjectileProjectileEntity>of(TumbleweedProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TumbleweedProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PieceOfSnowEntity>> SNOW_PROJECTILE = register("snow_projectile",
			EntityType.Builder.<PieceOfSnowEntity>of(PieceOfSnowEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfSnowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TNTProjectileEntity>> TNT_PROJECTILE = register("tnt_projectile",
			EntityType.Builder.<TNTProjectileEntity>of(TNTProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TNTProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowderSnowProjectileEntity>> POWDER_SNOW_PROJECTILE = register("powder_snow_projectile", EntityType.Builder.<PowderSnowProjectileEntity>of(PowderSnowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PowderSnowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MiniFirefliesEntity>> MINI_FIREFLIES = register("mini_fireflies",
			EntityType.Builder.<MiniFirefliesEntity>of(MiniFirefliesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MiniFirefliesEntity::new)

					.sized(0.6f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MiniFirefliesEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MINI_FIREFLIES.get(), MiniFirefliesEntity.createAttributes().build());
	}
}
