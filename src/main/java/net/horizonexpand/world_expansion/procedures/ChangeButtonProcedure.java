package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.Items;
import net.minecraft.world.entity.Entity;

import net.horizonexpand.world_expansion.network.WorldExpansionModVariables;
import net.horizonexpand.world_expansion.init.WorldExpansionModItems;

public class ChangeButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.PINK_DYE).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.CYAN_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.CYAN_DYE).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.MAGENTA_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.MAGENTA_DYE).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.ORANGE_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.ORANGE_DYE).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.YELLOW_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).Dye).equals(ForgeRegistries.ITEMS.getKey(Items.YELLOW_DYE).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.LIGHT_BLUE_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(Items.PINK_DYE).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Dye = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN1.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN2.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN3.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN4.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN5.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN6.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN7.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WorldExpansionModVariables.PlayerVariables())).CopperHorn)
				.equals(ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN8.get()).toString())) {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN9.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = ForgeRegistries.ITEMS.getKey(WorldExpansionModItems.COPPER_HORN0.get()).toString();
				entity.getCapability(WorldExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CopperHorn = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
