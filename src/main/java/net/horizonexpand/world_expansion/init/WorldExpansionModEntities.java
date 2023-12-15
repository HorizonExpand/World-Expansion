
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.horizonexpand.world_expansion.entity.TumbleweedProjectileProjectileEntity;
import net.horizonexpand.world_expansion.entity.PieceOfSnowEntity;
import net.horizonexpand.world_expansion.entity.PieceOfPowderSnowEntity;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldExpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WorldExpansionMod.MODID);
	public static final RegistryObject<EntityType<TumbleweedProjectileProjectileEntity>> TUMBLEWEED_PROJECTILE = register("projectile_tumbleweed_projectile",
			EntityType.Builder.<TumbleweedProjectileProjectileEntity>of(TumbleweedProjectileProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TumbleweedProjectileProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PieceOfPowderSnowEntity>> PIECE_OF_POWDER_SNOW = register("projectile_piece_of_powder_snow", EntityType.Builder.<PieceOfPowderSnowEntity>of(PieceOfPowderSnowEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PieceOfPowderSnowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PieceOfSnowEntity>> PIECE_OF_SNOW = register("projectile_piece_of_snow",
			EntityType.Builder.<PieceOfSnowEntity>of(PieceOfSnowEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfSnowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
