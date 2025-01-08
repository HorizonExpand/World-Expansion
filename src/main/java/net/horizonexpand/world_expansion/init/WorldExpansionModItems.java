
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.horizonexpand.world_expansion.procedures.GamblersShotgunChamberZnachieniieSvoistvaProcedure;
import net.horizonexpand.world_expansion.procedures.GamblersShotgunChamberZnachieniieSvoistva2Procedure;
import net.horizonexpand.world_expansion.item.TumbleweedProjectileItem;
import net.horizonexpand.world_expansion.item.TitaniumIngotItem;
import net.horizonexpand.world_expansion.item.SplitJudasFruitItem;
import net.horizonexpand.world_expansion.item.RawTitaniumItem;
import net.horizonexpand.world_expansion.item.PieceTotemOfUndyingItem;
import net.horizonexpand.world_expansion.item.MusicDiscDestroyerItem;
import net.horizonexpand.world_expansion.item.LiveShotgunBulletItem;
import net.horizonexpand.world_expansion.item.LeaveOfAloeVeraItem;
import net.horizonexpand.world_expansion.item.JudasFruitItem;
import net.horizonexpand.world_expansion.item.IceSkatesItem;
import net.horizonexpand.world_expansion.item.GamblersShotgunItem;
import net.horizonexpand.world_expansion.item.GamblersShotgunChamberItem;
import net.horizonexpand.world_expansion.item.CopperHornItem;
import net.horizonexpand.world_expansion.item.CopperHorn9Item;
import net.horizonexpand.world_expansion.item.CopperHorn8Item;
import net.horizonexpand.world_expansion.item.CopperHorn7Item;
import net.horizonexpand.world_expansion.item.CopperHorn6Item;
import net.horizonexpand.world_expansion.item.CopperHorn5Item;
import net.horizonexpand.world_expansion.item.CopperHorn4Item;
import net.horizonexpand.world_expansion.item.CopperHorn3Item;
import net.horizonexpand.world_expansion.item.CopperHorn2Item;
import net.horizonexpand.world_expansion.item.CopperHorn1Item;
import net.horizonexpand.world_expansion.item.BruteArmorTrimSmithingTemplateItem;
import net.horizonexpand.world_expansion.item.BlankShotgunBulletItem;
import net.horizonexpand.world_expansion.block.display.BottleWithMiniFirefliesDisplayItem;
import net.horizonexpand.world_expansion.block.display.BottleDisplayItem;
import net.horizonexpand.world_expansion.WorldExpansionMod;

