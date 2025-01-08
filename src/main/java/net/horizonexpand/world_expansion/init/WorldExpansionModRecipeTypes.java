package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;

import net.horizonexpand.world_expansion.jei_recipes.MultiCraftingTableJEICategoryRecipe;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@EventBusSubscriber(modid = WorldExpansionMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class WorldExpansionModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "world_expansion");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "world_expansion");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("world_expansion").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			RECIPE_TYPES.register("multi_crafting_table_jei_category", () -> MultiCraftingTableJEICategoryRecipe.Type.INSTANCE);
			SERIALIZERS.register("multi_crafting_table_jei_category", () -> MultiCraftingTableJEICategoryRecipe.Serializer.INSTANCE);
		});
	}
}
