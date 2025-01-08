
package net.horizonexpand.world_expansion.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.GuiGraphics;

import net.horizonexpand.world_expansion.init.WorldExpansionModJeiPlugin;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class MultiCraftingTableJEICategoryRecipeCategory implements IRecipeCategory<MultiCraftingTableJEICategoryRecipe> {
	public final static ResourceLocation UID = ResourceLocation.parse("world_expansion:multi_crafting_table_jei_category");
	public final static ResourceLocation TEXTURE = ResourceLocation.parse("world_expansion:textures/screens/multi_crafting_table_gui_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public MultiCraftingTableJEICategoryRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 79);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(WorldExpansionModBlocks.MULTI_CRAFTING_TABLE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<MultiCraftingTableJEICategoryRecipe> getRecipeType() {
		return WorldExpansionModJeiPlugin.MultiCraftingTableJEICategory_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Multi-Crafting Table");
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public void draw(MultiCraftingTableJEICategoryRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, MultiCraftingTableJEICategoryRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 35, 14).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 53, 14).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 71, 14).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 35, 32).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 53, 32).addIngredients(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 71, 32).addIngredients(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.INPUT, 35, 50).addIngredients(recipe.getIngredients().get(6));
		builder.addSlot(RecipeIngredientRole.INPUT, 53, 50).addIngredients(recipe.getIngredients().get(7));
		builder.addSlot(RecipeIngredientRole.INPUT, 71, 50).addIngredients(recipe.getIngredients().get(8));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 125, 32).addItemStack(recipe.getResultItem(null));
	}
}
