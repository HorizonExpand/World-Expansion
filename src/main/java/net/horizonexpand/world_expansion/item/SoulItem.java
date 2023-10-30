
package net.horizonexpand.world_expansion.item;

import net.horizonexpand.world_expansion.procedures.SoulPriShchielchkiePKMPoBlokuProcedure;

public class SoulItem extends Item {
	public SoulItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SoulPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
