package net.horizonexpand.world_expansion.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.horizonexpand.world_expansion.entity.ShotgunBlastEntity;
import net.horizonexpand.world_expansion.client.model.Modelshotgun_blast;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShotgunBlastRenderer extends EntityRenderer<ShotgunBlastEntity> {
	private static final ResourceLocation texture = new ResourceLocation("world_expansion:textures/entities/shotgun_blast.png");
	private final Modelshotgun_blast model;

	public ShotgunBlastRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelshotgun_blast(context.bakeLayer(Modelshotgun_blast.LAYER_LOCATION));
	}

	@Override
	public void render(ShotgunBlastEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ShotgunBlastEntity entity) {
		return texture;
	}
}
