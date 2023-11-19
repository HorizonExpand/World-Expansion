
package net.horizonexpand.world_expansion.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.entity.model.MiniFireflyModel;
import net.horizonexpand.world_expansion.entity.layer.MiniFireflyLayer;
import net.horizonexpand.world_expansion.entity.MiniFireflyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class MiniFireflyRenderer extends GeoEntityRenderer<MiniFireflyEntity> {
	public MiniFireflyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MiniFireflyModel());
		this.shadowRadius = 0.2f;
		this.addRenderLayer(new MiniFireflyLayer(this));
	}

	@Override
	public RenderType getRenderType(MiniFireflyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MiniFireflyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(MiniFireflyEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
