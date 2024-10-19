package net.horizonexpand.world_expansion.datagen;

import net.horizonexpand.world_expansion.WorldExpansionMod;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WorldExpansionMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        signBlock(((StandingSignBlock) WorldExpansionModBlocks.BAOBAB_SIGN.get()), ((WallSignBlock) WorldExpansionModBlocks.BAOBAB_WALL_SIGN.get()),
                blockTexture(WorldExpansionModBlocks.BAOBAB_PLANKS.get()));

        hangingSignBlock(WorldExpansionModBlocks.BAOBAB_HANGING_SIGN.get(), WorldExpansionModBlocks.BAOBAB_WALL_HANGING_SIGN.get(), blockTexture(WorldExpansionModBlocks.BAOBAB_PLANKS.get()));
    }

    public <ResourceLocation> void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), (net.minecraft.resources.ResourceLocation) texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}