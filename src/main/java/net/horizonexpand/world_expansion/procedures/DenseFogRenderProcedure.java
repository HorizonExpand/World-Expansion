package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.shaders.FogShape;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class DenseFogRenderProcedure {
	public static ViewportEvent.RenderFog provider = null;

	public static void setDistance(float start, float end) {
		provider.setNearPlaneDistance(start);
		provider.setFarPlaneDistance(end);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	public static void setShape(FogShape shape) {
		provider.setFogShape(shape);
		if (!provider.isCanceled()) {
			provider.setCanceled(true);
		}
	}

	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		provider = event;
		if (provider.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			ClientLevel level = Minecraft.getInstance().level;
			Entity entity = provider.getCamera().getEntity();
			if (level != null && entity != null) {
				Vec3 pos = entity.getPosition((float) provider.getPartialTick());
				execute(provider, level, pos.x(), pos.y(), pos.z(), entity);
			}
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).DenseFog == true) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("world_expansion:dry_savanna"))) {
				if ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test > 10) {
					{
						double _setval = (entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test - 0.2;
						entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Fog_Test = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				setDistance((float) ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test * 1.6),
						(float) ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test * 6.4));
			} else {
				if ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test < 40) {
					{
						double _setval = (entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test + 0.2;
						entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Fog_Test = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				setDistance((float) ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test * 1.6),
						(float) ((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Fog_Test * 6.4));
			}
		}
	}
}
