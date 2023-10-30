
package net.horizonexpand.world_expansion.item;

public class SplitJudasFruitItem extends Item {
	public SplitJudasFruitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f).build()));
	}
}