public class WorldExpansionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WorldExpansionMod.MODID);
	public static final DeferredItem<Item> BAOBAB_WOOD = block(WorldExpansionModBlocks.BAOBAB_WOOD);
	public static final DeferredItem<Item> BAOBAB_LOG = block(WorldExpansionModBlocks.BAOBAB_LOG);
	public static final DeferredItem<Item> BAOBAB_PLANKS = block(WorldExpansionModBlocks.BAOBAB_PLANKS);
	public static final DeferredItem<Item> BAOBAB_LEAVES = block(WorldExpansionModBlocks.BAOBAB_LEAVES);
	public static final DeferredItem<Item> BAOBAB_STAIRS = block(WorldExpansionModBlocks.BAOBAB_STAIRS);
	public static final DeferredItem<Item> BAOBAB_SLAB = block(WorldExpansionModBlocks.BAOBAB_SLAB);
	public static final DeferredItem<Item> BAOBAB_FENCE = block(WorldExpansionModBlocks.BAOBAB_FENCE);
	public static final DeferredItem<Item> BAOBAB_FENCE_GATE = block(WorldExpansionModBlocks.BAOBAB_FENCE_GATE);
	public static final DeferredItem<Item> BAOBAB_PRESSURE_PLATE = block(WorldExpansionModBlocks.BAOBAB_PRESSURE_PLATE);
	public static final DeferredItem<Item> BAOBAB_BUTTON = block(WorldExpansionModBlocks.BAOBAB_BUTTON);
	public static final DeferredItem<Item> STRIPPED_BAOBAB_WOOD = block(WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD);
	public static final DeferredItem<Item> STRIPPED_BAOBAB_LOG = block(WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG);
	public static final DeferredItem<Item> BAOBAB_TRAPDOOR = block(WorldExpansionModBlocks.BAOBAB_TRAPDOOR);
	public static final DeferredItem<Item> ASTILBA_MULTICOLORED = block(WorldExpansionModBlocks.ASTILBA_MULTICOLORED);
	public static final DeferredItem<Item> BAOBAB_DOOR = doubleBlock(WorldExpansionModBlocks.BAOBAB_DOOR);
	public static final DeferredItem<Item> KABANYT = block(WorldExpansionModBlocks.KABANYT);
	public static final DeferredItem<Item> KABANYT_BRICKS = block(WorldExpansionModBlocks.KABANYT_BRICKS);
	public static final DeferredItem<Item> KABANYT_TILES = block(WorldExpansionModBlocks.KABANYT_TILES);
	public static final DeferredItem<Item> CARVED_KABANYT = block(WorldExpansionModBlocks.CARVED_KABANYT);
	public static final DeferredItem<Item> KABANYT_STAIRS = block(WorldExpansionModBlocks.KABANYT_STAIRS);
	public static final DeferredItem<Item> KABANYT_SLAB = block(WorldExpansionModBlocks.KABANYT_SLAB);
	public static final DeferredItem<Item> KABANYT_WALL = block(WorldExpansionModBlocks.KABANYT_WALL);
	public static final DeferredItem<Item> KABANYT_BRICKS_STAIRS = block(WorldExpansionModBlocks.KABANYT_BRICKS_STAIRS);
	public static final DeferredItem<Item> KABANYT_BRICKS_SLAB = block(WorldExpansionModBlocks.KABANYT_BRICKS_SLAB);
	public static final DeferredItem<Item> KABANYT_BRICKS_WALL = block(WorldExpansionModBlocks.KABANYT_BRICKS_WALL);
	public static final DeferredItem<Item> KABANYT_TILE_STAIRS = block(WorldExpansionModBlocks.KABANYT_TILE_STAIRS);
	public static final DeferredItem<Item> KABANYT_TILE_SLAB = block(WorldExpansionModBlocks.KABANYT_TILE_SLAB);
	public static final DeferredItem<Item> KABANYT_TILE_WALL = block(WorldExpansionModBlocks.KABANYT_TILE_WALL);
	public static final DeferredItem<Item> YELLOW_ASTILBA = block(WorldExpansionModBlocks.YELLOW_ASTILBA);
	public static final DeferredItem<Item> TIGER_ALOE_VERA = block(WorldExpansionModBlocks.TIGER_ALOE_VERA);
	public static final DeferredItem<Item> LEAVE_OF_ALOE_VERA = REGISTRY.register("leave_of_aloe_vera", LeaveOfAloeVeraItem::new);
	public static final DeferredItem<Item> TUMBLEWEED = block(WorldExpansionModBlocks.TUMBLEWEED);
	public static final DeferredItem<Item> JUDAS_FRUIT = REGISTRY.register("judas_fruit", JudasFruitItem::new);
	public static final DeferredItem<Item> SPLIT_JUDAS_FRUIT = REGISTRY.register("split_judas_fruit", SplitJudasFruitItem::new);
	public static final DeferredItem<Item> PIECE_TOTEM_OF_UNDYING = REGISTRY.register("piece_totem_of_undying", PieceTotemOfUndyingItem::new);
	public static final DeferredItem<Item> COPPER_HORN0 = REGISTRY.register("copper_horn0", CopperHornItem::new);
	public static final DeferredItem<Item> COPPER_HORN1 = REGISTRY.register("copper_horn1", CopperHorn1Item::new);
	public static final DeferredItem<Item> COPPER_HORN2 = REGISTRY.register("copper_horn2", CopperHorn2Item::new);
	public static final DeferredItem<Item> COPPER_HORN3 = REGISTRY.register("copper_horn3", CopperHorn3Item::new);
	public static final DeferredItem<Item> COPPER_HORN4 = REGISTRY.register("copper_horn4", CopperHorn4Item::new);
	public static final DeferredItem<Item> COPPER_HORN5 = REGISTRY.register("copper_horn5", CopperHorn5Item::new);
	public static final DeferredItem<Item> COPPER_HORN6 = REGISTRY.register("copper_horn6", CopperHorn6Item::new);
	public static final DeferredItem<Item> COPPER_HORN7 = REGISTRY.register("copper_horn7", CopperHorn7Item::new);
	public static final DeferredItem<Item> COPPER_HORN8 = REGISTRY.register("copper_horn8", CopperHorn8Item::new);
	public static final DeferredItem<Item> COPPER_HORN9 = REGISTRY.register("copper_horn9", CopperHorn9Item::new);
	public static final DeferredItem<Item> SUSPICIOUS_MUD = block(WorldExpansionModBlocks.SUSPICIOUS_MUD);
	public static final DeferredItem<Item> ALOE_VERA = block(WorldExpansionModBlocks.ALOE_VERA);
	public static final DeferredItem<Item> ASTILBA = block(WorldExpansionModBlocks.ASTILBA);
	public static final DeferredItem<Item> LITTLE_SHROOMLIGHT = block(WorldExpansionModBlocks.LITTLE_SHROOMLIGHT);
	public static final DeferredItem<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", TitaniumIngotItem::new);
	public static final DeferredItem<Item> TITANIUM_ORE = block(WorldExpansionModBlocks.TITANIUM_ORE);
	public static final DeferredItem<Item> TITANIUM_BLOCK = block(WorldExpansionModBlocks.TITANIUM_BLOCK);
	public static final DeferredItem<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", RawTitaniumItem::new);
	public static final DeferredItem<Item> RAW_TITANIUM_BLOCK = block(WorldExpansionModBlocks.RAW_TITANIUM_BLOCK);
	public static final DeferredItem<Item> MULTI_CRAFTING_TABLE = block(WorldExpansionModBlocks.MULTI_CRAFTING_TABLE);
	public static final DeferredItem<Item> DEEPSLATE_TITANIUM_ORE = block(WorldExpansionModBlocks.DEEPSLATE_TITANIUM_ORE);
	public static final DeferredItem<Item> BRUTE_ARMOR_TRIM_SMITHING_TEMPLATE = REGISTRY.register("brute_armor_trim_smithing_template", BruteArmorTrimSmithingTemplateItem::new);
	public static final DeferredItem<Item> TUMBLEWEED_ITEM = REGISTRY.register("tumbleweed_item", TumbleweedProjectileItem::new);
	public static final DeferredItem<Item> BAOBAB_SAPLING = block(WorldExpansionModBlocks.BAOBAB_SAPLING);
	public static final DeferredItem<Item> ICE_SKATES_BOOTS = REGISTRY.register("ice_skates_boots", IceSkatesItem.Boots::new);
	public static final DeferredItem<Item> KABANYT_COAL_ORE = block(WorldExpansionModBlocks.KABANYT_COAL_ORE);
	public static final DeferredItem<Item> KABANYT_COPPER_ORE = block(WorldExpansionModBlocks.KABANYT_COPPER_ORE);
	public static final DeferredItem<Item> KABANYT_DIAMOND_ORE = block(WorldExpansionModBlocks.KABANYT_DIAMOND_ORE);
	public static final DeferredItem<Item> KABANYT_EMERALD_ORE = block(WorldExpansionModBlocks.KABANYT_EMERALD_ORE);
	public static final DeferredItem<Item> KABANYT_GOLD_ORE = block(WorldExpansionModBlocks.KABANYT_GOLD_ORE);
	public static final DeferredItem<Item> KABANYT_LAPIS_ORE = block(WorldExpansionModBlocks.KABANYT_LAPIS_ORE);
	public static final DeferredItem<Item> KABANYT_IRON_ORE = block(WorldExpansionModBlocks.KABANYT_IRON_ORE);
	public static final DeferredItem<Item> KABANYT_REDSTONE_ORE = block(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE);
	public static final DeferredItem<Item> KABANYT_TITANIUM_ORE = block(WorldExpansionModBlocks.KABANYT_TITANIUM_ORE);
	public static final DeferredItem<Item> KABANYT_REDSTONE_ORE_ON = block(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE_ON);
	public static final DeferredItem<Item> JUDAS_FRUIT_PLANT = block(WorldExpansionModBlocks.JUDAS_FRUIT_PLANT);
	public static final DeferredItem<Item> WINDOMETER = block(WorldExpansionModBlocks.WINDOMETER);
	public static final DeferredItem<Item> MINI_FIREFLIES_SPAWN_EGG = REGISTRY.register("mini_fireflies_spawn_egg", () -> new DeferredSpawnEggItem(WorldExpansionModEntities.MINI_FIREFLIES, -13223389, -4197376, new Item.Properties()));
	public static final DeferredItem<Item> BOTTLE = REGISTRY.register(WorldExpansionModBlocks.BOTTLE.getId().getPath(), () -> new BottleDisplayItem(WorldExpansionModBlocks.BOTTLE.get(), new Item.Properties()));
	public static final DeferredItem<Item> BOTTLE_WITH_MINI_FIREFLIES = REGISTRY.register(WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.getId().getPath(),
			() -> new BottleWithMiniFirefliesDisplayItem(WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.get(), new Item.Properties()));
	public static final DeferredItem<Item> LIVE_SHOTGUN_BULLET = REGISTRY.register("live_shotgun_bullet", LiveShotgunBulletItem::new);
	public static final DeferredItem<Item> BLANK_SHOTGUN_BULLET = REGISTRY.register("blank_shotgun_bullet", BlankShotgunBulletItem::new);
	public static final DeferredItem<Item> GAMBLERS_SHOTGUN = REGISTRY.register("gamblers_shotgun", GamblersShotgunItem::new);
	public static final DeferredItem<Item> GAMBLERS_SHOTGUN_CHAMBER = REGISTRY.register("gamblers_shotgun_chamber", GamblersShotgunChamberItem::new);
	public static final DeferredItem<Item> MYSTERIOUS_DOOR = doubleBlock(WorldExpansionModBlocks.MYSTERIOUS_DOOR);
	public static final DeferredItem<Item> MUSIC_DISC_DESTROYER = REGISTRY.register("music_disc_destroyer", MusicDiscDestroyerItem::new);
	public static final DeferredItem<Item> HAY_BLOCK_STAIRS = block(WorldExpansionModBlocks.HAY_BLOCK_STAIRS);
	public static final DeferredItem<Item> HAY_BLOCK_SLAB = block(WorldExpansionModBlocks.HAY_BLOCK_SLAB);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void clientLoad(FMLClientSetupEvent event) {
			event.enqueueWork(() -> {
				ItemProperties.register(GAMBLERS_SHOTGUN_CHAMBER.get(), ResourceLocation.parse("world_expansion:gamblers_shotgun_chamber_live"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GamblersShotgunChamberZnachieniieSvoistvaProcedure.execute(itemStackToRender));
				ItemProperties.register(GAMBLERS_SHOTGUN_CHAMBER.get(), ResourceLocation.parse("world_expansion:gamblers_shotgun_chamber_blank"),
						(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GamblersShotgunChamberZnachieniieSvoistva2Procedure.execute(itemStackToRender));
			});
		}
	}
}
