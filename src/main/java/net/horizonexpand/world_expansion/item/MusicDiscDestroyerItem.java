
package net.horizonexpand.world_expansion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.horizonexpand.world_expansion.WorldExpansionMod;

public class MusicDiscDestroyerItem extends Item {
	public MusicDiscDestroyerItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(WorldExpansionMod.MODID, "music_disc_destroyer"))));
	}
}
