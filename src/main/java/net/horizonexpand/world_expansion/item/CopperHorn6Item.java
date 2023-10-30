
package net.horizonexpand.world_expansion.item;

import net.horizonexpand.world_expansion.procedures.CopperHorn6PriShchielchkiePKMProcedure;

public class CopperHorn6Item extends Item {
	public CopperHorn6Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CopperHorn6PriShchielchkiePKMProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
