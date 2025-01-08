
package net.horizonexpand.world_expansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SplitJudasFruitItem extends Item {
	public SplitJudasFruitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(5f).build()));
	}
}
