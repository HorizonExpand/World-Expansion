
package net.horizonexpand.world_expansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LiveShotgunBulletItem extends Item {
	public LiveShotgunBulletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
