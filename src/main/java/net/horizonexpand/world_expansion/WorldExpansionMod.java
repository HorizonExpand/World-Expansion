package net.horizonexpand.world_expansion;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.horizonexpand.world_expansion.world.features.StructureFeature;
import net.horizonexpand.world_expansion.init.WorldExpansionModTabs;
import net.horizonexpand.world_expansion.init.WorldExpansionModSounds;
import net.horizonexpand.world_expansion.init.WorldExpansionModMenus;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModFeatures;
import net.horizonexpand.world_expansion.init.WorldExpansionModEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlockEntities;
import net.horizonexpand.world_expansion.init.WorldExpansionModAttributes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("world_expansion")
public class WorldExpansionMod {
	public static final Logger LOGGER = LogManager.getLogger(WorldExpansionMod.class);
	public static final String MODID = "world_expansion";

	public WorldExpansionMod() {
		// Start of user code block mod constructor
		//MinecraftForge.EVENT_BUS.addListener(this::addPackFinder);
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		WorldExpansionModSounds.REGISTRY.register(bus);
		WorldExpansionModBlocks.REGISTRY.register(bus);
		WorldExpansionModBlockEntities.REGISTRY.register(bus);
		WorldExpansionModItems.REGISTRY.register(bus);
		WorldExpansionModEntities.REGISTRY.register(bus);
		WorldExpansionModTabs.REGISTRY.register(bus);
		WorldExpansionModFeatures.REGISTRY.register(bus);
		StructureFeature.REGISTRY.register(bus);
		WorldExpansionModMenus.REGISTRY.register(bus);
		WorldExpansionModAttributes.REGISTRY.register(bus);
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	//private void addPackFinder(AddPackFindersEvent event) {
	//event.addRepositorySource((consumer, factory) -> {
	// Регистрируем ресурс-пак из папки resourcepacks
	//new ModResourcePack("test");
	//consumer.accept(ModResourcePack);
	//});
	//}
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
