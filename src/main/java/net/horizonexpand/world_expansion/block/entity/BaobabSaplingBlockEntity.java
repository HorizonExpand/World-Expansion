package net.horizonexpand.world_expansion.block.entity;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlockEntities;

public class BaobabSaplingBlockEntity extends BlockEntity {
	public BaobabSaplingBlockEntity(BlockPos pos, BlockState state) {
		super(WorldExpansionModBlockEntities.BAOBAB_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
