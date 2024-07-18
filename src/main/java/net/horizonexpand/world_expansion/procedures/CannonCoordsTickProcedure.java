package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CannonCoordsTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("CannonCoords")) {
			if (new Vec3((entity.getPersistentData().getDouble("CannonX")), (entity.getPersistentData().getDouble("CannonY")), (entity.getPersistentData().getDouble("CannonZ")))
					.distanceTo(new Vec3((entity.getX()), (entity.getY()), (entity.getZ()))) > 110) {
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getPersistentData().getDouble("CannonX")), (entity.getPersistentData().getDouble("CannonY")), (entity.getPersistentData().getDouble("CannonZ")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("CannonX")), (entity.getPersistentData().getDouble("CannonY")), (entity.getPersistentData().getDouble("CannonZ")), _ent.getYRot(), _ent.getXRot());
				}
			}
			if (new Vec3((entity.getPersistentData().getDouble("CannonX")), (entity.getPersistentData().getDouble("CannonY")), (entity.getPersistentData().getDouble("CannonZ"))).distanceTo(new Vec3(
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(128)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))) > 100) {
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getPersistentData().getDouble("CannonX")), (entity.getPersistentData().getDouble("CannonY")), (entity.getPersistentData().getDouble("CannonZ"))));
			}
		}
	}
}
