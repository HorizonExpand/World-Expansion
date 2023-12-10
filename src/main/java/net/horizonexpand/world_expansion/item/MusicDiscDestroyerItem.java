
package net.horizonexpand.world_expansion.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MusicDiscDestroyerItem extends RecordItem {
	public MusicDiscDestroyerItem() {
		super(13, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("world_expansion:music_disc_destroyer")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4940);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
