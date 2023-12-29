package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class TheCoordinateTemplateForSnowCannonGUIPriOtkrytiiIntierfieisaProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.PAPER) {
			if (guistate.get("text:X") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("X"))));
			if (guistate.get("text:Y") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Y"))));
			if (guistate.get("text:Z") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Z"))));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PAPER) {
			if (guistate.get("text:X") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("X"))));
			if (guistate.get("text:Y") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Y"))));
			if (guistate.get("text:Z") instanceof EditBox _tf)
				_tf.setValue(("" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Z"))));
		}
	}
}
