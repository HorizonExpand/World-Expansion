
package net.horizonexpand.world_expansion.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscDestroyerItem extends RecordItem {
	public MusicDiscDestroyerItem() {
		super(13, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:music_disc_destroyer")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4940);
	}
}
