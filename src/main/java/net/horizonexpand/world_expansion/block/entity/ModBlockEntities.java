package net.horizonexpand.world_expansion.block.entity;

import net.horizonexpand.world_expansion.WorldExpansionMod;
import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorldExpansionMod.MODID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =  BLOCK_ENTITIES.register("mod_sign", () ->
            BlockEntityType.Builder.of(ModSignBlockEntity::new,
                    WorldExpansionModBlocks.BAOBAB_SIGN.get(), WorldExpansionModBlocks.BAOBAB_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =  BLOCK_ENTITIES.register("mod_hanging_sign", () ->
            BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                    WorldExpansionModBlocks.BAOBAB_HANGING_SIGN.get(), WorldExpansionModBlocks.BAOBAB_WALL_HANGING_SIGN.get()).build(null));
}
