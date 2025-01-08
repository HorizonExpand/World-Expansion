package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.BuiltInRegistries;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class ChangeButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).equals(BuiltInRegistries.ITEM.getKey(Items.PINK_DYE).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.CYAN_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).equals(BuiltInRegistries.ITEM.getKey(Items.CYAN_DYE).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.MAGENTA_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).equals(BuiltInRegistries.ITEM.getKey(Items.MAGENTA_DYE).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.ORANGE_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).equals(BuiltInRegistries.ITEM.getKey(Items.ORANGE_DYE).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.YELLOW_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).Dye).equals(BuiltInRegistries.ITEM.getKey(Items.YELLOW_DYE).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.LIGHT_BLUE_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.Dye = BuiltInRegistries.ITEM.getKey(Items.PINK_DYE).toString();
				_vars.syncPlayerVariables(entity);
			}
		}
		if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES).CopperHorn).equals(BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString())) {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN9.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				WorldExpansionModVariables.PlayerVariables _vars = entity.getData(WorldExpansionModVariables.PLAYER_VARIABLES);
				_vars.CopperHorn = BuiltInRegistries.ITEM.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString();
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
