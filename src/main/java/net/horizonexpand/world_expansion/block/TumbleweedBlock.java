
package net.horizonexpand.world_expansion.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.procedures.TumbleweedTickProcedure;
import net.horizonexpand.world_expansion.procedures.TumbleweedPriShchielchkiePKMPoRastieniiuProcedure;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class TumbleweedBlock extends FlowerBlock {
	public TumbleweedBlock() {
		super(() -> MobEffects.DIG_SLOWDOWN, 10,
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).randomTicks().sound(SoundType.MANGROVE_ROOTS).instabreak().noCollission().replaceable().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(1, 1, 1, 15, 15, 15).move(offset.x, offset.y, offset.z);
	}

	@Override
	public int getEffectDuration() {
		return 10;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(WorldExpansionModItems.TUMBLEWEED_ITEM.get());
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(WorldExpansionModBlocks.BAOBAB_WOOD.get()) || groundState.is(WorldExpansionModBlocks.BAOBAB_LOG.get()) || groundState.is(WorldExpansionModBlocks.BAOBAB_PLANKS.get())
				|| groundState.is(WorldExpansionModBlocks.STRIPPED_BAOBAB_WOOD.get()) || groundState.is(WorldExpansionModBlocks.STRIPPED_BAOBAB_LOG.get()) || groundState.is(WorldExpansionModBlocks.KABANYT.get())
				|| groundState.is(WorldExpansionModBlocks.KABANYT_BRICKS.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_TILES.get()) || groundState.is(WorldExpansionModBlocks.CARVED_KABANYT.get()) || groundState.is(Blocks.STONE)
				|| groundState.is(Blocks.GRANITE) || groundState.is(Blocks.POLISHED_GRANITE) || groundState.is(Blocks.DIORITE) || groundState.is(Blocks.POLISHED_DIORITE) || groundState.is(Blocks.ANDESITE) || groundState.is(Blocks.POLISHED_ANDESITE)
				|| groundState.is(Blocks.SMOOTH_STONE) || groundState.is(Blocks.DEEPSLATE) || groundState.is(Blocks.REINFORCED_DEEPSLATE) || groundState.is(Blocks.COBBLED_DEEPSLATE) || groundState.is(Blocks.DEEPSLATE_TILES)
				|| groundState.is(Blocks.DEEPSLATE_BRICKS) || groundState.is(Blocks.CHISELED_DEEPSLATE) || groundState.is(Blocks.CRACKED_DEEPSLATE_BRICKS) || groundState.is(Blocks.CRACKED_DEEPSLATE_TILES) || groundState.is(Blocks.TUFF)
				|| groundState.is(Blocks.CALCITE) || groundState.is(Blocks.DRIPSTONE_BLOCK) || groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT_PATH) || groundState.is(Blocks.MYCELIUM) || groundState.is(Blocks.DIRT)
				|| groundState.is(Blocks.COARSE_DIRT) || groundState.is(Blocks.PODZOL) || groundState.is(Blocks.ROOTED_DIRT) || groundState.is(Blocks.MUD) || groundState.is(Blocks.PACKED_MUD) || groundState.is(Blocks.MUD_BRICKS)
				|| groundState.is(Blocks.COBBLESTONE) || groundState.is(Blocks.MOSSY_COBBLESTONE) || groundState.is(Blocks.MOSS_BLOCK) || groundState.is(Blocks.OAK_PLANKS) || groundState.is(Blocks.SPRUCE_PLANKS) || groundState.is(Blocks.BIRCH_PLANKS)
				|| groundState.is(Blocks.JUNGLE_PLANKS) || groundState.is(Blocks.ACACIA_PLANKS) || groundState.is(Blocks.DARK_OAK_PLANKS) || groundState.is(Blocks.CRIMSON_PLANKS) || groundState.is(Blocks.WARPED_PLANKS)
				|| groundState.is(Blocks.MANGROVE_PLANKS) || groundState.is(Blocks.BEDROCK) || groundState.is(Blocks.SAND) || groundState.is(Blocks.RED_SAND) || groundState.is(Blocks.GRAVEL) || groundState.is(Blocks.OBSIDIAN)
				|| groundState.is(Blocks.CRYING_OBSIDIAN) || groundState.is(Blocks.BLACKSTONE) || groundState.is(Blocks.POLISHED_BLACKSTONE) || groundState.is(Blocks.POLISHED_BLACKSTONE_BRICKS)
				|| groundState.is(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS) || groundState.is(Blocks.CHISELED_POLISHED_BLACKSTONE) || groundState.is(Blocks.COAL_ORE) || groundState.is(Blocks.IRON_ORE) || groundState.is(Blocks.REDSTONE_ORE)
				|| groundState.is(Blocks.REDSTONE_ORE) || groundState.is(Blocks.GOLD_ORE) || groundState.is(Blocks.LAPIS_ORE) || groundState.is(Blocks.DIAMOND_ORE) || groundState.is(Blocks.EMERALD_ORE) || groundState.is(Blocks.COPPER_ORE)
				|| groundState.is(Blocks.DEEPSLATE_COAL_ORE) || groundState.is(Blocks.DEEPSLATE_IRON_ORE) || groundState.is(Blocks.DEEPSLATE_REDSTONE_ORE) || groundState.is(Blocks.DEEPSLATE_GOLD_ORE) || groundState.is(Blocks.DEEPSLATE_LAPIS_ORE)
				|| groundState.is(Blocks.DEEPSLATE_DIAMOND_ORE) || groundState.is(Blocks.DEEPSLATE_EMERALD_ORE) || groundState.is(Blocks.DEEPSLATE_COPPER_ORE) || groundState.is(Blocks.NETHER_QUARTZ_ORE) || groundState.is(Blocks.NETHER_GOLD_ORE)
				|| groundState.is(Blocks.GILDED_BLACKSTONE) || groundState.is(Blocks.RAW_IRON_BLOCK) || groundState.is(Blocks.RAW_GOLD_BLOCK) || groundState.is(Blocks.RAW_COPPER_BLOCK) || groundState.is(Blocks.COAL_BLOCK)
				|| groundState.is(Blocks.IRON_BLOCK) || groundState.is(Blocks.COPPER_BLOCK) || groundState.is(Blocks.EXPOSED_COPPER) || groundState.is(Blocks.WEATHERED_COPPER) || groundState.is(Blocks.OXIDIZED_COPPER)
				|| groundState.is(Blocks.CUT_COPPER) || groundState.is(Blocks.EXPOSED_CUT_COPPER) || groundState.is(Blocks.WEATHERED_CUT_COPPER) || groundState.is(Blocks.OXIDIZED_CUT_COPPER) || groundState.is(Blocks.WAXED_COPPER_BLOCK)
				|| groundState.is(Blocks.WAXED_EXPOSED_COPPER) || groundState.is(Blocks.WAXED_WEATHERED_COPPER) || groundState.is(Blocks.WAXED_OXIDIZED_COPPER) || groundState.is(Blocks.WAXED_CUT_COPPER)
				|| groundState.is(Blocks.WAXED_EXPOSED_CUT_COPPER) || groundState.is(Blocks.WAXED_WEATHERED_CUT_COPPER) || groundState.is(Blocks.WAXED_OXIDIZED_CUT_COPPER) || groundState.is(Blocks.REDSTONE_BLOCK) || groundState.is(Blocks.GOLD_BLOCK)
				|| groundState.is(Blocks.LAPIS_BLOCK) || groundState.is(Blocks.DIAMOND_BLOCK) || groundState.is(Blocks.EMERALD_BLOCK) || groundState.is(Blocks.NETHERITE_BLOCK) || groundState.is(Blocks.SMOOTH_QUARTZ)
				|| groundState.is(Blocks.CHISELED_QUARTZ_BLOCK) || groundState.is(Blocks.QUARTZ_PILLAR) || groundState.is(Blocks.QUARTZ_BLOCK) || groundState.is(Blocks.QUARTZ_BRICKS) || groundState.is(Blocks.ANCIENT_DEBRIS)
				|| groundState.is(Blocks.AMETHYST_BLOCK) || groundState.is(Blocks.BUDDING_AMETHYST) || groundState.is(Blocks.OAK_LOG) || groundState.is(Blocks.SPRUCE_LOG) || groundState.is(Blocks.BIRCH_LOG) || groundState.is(Blocks.JUNGLE_LOG)
				|| groundState.is(Blocks.ACACIA_LOG) || groundState.is(Blocks.DARK_OAK_LOG) || groundState.is(Blocks.WARPED_STEM) || groundState.is(Blocks.CRIMSON_STEM) || groundState.is(Blocks.MANGROVE_LOG) || groundState.is(Blocks.MANGROVE_ROOTS)
				|| groundState.is(Blocks.MUDDY_MANGROVE_ROOTS) || groundState.is(Blocks.STRIPPED_OAK_LOG) || groundState.is(Blocks.STRIPPED_SPRUCE_LOG) || groundState.is(Blocks.STRIPPED_BIRCH_LOG) || groundState.is(Blocks.STRIPPED_JUNGLE_LOG)
				|| groundState.is(Blocks.STRIPPED_ACACIA_LOG) || groundState.is(Blocks.STRIPPED_DARK_OAK_LOG) || groundState.is(Blocks.STRIPPED_WARPED_STEM) || groundState.is(Blocks.STRIPPED_CRIMSON_STEM)
				|| groundState.is(Blocks.STRIPPED_MANGROVE_LOG) || groundState.is(Blocks.OAK_WOOD) || groundState.is(Blocks.SPRUCE_WOOD) || groundState.is(Blocks.BIRCH_WOOD) || groundState.is(Blocks.JUNGLE_WOOD) || groundState.is(Blocks.ACACIA_WOOD)
				|| groundState.is(Blocks.DARK_OAK_WOOD) || groundState.is(Blocks.WARPED_HYPHAE) || groundState.is(Blocks.CRIMSON_HYPHAE) || groundState.is(Blocks.MANGROVE_WOOD) || groundState.is(Blocks.STRIPPED_OAK_WOOD)
				|| groundState.is(Blocks.STRIPPED_SPRUCE_WOOD) || groundState.is(Blocks.STRIPPED_BIRCH_WOOD) || groundState.is(Blocks.STRIPPED_JUNGLE_WOOD) || groundState.is(Blocks.STRIPPED_ACACIA_WOOD)
				|| groundState.is(Blocks.STRIPPED_DARK_OAK_WOOD) || groundState.is(Blocks.STRIPPED_WARPED_HYPHAE) || groundState.is(Blocks.STRIPPED_CRIMSON_HYPHAE) || groundState.is(Blocks.STRIPPED_MANGROVE_WOOD) || groundState.is(Blocks.OAK_LEAVES)
				|| groundState.is(Blocks.SPRUCE_LEAVES) || groundState.is(Blocks.BIRCH_LEAVES) || groundState.is(Blocks.JUNGLE_LEAVES) || groundState.is(Blocks.ACACIA_LEAVES) || groundState.is(Blocks.DARK_OAK_LEAVES)
				|| groundState.is(Blocks.MANGROVE_LEAVES) || groundState.is(Blocks.AZALEA_LEAVES) || groundState.is(Blocks.FLOWERING_AZALEA_LEAVES) || groundState.is(Blocks.SPONGE) || groundState.is(Blocks.WET_SPONGE)
				|| groundState.is(Blocks.SANDSTONE) || groundState.is(Blocks.CHISELED_SANDSTONE) || groundState.is(Blocks.CUT_SANDSTONE) || groundState.is(Blocks.SMOOTH_SANDSTONE) || groundState.is(Blocks.RED_SANDSTONE)
				|| groundState.is(Blocks.CHISELED_RED_SANDSTONE) || groundState.is(Blocks.CUT_RED_SANDSTONE) || groundState.is(Blocks.SMOOTH_RED_SANDSTONE) || groundState.is(Blocks.NOTE_BLOCK) || groundState.is(Blocks.PISTON)
				|| groundState.is(Blocks.STICKY_PISTON) || groundState.is(Blocks.BROWN_MUSHROOM_BLOCK) || groundState.is(Blocks.RED_MUSHROOM_BLOCK) || groundState.is(Blocks.WARPED_WART_BLOCK) || groundState.is(Blocks.MUSHROOM_STEM)
				|| groundState.is(Blocks.BRICKS) || groundState.is(Blocks.REDSTONE_LAMP) || groundState.is(Blocks.REDSTONE_LAMP) || groundState.is(Blocks.DISPENSER) || groundState.is(Blocks.DROPPER) || groundState.is(Blocks.OBSERVER)
				|| groundState.is(Blocks.TARGET) || groundState.is(Blocks.SCULK) || groundState.is(Blocks.SCULK_CATALYST) || groundState.is(Blocks.COMMAND_BLOCK) || groundState.is(Blocks.REPEATING_COMMAND_BLOCK)
				|| groundState.is(Blocks.CHAIN_COMMAND_BLOCK) || groundState.is(Blocks.SNOW_BLOCK) || groundState.is(Blocks.POWDER_SNOW) || groundState.is(Blocks.ICE) || groundState.is(Blocks.PACKED_ICE) || groundState.is(Blocks.FROSTED_ICE)
				|| groundState.is(Blocks.BLUE_ICE) || groundState.is(Blocks.CLAY) || groundState.is(Blocks.JUKEBOX) || groundState.is(Blocks.NETHER_BRICKS) || groundState.is(Blocks.CHISELED_NETHER_BRICKS)
				|| groundState.is(Blocks.CRACKED_NETHER_BRICKS) || groundState.is(Blocks.NETHERRACK) || groundState.is(Blocks.WARPED_NYLIUM) || groundState.is(Blocks.CRIMSON_NYLIUM) || groundState.is(Blocks.SOUL_SAND)
				|| groundState.is(Blocks.SOUL_SOIL) || groundState.is(Blocks.SHROOMLIGHT) || groundState.is(Blocks.BONE_BLOCK) || groundState.is(Blocks.NETHER_WART_BLOCK) || groundState.is(Blocks.STONE_BRICKS)
				|| groundState.is(Blocks.MOSSY_STONE_BRICKS) || groundState.is(Blocks.CRACKED_STONE_BRICKS) || groundState.is(Blocks.CHISELED_STONE_BRICKS) || groundState.is(Blocks.MELON) || groundState.is(Blocks.PUMPKIN)
				|| groundState.is(Blocks.CARVED_PUMPKIN) || groundState.is(Blocks.JACK_O_LANTERN) || groundState.is(Blocks.END_STONE) || groundState.is(Blocks.END_STONE_BRICKS) || groundState.is(Blocks.INFESTED_STONE)
				|| groundState.is(Blocks.INFESTED_COBBLESTONE) || groundState.is(Blocks.INFESTED_STONE_BRICKS) || groundState.is(Blocks.INFESTED_MOSSY_STONE_BRICKS) || groundState.is(Blocks.INFESTED_CRACKED_STONE_BRICKS)
				|| groundState.is(Blocks.INFESTED_CHISELED_STONE_BRICKS) || groundState.is(Blocks.INFESTED_DEEPSLATE) || groundState.is(Blocks.BEACON) || groundState.is(Blocks.HAY_BLOCK) || groundState.is(Blocks.WHITE_WOOL)
				|| groundState.is(Blocks.ORANGE_WOOL) || groundState.is(Blocks.MAGENTA_WOOL) || groundState.is(Blocks.LIGHT_BLUE_WOOL) || groundState.is(Blocks.YELLOW_WOOL) || groundState.is(Blocks.LIME_WOOL) || groundState.is(Blocks.PINK_WOOL)
				|| groundState.is(Blocks.GRAY_WOOL) || groundState.is(Blocks.LIGHT_GRAY_WOOL) || groundState.is(Blocks.CYAN_WOOL) || groundState.is(Blocks.PURPLE_WOOL) || groundState.is(Blocks.BLUE_WOOL) || groundState.is(Blocks.BROWN_WOOL)
				|| groundState.is(Blocks.GREEN_WOOL) || groundState.is(Blocks.RED_WOOL) || groundState.is(Blocks.BLACK_WOOL) || groundState.is(Blocks.TERRACOTTA) || groundState.is(Blocks.WHITE_TERRACOTTA) || groundState.is(Blocks.ORANGE_TERRACOTTA)
				|| groundState.is(Blocks.MAGENTA_TERRACOTTA) || groundState.is(Blocks.LIGHT_BLUE_TERRACOTTA) || groundState.is(Blocks.YELLOW_TERRACOTTA) || groundState.is(Blocks.LIME_TERRACOTTA) || groundState.is(Blocks.PINK_TERRACOTTA)
				|| groundState.is(Blocks.GRAY_TERRACOTTA) || groundState.is(Blocks.LIGHT_GRAY_TERRACOTTA) || groundState.is(Blocks.CYAN_TERRACOTTA) || groundState.is(Blocks.PURPLE_TERRACOTTA) || groundState.is(Blocks.BLUE_TERRACOTTA)
				|| groundState.is(Blocks.BROWN_TERRACOTTA) || groundState.is(Blocks.GREEN_TERRACOTTA) || groundState.is(Blocks.RED_TERRACOTTA) || groundState.is(Blocks.BLACK_TERRACOTTA) || groundState.is(Blocks.WHITE_GLAZED_TERRACOTTA)
				|| groundState.is(Blocks.ORANGE_GLAZED_TERRACOTTA) || groundState.is(Blocks.MAGENTA_GLAZED_TERRACOTTA) || groundState.is(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA) || groundState.is(Blocks.YELLOW_GLAZED_TERRACOTTA)
				|| groundState.is(Blocks.LIME_GLAZED_TERRACOTTA) || groundState.is(Blocks.PINK_GLAZED_TERRACOTTA) || groundState.is(Blocks.GRAY_GLAZED_TERRACOTTA) || groundState.is(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)
				|| groundState.is(Blocks.CYAN_GLAZED_TERRACOTTA) || groundState.is(Blocks.PURPLE_GLAZED_TERRACOTTA) || groundState.is(Blocks.BLUE_GLAZED_TERRACOTTA) || groundState.is(Blocks.BROWN_GLAZED_TERRACOTTA)
				|| groundState.is(Blocks.GREEN_GLAZED_TERRACOTTA) || groundState.is(Blocks.RED_GLAZED_TERRACOTTA) || groundState.is(Blocks.BLACK_GLAZED_TERRACOTTA) || groundState.is(Blocks.WHITE_CONCRETE_POWDER)
				|| groundState.is(Blocks.ORANGE_CONCRETE_POWDER) || groundState.is(Blocks.MAGENTA_CONCRETE_POWDER) || groundState.is(Blocks.LIGHT_BLUE_CONCRETE_POWDER) || groundState.is(Blocks.YELLOW_CONCRETE_POWDER)
				|| groundState.is(Blocks.LIME_CONCRETE_POWDER) || groundState.is(Blocks.PINK_CONCRETE_POWDER) || groundState.is(Blocks.GRAY_CONCRETE_POWDER) || groundState.is(Blocks.LIGHT_GRAY_CONCRETE_POWDER)
				|| groundState.is(Blocks.CYAN_CONCRETE_POWDER) || groundState.is(Blocks.PURPLE_CONCRETE_POWDER) || groundState.is(Blocks.BLUE_CONCRETE_POWDER) || groundState.is(Blocks.BROWN_CONCRETE_POWDER)
				|| groundState.is(Blocks.GREEN_CONCRETE_POWDER) || groundState.is(Blocks.RED_CONCRETE_POWDER) || groundState.is(Blocks.BLACK_CONCRETE_POWDER) || groundState.is(Blocks.WHITE_CONCRETE) || groundState.is(Blocks.ORANGE_CONCRETE)
				|| groundState.is(Blocks.MAGENTA_CONCRETE) || groundState.is(Blocks.LIGHT_BLUE_CONCRETE) || groundState.is(Blocks.YELLOW_CONCRETE) || groundState.is(Blocks.LIME_CONCRETE) || groundState.is(Blocks.PINK_CONCRETE)
				|| groundState.is(Blocks.GRAY_CONCRETE) || groundState.is(Blocks.LIGHT_GRAY_CONCRETE) || groundState.is(Blocks.CYAN_CONCRETE) || groundState.is(Blocks.PURPLE_CONCRETE) || groundState.is(Blocks.BLUE_CONCRETE)
				|| groundState.is(Blocks.BROWN_CONCRETE) || groundState.is(Blocks.GREEN_CONCRETE) || groundState.is(Blocks.RED_CONCRETE) || groundState.is(Blocks.BLACK_CONCRETE) || groundState.is(Blocks.GLASS) || groundState.is(Blocks.TINTED_GLASS)
				|| groundState.is(Blocks.WHITE_STAINED_GLASS) || groundState.is(Blocks.ORANGE_STAINED_GLASS) || groundState.is(Blocks.MAGENTA_STAINED_GLASS) || groundState.is(Blocks.LIGHT_BLUE_STAINED_GLASS)
				|| groundState.is(Blocks.YELLOW_STAINED_GLASS) || groundState.is(Blocks.LIME_STAINED_GLASS) || groundState.is(Blocks.PINK_STAINED_GLASS) || groundState.is(Blocks.GRAY_STAINED_GLASS) || groundState.is(Blocks.LIGHT_GRAY_STAINED_GLASS)
				|| groundState.is(Blocks.CYAN_STAINED_GLASS) || groundState.is(Blocks.PURPLE_STAINED_GLASS) || groundState.is(Blocks.BLUE_STAINED_GLASS) || groundState.is(Blocks.BROWN_STAINED_GLASS) || groundState.is(Blocks.GREEN_STAINED_GLASS)
				|| groundState.is(Blocks.RED_STAINED_GLASS) || groundState.is(Blocks.BLACK_STAINED_GLASS) || groundState.is(Blocks.STRUCTURE_BLOCK) || groundState.is(Blocks.STRUCTURE_BLOCK) || groundState.is(Blocks.STRUCTURE_BLOCK)
				|| groundState.is(Blocks.SEA_LANTERN) || groundState.is(Blocks.PRISMARINE) || groundState.is(Blocks.PRISMARINE_BRICKS) || groundState.is(Blocks.DARK_PRISMARINE) || groundState.is(Blocks.DEAD_TUBE_CORAL_BLOCK)
				|| groundState.is(Blocks.DEAD_BRAIN_CORAL_BLOCK) || groundState.is(Blocks.DEAD_BUBBLE_CORAL_BLOCK) || groundState.is(Blocks.DEAD_FIRE_CORAL_BLOCK) || groundState.is(Blocks.DEAD_HORN_CORAL_BLOCK)
				|| groundState.is(Blocks.TUBE_CORAL_BLOCK) || groundState.is(Blocks.BRAIN_CORAL_BLOCK) || groundState.is(Blocks.BUBBLE_CORAL_BLOCK) || groundState.is(Blocks.FIRE_CORAL_BLOCK) || groundState.is(Blocks.HORN_CORAL_BLOCK)
				|| groundState.is(Blocks.STRUCTURE_BLOCK) || groundState.is(Blocks.STRUCTURE_BLOCK) || groundState.is(Blocks.JIGSAW) || groundState.is(Blocks.DRIED_KELP_BLOCK) || groundState.is(Blocks.SCAFFOLDING) || groundState.is(Blocks.LOOM)
				|| groundState.is(Blocks.BARREL) || groundState.is(Blocks.SMOKER) || groundState.is(Blocks.BLAST_FURNACE) || groundState.is(Blocks.CARTOGRAPHY_TABLE) || groundState.is(Blocks.FLETCHING_TABLE) || groundState.is(Blocks.SMITHING_TABLE)
				|| groundState.is(Blocks.BEEHIVE) || groundState.is(Blocks.BEE_NEST) || groundState.is(Blocks.BASALT) || groundState.is(Blocks.POLISHED_BASALT) || groundState.is(Blocks.SMOOTH_BASALT) || groundState.is(Blocks.LODESTONE)
				|| groundState.is(Blocks.AZALEA) || groundState.is(Blocks.FLOWERING_AZALEA) || groundState.is(Blocks.OCHRE_FROGLIGHT) || groundState.is(Blocks.VERDANT_FROGLIGHT) || groundState.is(Blocks.PEARLESCENT_FROGLIGHT)
				|| groundState.is(WorldExpansionModBlocks.SUSPICIOUS_MUD.get()) || groundState.is(Blocks.TNT) || groundState.is(Blocks.BOOKSHELF) || groundState.is(Blocks.CHISELED_BOOKSHELF) || groundState.is(Blocks.SPAWNER)
				|| groundState.is(Blocks.CHEST) || groundState.is(Blocks.TRAPPED_CHEST) || groundState.is(Blocks.ENDER_CHEST) || groundState.is(Blocks.CRAFTING_TABLE) || groundState.is(Blocks.FARMLAND) || groundState.is(Blocks.FURNACE)
				|| groundState.is(Blocks.HOPPER) || groundState.is(Blocks.CHERRY_LOG) || groundState.is(Blocks.BAMBOO_BLOCK) || groundState.is(Blocks.STRIPPED_CHERRY_LOG) || groundState.is(Blocks.STRIPPED_BAMBOO_BLOCK)
				|| groundState.is(Blocks.CHERRY_WOOD) || groundState.is(Blocks.STRIPPED_CHERRY_WOOD) || groundState.is(WorldExpansionModBlocks.TITANIUM_ORE.get()) || groundState.is(WorldExpansionModBlocks.TITANIUM_BLOCK.get())
				|| groundState.is(WorldExpansionModBlocks.RAW_TITANIUM_BLOCK.get()) || groundState.is(WorldExpansionModBlocks.MULTI_CRAFTING_TABLE.get()) || groundState.is(WorldExpansionModBlocks.DEEPSLATE_TITANIUM_ORE.get())
				|| groundState.is(WorldExpansionModBlocks.KABANYT_COAL_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_COPPER_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_DIAMOND_ORE.get())
				|| groundState.is(WorldExpansionModBlocks.KABANYT_EMERALD_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_GOLD_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_LAPIS_ORE.get())
				|| groundState.is(WorldExpansionModBlocks.KABANYT_IRON_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE.get()) || groundState.is(WorldExpansionModBlocks.KABANYT_TITANIUM_ORE.get())
				|| groundState.is(WorldExpansionModBlocks.KABANYT_REDSTONE_ORE_ON.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		TumbleweedTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		TumbleweedPriShchielchkiePKMPoRastieniiuProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return InteractionResult.SUCCESS;
	}
}
