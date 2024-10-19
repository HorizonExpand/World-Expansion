package net.horizonexpand.world_expansion.datagen.loot;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(WorldExpansionModBlocks.BAOBAB_SIGN.get(), block ->
                createSingleItemTable(WorldExpansionModItems.BAOBAB_SIGN.get()));
        this.add(WorldExpansionModBlocks.BAOBAB_WALL_SIGN.get(), block ->
                createSingleItemTable(WorldExpansionModItems.BAOBAB_SIGN.get()));
        this.add(WorldExpansionModBlocks.BAOBAB_HANGING_SIGN.get(), block ->
                createSingleItemTable(WorldExpansionModItems.BAOBAB_HANGING_SIGN.get()));
        this.add(WorldExpansionModBlocks.BAOBAB_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(WorldExpansionModItems.BAOBAB_HANGING_SIGN.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
}