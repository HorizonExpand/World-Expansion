
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.horizonexpand.world_expansion.block.custom.ModHangingSignBlock;
import net.horizonexpand.world_expansion.block.custom.ModStandingSignBlock;
import net.horizonexpand.world_expansion.block.custom.ModWallHangingSignBlock;
import net.horizonexpand.world_expansion.block.custom.ModWallSignBlock;
import net.horizonexpand.world_expansion.util.ModWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.horizonexpand.world_expansion.block.YellowAstilbaBlock;
import net.horizonexpand.world_expansion.block.WindometerBlock;
import net.horizonexpand.world_expansion.block.TumbleweedBlock;
import net.horizonexpand.world_expansion.block.TitaniumOreBlock;
import net.horizonexpand.world_expansion.block.TitaniumBlockBlock;
import net.horizonexpand.world_expansion.block.SuspiciousMudBlock;
import net.horizonexpand.world_expansion.block.StrippedbaobabwoodBlock;
import net.horizonexpand.world_expansion.block.StrippedbaobablogBlock;
import net.horizonexpand.world_expansion.block.RawTitaniumBlockBlock;
import net.horizonexpand.world_expansion.block.MysteriousDoorBlock;
import net.horizonexpand.world_expansion.block.MultiCraftingTableBlock;
import net.horizonexpand.world_expansion.block.LittleShroomlightBlock;
import net.horizonexpand.world_expansion.block.KabanytwallBlock;
import net.horizonexpand.world_expansion.block.KabanyttileswallBlock;
import net.horizonexpand.world_expansion.block.KabanyttilesstairsBlock;
import net.horizonexpand.world_expansion.block.KabanyttilesslabBlock;
import net.horizonexpand.world_expansion.block.KabanyttilesBlock;
import net.horizonexpand.world_expansion.block.KabanytstairsBlock;
import net.horizonexpand.world_expansion.block.KabanytslabBlock;
import net.horizonexpand.world_expansion.block.KabanytbrickswallBlock;
import net.horizonexpand.world_expansion.block.KabanytbricksstairsBlock;
import net.horizonexpand.world_expansion.block.KabanytbricksslabBlock;
import net.horizonexpand.world_expansion.block.KabanytbricksBlock;
import net.horizonexpand.world_expansion.block.KabanytTitaniumOreBlock;
import net.horizonexpand.world_expansion.block.KabanytRedstoneOreOnBlock;
import net.horizonexpand.world_expansion.block.KabanytRedstoneOreBlock;
import net.horizonexpand.world_expansion.block.KabanytLapisOreBlock;
import net.horizonexpand.world_expansion.block.KabanytIronOreBlock;
import net.horizonexpand.world_expansion.block.KabanytGoldOreBlock;
import net.horizonexpand.world_expansion.block.KabanytEmeraldOreBlock;
import net.horizonexpand.world_expansion.block.KabanytDiamondOreBlock;
import net.horizonexpand.world_expansion.block.KabanytCopperOreBlock;
import net.horizonexpand.world_expansion.block.KabanytCoalOreBlock;
import net.horizonexpand.world_expansion.block.KabanytBlock;
import net.horizonexpand.world_expansion.block.JudasFruitPlantBlock;
import net.horizonexpand.world_expansion.block.DeepslateTitaniumOreBlock;
import net.horizonexpand.world_expansion.block.CarvedkabanytBlock;
import net.horizonexpand.world_expansion.block.BottleWithMiniFirefliesBlock;
import net.horizonexpand.world_expansion.block.BottleBlock;
import net.horizonexpand.world_expansion.block.BaobabtrapdoorBlock;
import net.horizonexpand.world_expansion.block.BaobabdoorBlock;
import net.horizonexpand.world_expansion.block.BaobabWoodBlock;
import net.horizonexpand.world_expansion.block.BaobabStairsBlock;
import net.horizonexpand.world_expansion.block.BaobabSlabBlock;
import net.horizonexpand.world_expansion.block.BaobabSaplingBlock;
import net.horizonexpand.world_expansion.block.BaobabPressurePlateBlock;
import net.horizonexpand.world_expansion.block.BaobabPlanksBlock;
import net.horizonexpand.world_expansion.block.BaobabLogBlock;
import net.horizonexpand.world_expansion.block.BaobabLeavesBlock;
import net.horizonexpand.world_expansion.block.BaobabFenceGateBlock;
import net.horizonexpand.world_expansion.block.BaobabFenceBlock;
import net.horizonexpand.world_expansion.block.BaobabButtonBlock;
import net.horizonexpand.world_expansion.block.AstilbamulticoloredBlock;
import net.horizonexpand.world_expansion.block.AstilbaBlock;
import net.horizonexpand.world_expansion.block.AncientCorridorsSpawnerBlock;
import net.horizonexpand.world_expansion.block.AloeVeraTigerBlock;
import net.horizonexpand.world_expansion.block.AloeVeraBlock;
import net.horizonexpand.world_expansion.WorldExpansionMod;

