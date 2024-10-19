package net.horizonexpand.world_expansion.util;

import net.horizonexpand.world_expansion.WorldExpansionMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType BAOBAB = WoodType.register(new WoodType(WorldExpansionMod.MODID + ":baobab", BlockSetType.OAK));
}
