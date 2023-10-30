
package net.horizonexpand.world_expansion.item;

import net.horizonexpand.world_expansion.procedures.CopperHorn9PriShchielchkiePKMProcedure;

public class CopperHorn9Item extends Item {
	public CopperHorn9Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		CopperHorn9PriShchielchkiePKMProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
