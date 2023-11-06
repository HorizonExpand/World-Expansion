
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorldExpansionMod.MODID);
	public static final RegistryObject<CreativeModeTab> BUILDING_BLOCKS = REGISTRY.register("building_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.world_expansion.building_blocks")).icon(() -> new ItemStack(WorldExpansionModBlocks.BAOBAB_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorldExpansionModBlocks.BAOBAB_LEAVES.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_WOOD.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_LOG.get().asItem());
				tabData.accept(WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD.get().asItem());
				tabData.accept(WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_PLANKS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_STAIRS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_SLAB.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_FENCE.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_FENCE_GATE.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_PRESSURE_PLATE.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_BUTTON.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_DOOR.get().asItem());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_TRAPDOOR.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_STAIRS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_SLAB.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_WALL.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_BRICKS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_BRICKS_STAIRS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_BRICKS_SLAB.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_BRICKS_WALL.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_TILES.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_TILES_STAIRS.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_TILES_SLAB.get().asItem());
				tabData.accept(WorldExpansionModBlocks.KABANYT_TILES_WALL.get().asItem());
				tabData.accept(WorldExpansionModBlocks.CARVED_KABANYT.get().asItem());
				tabData.accept(WorldExpansionModBlocks.TAKYR.get().asItem());
				tabData.accept(WorldExpansionModBlocks.DRY_DIRT.get().asItem());
				tabData.accept(WorldExpansionModBlocks.SUSPICIOUS_MUD.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PLANTS = REGISTRY.register("plants",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.world_expansion.plants")).icon(() -> new ItemStack(WorldExpansionModBlocks.ASTILBA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorldExpansionModBlocks.ASTILBA.get().asItem());
				tabData.accept(WorldExpansionModBlocks.ASTILBA_MULTICOLORED.get().asItem());
				tabData.accept(WorldExpansionModBlocks.YELLOW_ASTILBA.get().asItem());
				tabData.accept(WorldExpansionModBlocks.ALOE_VERA.get().asItem());
				tabData.accept(WorldExpansionModBlocks.TIGER_ALOE_VERA.get().asItem());
				tabData.accept(WorldExpansionModItems.TUMBLEWEED_PROJECTILE.get());
				tabData.accept(WorldExpansionModBlocks.BAOBAB_SAPLING.get().asItem());
				tabData.accept(WorldExpansionModBlocks.LITTLE_SHROOMLIGHT.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.world_expansion.items")).icon(() -> new ItemStack(WorldExpansionModItems.COPPER_HORN0.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorldExpansionModItems.LEAVE_OF_ALOE_VERA.get());
				tabData.accept(WorldExpansionModItems.JUDAS_FRUIT.get());
				tabData.accept(WorldExpansionModItems.SPLIT_JUDAS_FRUIT.get());
				tabData.accept(WorldExpansionModItems.MUSIC_DISC_DESTROYER.get());
				tabData.accept(WorldExpansionModItems.PIECE_TOTEM_OF_UNDYING.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN0.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN1.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN2.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN3.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN4.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN5.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN6.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN7.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN8.get());
				tabData.accept(WorldExpansionModItems.COPPER_HORN9.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> WE_HALLOWEEN = REGISTRY.register("we_halloween",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.world_expansion.we_halloween")).icon(() -> new ItemStack(WorldExpansionModItems.SOUL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorldExpansionModBlocks.JACK_O_LANTERN_WITH_SOUL.get().asItem());
				tabData.accept(WorldExpansionModItems.SOUL.get());
			})

					.build());
}
