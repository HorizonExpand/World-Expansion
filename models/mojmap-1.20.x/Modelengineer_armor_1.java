// Made with Blockbench 4.8.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelengineer_armor_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "engineer_armor_1"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightBoot;
	private final ModelPart LeftBoot;

	public Modelengineer_armor_1(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightBoot = root.getChild("RightBoot");
		this.LeftBoot = root.getChild("LeftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 114)
						.addBox(-2.5F, 1.0F, 2.25F, 5.0F, 8.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(65, 119)
						.addBox(-2.5F, 1.0F, -2.5F, 5.0F, 8.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(55, 3)
						.addBox(-2.75F, 9.0F, -2.75F, 5.5F, 1.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(95, 115)
						.addBox(2.25F, 1.0F, -2.25F, 0.25F, 8.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(47, 115)
						.addBox(-2.5F, 1.0F, -2.25F, 0.25F, 8.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(51, 79)
						.addBox(-3.5F, 5.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(59, 45)
						.addBox(-4.0F, 5.5F, -0.5F, 0.5F, 1.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(7, 77).addBox(-8.0F, 2.5F, -1.5F, 2.5F, 0.75F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0355F, -1.5711F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(74, 18)
						.addBox(-2.55F, 1.0F, 2.25F, 5.0F, 6.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.55F, 1.0F, -2.5F, 5.0F, 5.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(75, 10)
						.addBox(-2.55F, 6.0F, -2.75F, 5.0F, 4.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 40)
						.addBox(-1.55F, 6.0F, 2.25F, 3.0F, 4.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(46, 58)
						.addBox(1.45F, 7.0F, 2.25F, 1.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 58)
						.addBox(-2.55F, 7.0F, 2.25F, 1.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(36, 97)
						.addBox(2.2F, 1.0F, -2.25F, 0.25F, 6.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(73, 58)
						.addBox(2.2F, 7.0F, -2.25F, 0.5F, 3.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(36, 73)
						.addBox(-2.8F, 7.0F, -2.25F, 0.5F, 3.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(16, 98)
						.addBox(-2.55F, 1.0F, -2.25F, 0.25F, 6.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = LeftLeg
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(26, 57).addBox(5.5F, 0.0F, -3.0F, 3.0F, 3.0F, 0.75F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RightBoot = partdefinition.addOrReplaceChild("RightBoot", CubeListBuilder.create()
				.texOffs(60, 10).addBox(-2.5F, 10.0F, -2.5F, 5.0F, 2.5F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r3 = RightBoot.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-1.25F, 13.0F, 0.75F, 2.5F, 0.75F, 0.75F, new CubeDeformation(0.0F)).texOffs(75, 47)
						.addBox(-2.25F, 13.25F, 1.0F, 4.5F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.6626F, -7.6462F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = RightBoot.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(66, 76).addBox(-2.25F, 7.75F, 5.0F, 4.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5733F, 0.4954F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LeftBoot = partdefinition.addOrReplaceChild("LeftBoot", CubeListBuilder.create().texOffs(31, 58)
				.addBox(-2.3F, 10.0F, -2.5F, 5.0F, 2.5F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r5 = LeftBoot.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 58).addBox(1.75F, 7.75F, 5.0F, 4.5F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -0.5733F, 0.4954F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LeftBoot.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(31, 48)
						.addBox(2.75F, 13.0F, 0.75F, 2.5F, 0.75F, 0.75F, new CubeDeformation(0.0F)).texOffs(81, 52)
						.addBox(1.75F, 13.25F, 1.0F, 4.5F, 1.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -1.6626F, -7.6462F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}