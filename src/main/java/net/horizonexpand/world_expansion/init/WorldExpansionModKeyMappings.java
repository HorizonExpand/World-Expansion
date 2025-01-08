
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.horizonexpand.world_expansion.network.GunReloadMessage;
import net.horizonexpand.world_expansion.network.GunDischargeMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WorldExpansionModKeyMappings {
	public static final KeyMapping GUN_DISCHARGE = new KeyMapping("key.world_expansion.gun_discharge", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new GunDischargeMessage(0, 0));
				GunDischargeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GUN_RELOAD = new KeyMapping("key.world_expansion.gun_reload", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new GunReloadMessage(0, 0));
				GunReloadMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(GUN_DISCHARGE);
		event.register(GUN_RELOAD);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				GUN_DISCHARGE.consumeClick();
				GUN_RELOAD.consumeClick();
			}
		}
	}
}
