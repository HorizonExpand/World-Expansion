package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class AloeVeraTigerPriStolknovieniiSushchnostiSRastieniiemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), (float) 0.2);
	}
}