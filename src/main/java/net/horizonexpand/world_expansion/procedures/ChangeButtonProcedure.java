package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class ChangeButtonProcedure {
	public static void execute(LevelAccessor world) {
		if ((WorldExpansionModVariables.MapVariables.get(world).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.PINK_DYE).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.CYAN_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.CYAN_DYE).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.MAGENTA_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.MAGENTA_DYE).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.ORANGE_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.ORANGE_DYE).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.YELLOW_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.YELLOW_DYE).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.LIGHT_BLUE_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else {
			WorldExpansionModVariables.MapVariables.get(world).Dye = ForgeRegistries.ITEMS.getKey(Items.PINK_DYE).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		}
		if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else if ((WorldExpansionModVariables.MapVariables.get(world).CopperHorn).equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString())) {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN9.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		} else {
			WorldExpansionModVariables.MapVariables.get(world).CopperHorn = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString();
			WorldExpansionModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
