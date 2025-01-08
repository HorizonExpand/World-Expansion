
package net.horizonexpand.world_expansion.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.horizonexpand.world_expansion.jei_recipes.MultiCraftingTableJEICategoryRecipeCategory;
import net.horizonexpand.world_expansion.jei_recipes.MultiCraftingTableJEICategoryRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

@JeiPlugin
public class WorldExpansionModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<MultiCraftingTableJEICategoryRecipe> MultiCraftingTableJEICategory_Type = new mezz.jei.api.recipe.RecipeType<>(MultiCraftingTableJEICategoryRecipeCategory.UID,
			MultiCraftingTableJEICategoryRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("world_expansion:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new MultiCraftingTableJEICategoryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<MultiCraftingTableJEICategoryRecipe> MultiCraftingTableJEICategoryRecipes = recipeManager.getAllRecipesFor(MultiCraftingTableJEICategoryRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(MultiCraftingTableJEICategory_Type, MultiCraftingTableJEICategoryRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(WorldExpansionModBlocks.MULTI_CRAFTING_TABLE.get().asItem()), MultiCraftingTableJEICategory_Type);
	}
}
