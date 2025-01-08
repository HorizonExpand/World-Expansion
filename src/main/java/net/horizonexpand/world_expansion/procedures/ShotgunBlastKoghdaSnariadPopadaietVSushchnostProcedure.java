package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class ShotgunBlastKoghdaSnariadPopadaietVSushchnostProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("world_expansion:shotgun_damage_type")))), (float) (8 / (immediatesourceentity.getPersistentData().getDouble("live") + 1)));
	}
}
