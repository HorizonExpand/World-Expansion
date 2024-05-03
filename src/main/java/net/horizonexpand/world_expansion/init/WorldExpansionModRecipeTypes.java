package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.horizonexpand.world_expansion.jei_recipes.MultiCraftingTableJEICategoryRecipe;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber(modid = WorldExpansionMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorldExpansionModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "world_expansion");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("multi_crafting_table_jei_category", () -> MultiCraftingTableJEICategoryRecipe.Serializer.INSTANCE);
		});
	}
}