import java.util.function.Supplier;

import static software.bernie.example.registry.BlockRegistry.BLOCKS;

public class WorldExpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WorldExpansionMod.MODID);
	public static final RegistryObject<Block> BAOBAB_WOOD = REGISTRY.register("baobab_wood", () -> new BaobabWoodBlock());
	public static final RegistryObject<Block> BAOBAB_LOG = REGISTRY.register("baobab_log", () -> new BaobabLogBlock());
	public static final RegistryObject<Block> BAOBAB_PLANKS = REGISTRY.register("baobab_planks", () -> new BaobabPlanksBlock());
	public static final RegistryObject<Block> BAOBAB_LEAVES = REGISTRY.register("baobab_leaves", () -> new BaobabLeavesBlock());
	public static final RegistryObject<Block> BAOBAB_STAIRS = REGISTRY.register("baobab_stairs", () -> new BaobabStairsBlock());
	public static final RegistryObject<Block> BAOBAB_SLAB = REGISTRY.register("baobab_slab", () -> new BaobabSlabBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE = REGISTRY.register("baobab_fence", () -> new BaobabFenceBlock());
	public static final RegistryObject<Block> BAOBAB_FENCE_GATE = REGISTRY.register("baobab_fence_gate", () -> new BaobabFenceGateBlock());
	public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = REGISTRY.register("baobab_pressure_plate", () -> new BaobabPressurePlateBlock());
	public static final RegistryObject<Block> BAOBAB_BUTTON = REGISTRY.register("baobab_button", () -> new BaobabButtonBlock());
	public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = REGISTRY.register("stripped_baobab_wood", () -> new StrippedbaobabwoodBlock());
	public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = REGISTRY.register("stripped_baobab_log", () -> new StrippedbaobablogBlock());
	public static final RegistryObject<Block> BAOBAB_TRAPDOOR = REGISTRY.register("baobab_trapdoor", () -> new BaobabtrapdoorBlock());
	public static final RegistryObject<Block> ASTILBA_MULTICOLORED = REGISTRY.register("astilba_multicolored", () -> new AstilbamulticoloredBlock());
	public static final RegistryObject<Block> BAOBAB_DOOR = REGISTRY.register("baobab_door", () -> new BaobabdoorBlock());
	public static final RegistryObject<Block> KABANYT = REGISTRY.register("kabanyt", () -> new KabanytBlock());
	public static final RegistryObject<Block> KABANYT_BRICKS = REGISTRY.register("kabanyt_bricks", () -> new KabanytbricksBlock());
	public static final RegistryObject<Block> KABANYT_TILES = REGISTRY.register("kabanyt_tiles", () -> new KabanyttilesBlock());
	public static final RegistryObject<Block> CARVED_KABANYT = REGISTRY.register("carved_kabanyt", () -> new CarvedkabanytBlock());
	public static final RegistryObject<Block> KABANYT_STAIRS = REGISTRY.register("kabanyt_stairs", () -> new KabanytstairsBlock());
	public static final RegistryObject<Block> KABANYT_SLAB = REGISTRY.register("kabanyt_slab", () -> new KabanytslabBlock());
	public static final RegistryObject<Block> KABANYT_WALL = REGISTRY.register("kabanyt_wall", () -> new KabanytwallBlock());
	public static final RegistryObject<Block> KABANYT_BRICKS_STAIRS = REGISTRY.register("kabanyt_bricks_stairs", () -> new KabanytbricksstairsBlock());
	public static final RegistryObject<Block> KABANYT_BRICKS_SLAB = REGISTRY.register("kabanyt_bricks_slab", () -> new KabanytbricksslabBlock());
	public static final RegistryObject<Block> KABANYT_BRICKS_WALL = REGISTRY.register("kabanyt_bricks_wall", () -> new KabanytbrickswallBlock());
	public static final RegistryObject<Block> KABANYT_TILE_STAIRS = REGISTRY.register("kabanyt_tile_stairs", () -> new KabanyttilesstairsBlock());
	public static final RegistryObject<Block> KABANYT_TILE_SLAB = REGISTRY.register("kabanyt_tile_slab", () -> new KabanyttilesslabBlock());
	public static final RegistryObject<Block> KABANYT_TILE_WALL = REGISTRY.register("kabanyt_tile_wall", () -> new KabanyttileswallBlock());
	public static final RegistryObject<Block> YELLOW_ASTILBA = REGISTRY.register("yellow_astilba", () -> new YellowAstilbaBlock());
	public static final RegistryObject<Block> TIGER_ALOE_VERA = REGISTRY.register("tiger_aloe_vera", () -> new AloeVeraTigerBlock());
	public static final RegistryObject<Block> TUMBLEWEED = REGISTRY.register("tumbleweed", () -> new TumbleweedBlock());
	public static final RegistryObject<Block> SUSPICIOUS_MUD = REGISTRY.register("suspicious_mud", () -> new SuspiciousMudBlock());
	public static final RegistryObject<Block> ALOE_VERA = REGISTRY.register("aloe_vera", () -> new AloeVeraBlock());
	public static final RegistryObject<Block> ASTILBA = REGISTRY.register("astilba", () -> new AstilbaBlock());
	public static final RegistryObject<Block> LITTLE_SHROOMLIGHT = REGISTRY.register("little_shroomlight", () -> new LittleShroomlightBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = REGISTRY.register("raw_titanium_block", () -> new RawTitaniumBlockBlock());
	public static final RegistryObject<Block> MULTI_CRAFTING_TABLE = REGISTRY.register("multi_crafting_table", () -> new MultiCraftingTableBlock());
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = REGISTRY.register("deepslate_titanium_ore", () -> new DeepslateTitaniumOreBlock());
	public static final RegistryObject<Block> BAOBAB_SAPLING = REGISTRY.register("baobab_sapling", () -> new BaobabSaplingBlock());
	public static final RegistryObject<Block> KABANYT_COAL_ORE = REGISTRY.register("kabanyt_coal_ore", () -> new KabanytCoalOreBlock());
	public static final RegistryObject<Block> KABANYT_COPPER_ORE = REGISTRY.register("kabanyt_copper_ore", () -> new KabanytCopperOreBlock());
	public static final RegistryObject<Block> KABANYT_DIAMOND_ORE = REGISTRY.register("kabanyt_diamond_ore", () -> new KabanytDiamondOreBlock());
	public static final RegistryObject<Block> KABANYT_EMERALD_ORE = REGISTRY.register("kabanyt_emerald_ore", () -> new KabanytEmeraldOreBlock());
	public static final RegistryObject<Block> KABANYT_GOLD_ORE = REGISTRY.register("kabanyt_gold_ore", () -> new KabanytGoldOreBlock());
	public static final RegistryObject<Block> KABANYT_LAPIS_ORE = REGISTRY.register("kabanyt_lapis_ore", () -> new KabanytLapisOreBlock());
	public static final RegistryObject<Block> KABANYT_IRON_ORE = REGISTRY.register("kabanyt_iron_ore", () -> new KabanytIronOreBlock());
	public static final RegistryObject<Block> KABANYT_REDSTONE_ORE = REGISTRY.register("kabanyt_redstone_ore", () -> new KabanytRedstoneOreBlock());
	public static final RegistryObject<Block> KABANYT_TITANIUM_ORE = REGISTRY.register("kabanyt_titanium_ore", () -> new KabanytTitaniumOreBlock());
	public static final RegistryObject<Block> KABANYT_REDSTONE_ORE_ON = REGISTRY.register("kabanyt_redstone_ore_on", () -> new KabanytRedstoneOreOnBlock());
	public static final RegistryObject<Block> JUDAS_FRUIT_PLANT = REGISTRY.register("judas_fruit_plant", () -> new JudasFruitPlantBlock());
	public static final RegistryObject<Block> WINDOMETER = REGISTRY.register("windometer", () -> new WindometerBlock());
	public static final RegistryObject<Block> BOTTLE = REGISTRY.register("bottle", () -> new BottleBlock());
	public static final RegistryObject<Block> BOTTLE_WITH_MINI_FIREFLIES = REGISTRY.register("bottle_with_mini_fireflies", () -> new BottleWithMiniFirefliesBlock());
	public static final RegistryObject<Block> ANCIENT_CORRIDORS_SPAWNER = REGISTRY.register("ancient_corridors_spawner", () -> new AncientCorridorsSpawnerBlock());
	public static final RegistryObject<Block> MYSTERIOUS_DOOR = REGISTRY.register("mysterious_door", () -> new MysteriousDoorBlock());
	// Start of user code block custom blocks
	public static final RegistryObject<Block> BAOBAB_SIGN = REGISTRY.register("baobab_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BAOBAB));
	public static final RegistryObject<Block> BAOBAB_WALL_SIGN = REGISTRY.register("baobab_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BAOBAB));

	public static final RegistryObject<Block> BAOBAB_HANGING_SIGN = REGISTRY.register("baobab_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BAOBAB));
	public static final RegistryObject<Block> BAOBAB_WALL_HANGING_SIGN = REGISTRY.register("baobab_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BAOBAB));

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
		return WorldExpansionModItems.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
	// End of user code block custom blocks
}
