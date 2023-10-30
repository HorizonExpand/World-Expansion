
package net.horizonexpand.world_expansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PieceTotemOfUndyingItem extends Item {
	public PieceTotemOfUndyingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
