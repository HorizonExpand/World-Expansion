
package net.horizonexpand.world_expansion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIAstilbaMenu;
import net.horizonexpand.world_expansion.procedures.DyeButtonYellowProcedure;
import net.horizonexpand.world_expansion.procedures.DyeButtonPinkProcedure;
import net.horizonexpand.world_expansion.procedures.DyeButtonOrangeProcedure;
import net.horizonexpand.world_expansion.procedures.DyeButtonMagentaProcedure;
import net.horizonexpand.world_expansion.procedures.DyeButtonLightBlueProcedure;
import net.horizonexpand.world_expansion.procedures.DyeButtonCyanProcedure;
import net.horizonexpand.world_expansion.procedures.CopperHornTabProcedure;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MultiCraftingTableGUIAstilbaButtonMessage {
	private final int buttonID, x, y, z;

	public MultiCraftingTableGUIAstilbaButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MultiCraftingTableGUIAstilbaButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MultiCraftingTableGUIAstilbaButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MultiCraftingTableGUIAstilbaButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = MultiCraftingTableGUIAstilbaMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DyeButtonCyanProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			DyeButtonLightBlueProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			DyeButtonMagentaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			DyeButtonOrangeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			DyeButtonPinkProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			DyeButtonYellowProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			CopperHornTabProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WorldExpansionMod.addNetworkMessage(MultiCraftingTableGUIAstilbaButtonMessage.class, MultiCraftingTableGUIAstilbaButtonMessage::buffer, MultiCraftingTableGUIAstilbaButtonMessage::new, MultiCraftingTableGUIAstilbaButtonMessage::handler);
	}
}
