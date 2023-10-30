
package net.horizonexpand.world_expansion.world.features.treedecorators;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HalloweenForestTrunkDecorator extends TrunkVineDecorator {
	public static Codec<HalloweenForestTrunkDecorator> CODEC = Codec.unit(HalloweenForestTrunkDecorator::new);
	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerPointOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("halloween_forest_tree_trunk_decorator", DECORATOR_TYPE));
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		context.logs().forEach(blockpos -> {
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.west();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.VINE.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.east();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.VINE.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.north();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.VINE.defaultBlockState());
				}
			}
			if (context.random().nextInt(3) > 0) {
				BlockPos pos = blockpos.south();
				if (context.isAir(pos)) {
					context.setBlock(pos, Blocks.VINE.defaultBlockState());
				}
			}
		});
	}
}
