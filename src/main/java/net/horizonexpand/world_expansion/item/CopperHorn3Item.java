
package net.horizonexpand.world_expansion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.horizonexpand.world_expansion.procedures.CopperHorn3PriShchielchkiePKMProcedure;

public class CopperHorn3Item extends Item {
	public CopperHorn3Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CopperHorn3PriShchielchkiePKMProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
