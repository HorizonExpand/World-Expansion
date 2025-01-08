
package net.horizonexpand.world_expansion.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.world.inventory.MultiCraftingTableGUIMenu;
import net.horizonexpand.world_expansion.procedures.MultiCraftingTableOutputSlotProcedure;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record MultiCraftingTableGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) implements CustomPacketPayload {

	public static final Type<MultiCraftingTableGUISlotMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WorldExpansionMod.MODID, "multi_crafting_table_gui_copper_horn_slots"));
	public static final StreamCodec<RegistryFriendlyByteBuf, MultiCraftingTableGUISlotMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, MultiCraftingTableGUISlotMessage message) -> {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}, (RegistryFriendlyByteBuf buffer) -> new MultiCraftingTableGUISlotMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<MultiCraftingTableGUISlotMessage> type() {
		return TYPE;
	}

	public static void handleData(final MultiCraftingTableGUISlotMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = MultiCraftingTableGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 9 && changeType == 1) {

			MultiCraftingTableOutputSlotProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WorldExpansionMod.addNetworkMessage(MultiCraftingTableGUISlotMessage.TYPE, MultiCraftingTableGUISlotMessage.STREAM_CODEC, MultiCraftingTableGUISlotMessage::handleData);
	}
}
