
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorldExpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WorldExpansionMod.MODID);
	public static final RegistryObject<Item> BAOBAB_WOOD = block(WorldExpansionModBlocks.BAOBAB_WOOD);
	public static final RegistryObject<Item> BAOBAB_LOG = block(WorldExpansionModBlocks.BAOBAB_LOG);
	public static final RegistryObject<Item> BAOBAB_PLANKS = block(WorldExpansionModBlocks.BAOBAB_PLANKS);
	public static final RegistryObject<Item> BAOBAB_LEAVES = block(WorldExpansionModBlocks.BAOBAB_LEAVES);
	public static final RegistryObject<Item> BAOBAB_STAIRS = block(WorldExpansionModBlocks.BAOBAB_STAIRS);
	public static final RegistryObject<Item> BAOBAB_SLAB = block(WorldExpansionModBlocks.BAOBAB_SLAB);
	public static final RegistryObject<Item> BAOBAB_FENCE = block(WorldExpansionModBlocks.BAOBAB_FENCE);
	public static final RegistryObject<Item> BAOBAB_FENCE_GATE = block(WorldExpansionModBlocks.BAOBAB_FENCE_GATE);
	public static final RegistryObject<Item> BAOBAB_PRESSURE_PLATE = block(WorldExpansionModBlocks.BAOBAB_PRESSURE_PLATE);
	public static final RegistryObject<Item> BAOBAB_BUTTON = block(WorldExpansionModBlocks.BAOBAB_BUTTON);
	public static final RegistryObject<Item> STRIPPED_BAOBAB_WOOD = block(WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD);
	public static final RegistryObject<Item> STRIPPED_BAOBAB_LOG = block(WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG);
	public static final RegistryObject<Item> BAOBAB_TRAPDOOR = block(WorldExpansionModBlocks.BAOBAB_TRAPDOOR);
	public static final RegistryObject<Item> ASTILBA_MULTICOLORED = block(WorldExpansionModBlocks.ASTILBA_MULTICOLORED);
	public static final RegistryObject<Item> BAOBAB_DOOR = doubleBlock(WorldExpansionModBlocks.BAOBAB_DOOR);
	public static final RegistryObject<Item> KABANYT = block(WorldExpansionModBlocks.KABANYT);
	public static final RegistryObject<Item> KABANYT_BRICKS = block(WorldExpansionModBlocks.KABANYT_BRICKS);
	public static final RegistryObject<Item> KABANYT_TILES = block(WorldExpansionModBlocks.KABANYT_TILES);
	public static final RegistryObject<Item> CARVED_KABANYT = block(WorldExpansionModBlocks.CARVED_KABANYT);
	public static final RegistryObject<Item> KABANYT_STAIRS = block(WorldExpansionModBlocks.KABANYT_STAIRS);
	public static final RegistryObject<Item> KABANYT_SLAB = block(WorldExpansionModBlocks.KABANYT_SLAB);
	public static final RegistryObject<Item> KABANYT_WALL = block(WorldExpansionModBlocks.KABANYT_WALL);
	public static final RegistryObject<Item> KABANYT_BRICKS_STAIRS = block(WorldExpansionModBlocks.KABANYT_BRICKS_STAIRS);
	public static final RegistryObject<Item> KABANYT_BRICKS_SLAB = block(WorldExpansionModBlocks.KABANYT_BRICKS_SLAB);
	public static final RegistryObject<Item> KABANYT_BRICKS_WALL = block(WorldExpansionModBlocks.KABANYT_BRICKS_WALL);
	public static final RegistryObject<Item> KABANYT_TILE_STAIRS = block(WorldExpansionModBlocks.KABANYT_TILE_STAIRS);
	public static final RegistryObject<Item> KABANYT_TILE_SLAB = block(WorldExpansionModBlocks.KABANYT_TILE_SLAB);
	public static final RegistryObject<Item> KABANYT_TILE_WALL = block(WorldExpansionModBlocks.KABANYT_TILE_WALL);
	public static final RegistryObject<Item> YELLOW_ASTILBA = block(WorldExpansionModBlocks.YELLOW_ASTILBA);
	public static final RegistryObject<Item> TIGER_ALOE_VERA = block(WorldExpansionModBlocks.TIGER_ALOE_VERA);
	public static final RegistryObject<Item> LEAVE_OF_ALOE_VERA = REGISTRY.register("leave_of_aloe_vera", () -> new LeaveOfAloeVeraItem());
	public static final RegistryObject<Item> TUMBLEWEED = block(WorldExpansionModBlocks.TUMBLEWEED);
	public static final RegistryObject<Item> JUDAS_FRUIT = REGISTRY.register("judas_fruit", () -> new JudasFruitItem());
	public static final RegistryObject<Item> SPLIT_JUDAS_FRUIT = REGISTRY.register("split_judas_fruit", () -> new SplitJudasFruitItem());
	public static final RegistryObject<Item> MUSIC_DISC_DESTROYER = REGISTRY.register("music_disc_destroyer", () -> new MusicDiscDestroyerItem());
	public static final RegistryObject<Item> PIECE_TOTEM_OF_UNDYING = REGISTRY.register("piece_totem_of_undying", () -> new PieceTotemOfUndyingItem());
	public static final RegistryObject<Item> COPPER_HORN0 = REGISTRY.register("copper_horn0", () -> new CopperHornItem());
	public static final RegistryObject<Item> COPPER_HORN1 = REGISTRY.register("copper_horn1", () -> new CopperHorn1Item());
	public static final RegistryObject<Item> COPPER_HORN2 = REGISTRY.register("copper_horn2", () -> new CopperHorn2Item());
	public static final RegistryObject<Item> COPPER_HORN3 = REGISTRY.register("copper_horn3", () -> new CopperHorn3Item());
	public static final RegistryObject<Item> COPPER_HORN4 = REGISTRY.register("copper_horn4", () -> new CopperHorn4Item());
	public static final RegistryObject<Item> COPPER_HORN5 = REGISTRY.register("copper_horn5", () -> new CopperHorn5Item());
	public static final RegistryObject<Item> COPPER_HORN6 = REGISTRY.register("copper_horn6", () -> new CopperHorn6Item());
	public static final RegistryObject<Item> COPPER_HORN7 = REGISTRY.register("copper_horn7", () -> new CopperHorn7Item());
	public static final RegistryObject<Item> COPPER_HORN8 = REGISTRY.register("copper_horn8", () -> new CopperHorn8Item());
	public static final RegistryObject<Item> COPPER_HORN9 = REGISTRY.register("copper_horn9", () -> new CopperHorn9Item());
	public static final RegistryObject<Item> SUSPICIOUS_MUD = block(WorldExpansionModBlocks.SUSPICIOUS_MUD);
	public static final RegistryObject<Item> ALOE_VERA = block(WorldExpansionModBlocks.ALOE_VERA);
	public static final RegistryObject<Item> ASTILBA = block(WorldExpansionModBlocks.ASTILBA);
	public static final RegistryObject<Item> LITTLE_SHROOMLIGHT = block(WorldExpansionModBlocks.LITTLE_SHROOMLIGHT);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(WorldExpansionModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(WorldExpansionModBlocks.TITANIUM_BLOCK);
	public static final RegistryObject<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", () -> new RawTitaniumItem());
	public static final RegistryObject<Item> RAW_TITANIUM_BLOCK = block(WorldExpansionModBlocks.RAW_TITANIUM_BLOCK);
	public static final RegistryObject<Item> MULTI_CRAFTING_TABLE = block(WorldExpansionModBlocks.MULTI_CRAFTING_TABLE);
	public static final RegistryObject<Item> DEEPSLATE_TITANIUM_ORE = block(WorldExpansionModBlocks.DEEPSLATE_TITANIUM_ORE);
	public static final RegistryObject<Item> BRUTE_ARMOR_TRIM_SMITHING_TEMPLATE = REGISTRY.register("brute_armor_trim_smithing_template", () -> new BruteArmorTrimSmithingTemplateItem());
	public static final RegistryObject<Item> TUMBLEWEED_ITEM = REGISTRY.register("tumbleweed_item", () -> new TumbleweedProjectileItem());
	public static final RegistryObject<Item> BAOBAB_SAPLING = block(WorldExpansionModBlocks.BAOBAB_SAPLING);
	public static final RegistryObject<Item> ICE_SKATES_BOOTS = REGISTRY.register("ice_skates_boots", () -> new IceSkatesItem.Boots());
	public static final RegistryObject<Item> KABANYT_COAL_ORE = block(WorldExpansionModBlocks.KABANYT_COAL_ORE);
	public static final RegistryObject<Item> KABANYT_COPPER_ORE = block(WorldExpansionModBlocks.KABANYT_COPPER_ORE);
	public static final RegistryObject<Item> KABANYT_DIAMOND_ORE = block(WorldExpansionModBlocks.KABANYT_DIAMOND_ORE);
	public static final RegistryObject<Item> KABANYT_EMERALD_ORE = block(WorldExpansionModBlocks.KABANYT_EMERALD_ORE);
	public static final RegistryObject<Item> KABANYT_GOLD_ORE = block(WorldExpansionModBlocks.KABANYT_GOLD_ORE);
	public static final RegistryObject<Item> KABANYT_LAPIS_ORE = block(WorldExpansionModBlocks.KABANYT_LAPIS_ORE);
	public static final RegistryObject<Item> KABANYT_IRON_ORE = block(WorldExpansionModBlocks.KABANYT_IRON_ORE);
	public static final RegistryObject<Item> KABANYT_REDSTONE_ORE = block(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE);
	public static final RegistryObject<Item> KABANYT_TITANIUM_ORE = block(WorldExpansionModBlocks.KABANYT_TITANIUM_ORE);
	public static final RegistryObject<Item> KABANYT_REDSTONE_ORE_ON = block(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE_ON);
	public static final RegistryObject<Item> JUDAS_FRUIT_PLANT = block(WorldExpansionModBlocks.JUDAS_FRUIT_PLANT);
	public static final RegistryObject<Item> WINDOMETER = block(WorldExpansionModBlocks.WINDOMETER);
	public static final RegistryObject<Item> MINI_FIREFLIES_SPAWN_EGG = REGISTRY.register("mini_fireflies_spawn_egg", () -> new ForgeSpawnEggItem(WorldExpansionModEntities.MINI_FIREFLIES, -13223389, -4197376, new Item.Properties()));
	public static final RegistryObject<Item> BOTTLE = REGISTRY.register(WorldExpansionModBlocks.BOTTLE.getId().getPath(), () -> new BottleDisplayItem(WorldExpansionModBlocks.BOTTLE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BOTTLE_WITH_MINI_FIREFLIES = REGISTRY.register(WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.getId().getPath(),
			() -> new BottleWithMiniFirefliesDisplayItem(WorldExpansionModBlocks.BOTTLE_WITH_MINI_FIREFLIES.get(), new Item.Properties()));
	public static final RegistryObject<Item> LIVE_SHOTGUN_BULLET = REGISTRY.register("live_shotgun_bullet", () -> new LiveShotgunBulletItem());
	public static final RegistryObject<Item> BLANK_SHOTGUN_BULLET = REGISTRY.register("blank_shotgun_bullet", () -> new BlankShotgunBulletItem());
	public static final RegistryObject<Item> GAMBLERS_SHOTGUN = REGISTRY.register("gamblers_shotgun", () -> new GamblersShotgunItem());
	public static final RegistryObject<Item> GAMBLERS_SHOTGUN_CHAMBER = REGISTRY.register("gamblers_shotgun_chamber", () -> new GamblersShotgunChamberItem());
	public static final RegistryObject<Item> ANCIENT_CORRIDORS_SPAWNER = block(WorldExpansionModBlocks.ANCIENT_CORRIDORS_SPAWNER);
	public static final RegistryObject<Item> MYSTERIOUS_DOOR = doubleBlock(WorldExpansionModBlocks.MYSTERIOUS_DOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(GAMBLERS_SHOTGUN_CHAMBER.get(), new ResourceLocation("world_expansion:gamblers_shotgun_chamber_live"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GamblersShotgunChamberZnachieniieSvoistvaProcedure.execute(itemStackToRender));
			ItemProperties.register(GAMBLERS_SHOTGUN_CHAMBER.get(), new ResourceLocation("world_expansion:gamblers_shotgun_chamber_blank"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) GamblersShotgunChamberZnachieniieSvoistva2Procedure.execute(itemStackToRender));
		});
	}
}
