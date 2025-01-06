// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.11.2 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class derAnimation {
	public static final AnimationDefinition test = AnimationDefinition.Builder.withLength(0.5F).looping()
			.addAnimation("bone", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F,
					KeyframeAnimations.degreeVec(0.0F, 275.976F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}