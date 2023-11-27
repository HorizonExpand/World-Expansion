
package net.horizonexpand.world_expansion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIMenu;
import net.horizonexpand.world_expansion.procedures.CopperHornButton9Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton8Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton7Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton6Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton5Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton4Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton3Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton2Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton1Procedure;
import net.horizonexpand.world_expansion.procedures.CopperHornButton0Procedure;
import net.horizonexpand.world_expansion.procedures.AstilbaMulticoloredTabProcedure;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MultiCraftingTableGUIButtonMessage {
	private final int buttonID, x, y, z;

	public MultiCraftingTableGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MultiCraftingTableGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MultiCraftingTableGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MultiCraftingTableGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MultiCraftingTableGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CopperHornButton0Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			CopperHornButton1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			CopperHornButton2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			CopperHornButton3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			CopperHornButton4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			CopperHornButton5Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			CopperHornButton6Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			CopperHornButton7Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			CopperHornButton8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			CopperHornButton9Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			AstilbaMulticoloredTabProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WorldExpansionMod.addNetworkMessage(MultiCraftingTableGUIButtonMessage.class, MultiCraftingTableGUIButtonMessage::buffer, MultiCraftingTableGUIButtonMessage::new, MultiCraftingTableGUIButtonMessage::handler);
	}
}
