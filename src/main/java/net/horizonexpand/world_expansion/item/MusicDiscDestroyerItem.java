
package net.horizonexpand.world_expansion.item;

public class MusicDiscDestroyerItem extends RecordItem {
	public MusicDiscDestroyerItem() {
		super(13, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:music_disc_destroyer")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4940);
	}
}
