package net.horizonexpand.world_expansion.datagen;

import net.horizonexpand.world_expansion.WorldExpansionMod;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WorldExpansionMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(WorldExpansionModItems.BAOBAB_SIGN);
        simpleItem(WorldExpansionModItems.BAOBAB_HANGING_SIGN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WorldExpansionMod.MODID,"item/" + item.getId().getPath()));
    }
}