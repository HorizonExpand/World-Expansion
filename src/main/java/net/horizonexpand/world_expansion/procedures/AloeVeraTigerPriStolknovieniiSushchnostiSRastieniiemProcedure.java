package net.horizonexpand.world_expansion.procedures;

public class AloeVeraTigerPriStolknovieniiSushchnostiSRastieniiemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.CACTUS)), (float) 0.2);
	}
}
