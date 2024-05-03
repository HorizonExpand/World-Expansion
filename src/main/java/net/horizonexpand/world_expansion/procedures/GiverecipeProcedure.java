package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiverecipeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.BRUTE_ARMOR_TRIM_SMITHING_TEMPLATE.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.KABANYT.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.DIAMOND)) : false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:brute_armor_trim_smithing_template")});
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:glass"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))))
				: false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("minecraft:glass_bottle")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GLASS_BOTTLE)) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:bottle_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.BOTTLE.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:glass_bottle_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.PIECE_TOTEM_OF_UNDYING.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:totem_of_undying_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.TITANIUM_ORE.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_stone_ore_smelting")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_stone_ore_blasting")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.DEEPSLATE_TITANIUM_ORE.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_deepslate_ore_smelting")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_deepslate_ore_blasting")});
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.TITANIUM_INGOT.get())) : false) || (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("forge:stripped_log"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))))
				: false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:multi_crafting_table_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.TITANIUM_INGOT.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_block_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModItems.RAW_TITANIUM.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_blasting")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:titanium_ingot_from_smelting")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:raw_titanium_block_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.RAW_TITANIUM_BLOCK.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:raw_titanium_from_block")});
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.COPPER_INGOT)) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.GOAT_HORN)) : false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn0_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn1_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn2_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn3_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn4_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn5_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn6_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn7_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn8_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:copper_horn9_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.BAOBAB_LOG.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_wood_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_planks_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_log_to_charcoal")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.BAOBAB_WOOD.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_planks_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_wood_to_charcoal")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:stripped_baobab_wood_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_planks_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:stripped_baobab_log_to_charcoal")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_planks_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:stripped_baobab_wood_to_charcoal")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.BAOBAB_PLANKS.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_stairs_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_slab_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_fence_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_pressure_plate_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_button_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_door_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:baobab_trapdoor_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.ASTILBA.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:astilba_dye_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.YELLOW_ASTILBA.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:yellow_astilba_dye_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.KABANYT.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:carved_kabanyt_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_stairs_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_stairs_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_slab_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_slab_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_wall_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_wall_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_stairs_cut_recipe_2")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_slab_cut_recipe_2")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_wall_cut_recipe_2")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_stairs_cut_recipe_2")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_slab_cut_recipe_2")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_wall_cut_recipe_2")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.KABANYT_BRICKS.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_stairs_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_stairs_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_slab_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_slab_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_wall_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_bricks_wall_cut_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.KABANYT_TILES.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_stairs_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_stairs_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_slab_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_slab_cut_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_wall_craft_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:kabanyt_tiles_wall_cut_recipe")});
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WorldExpansionModBlocks.KABANYT_BRICKS_SLAB.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("world_expansion:carved_kabanyt_craft_recipe")});
		}
	}
}
