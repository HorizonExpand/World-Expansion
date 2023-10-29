
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.horizonexpand.world_expansion.world.features.plants.YellowAstilbaFeature;
import net.horizonexpand.world_expansion.world.features.plants.TumbleweedFeature;
import net.horizonexpand.world_expansion.world.features.plants.AstilbamulticoloredFeature;
import net.horizonexpand.world_expansion.world.features.plants.AstilbaFeature;
import net.horizonexpand.world_expansion.world.features.plants.AloeVeraTigerFeature;
import net.horizonexpand.world_expansion.world.features.plants.AloeVeraFeature;
import net.horizonexpand.world_expansion.world.features.ores.KabanytFeature;
import net.horizonexpand.world_expansion.world.features.RaiderBaseInBaobabFeature;
import net.horizonexpand.world_expansion.world.features.MudRuin1Feature;
import net.horizonexpand.world_expansion.world.features.MudRuin1DesertFeature;
import net.horizonexpand.world_expansion.world.features.MudRuin1BadlandFeature;
import net.horizonexpand.world_expansion.world.features.JackLanternFeature;
import net.horizonexpand.world_expansion.world.features.GravelsurfaceFeature;
import net.horizonexpand.world_expansion.world.features.Drybaobab2Feature;
import net.horizonexpand.world_expansion.world.features.Drybaobab1Feature;
import net.horizonexpand.world_expansion.world.features.DiedAcacia5Feature;
import net.horizonexpand.world_expansion.world.features.DiedAcacia4Feature;
import net.horizonexpand.world_expansion.world.features.DiedAcacia3Feature;
import net.horizonexpand.world_expansion.world.features.DiedAcacia2Feature;
import net.horizonexpand.world_expansion.world.features.DiedAcacia1Feature;
import net.horizonexpand.world_expansion.world.features.CoarseDirtSurfaceFeature;
import net.horizonexpand.world_expansion.world.features.Baobab9Feature;
import net.horizonexpand.world_expansion.world.features.Baobab8Feature;
import net.horizonexpand.world_expansion.world.features.Baobab7Feature;
import net.horizonexpand.world_expansion.world.features.Baobab6Feature;
import net.horizonexpand.world_expansion.world.features.Baobab5Feature;
import net.horizonexpand.world_expansion.world.features.Baobab4Feature;
import net.horizonexpand.world_expansion.world.features.Baobab3Feature;
import net.horizonexpand.world_expansion.world.features.Baobab2Feature;
import net.horizonexpand.world_expansion.world.features.Baobab1Feature;
import net.horizonexpand.world_expansion.world.features.Baobab10Feature;
import net.horizonexpand.world_expansion.WorldExpansionMod;

@Mod.EventBusSubscriber
public class WorldExpansionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WorldExpansionMod.MODID);
	public static final RegistryObject<Feature<?>> KABANYT = REGISTRY.register("kabanyt", KabanytFeature::new);
	public static final RegistryObject<Feature<?>> ASTILBA = REGISTRY.register("astilba", AstilbaFeature::new);
	public static final RegistryObject<Feature<?>> ASTILBA_MULTICOLORED = REGISTRY.register("astilba_multicolored", AstilbamulticoloredFeature::new);
	public static final RegistryObject<Feature<?>> YELLOW_ASTILBA = REGISTRY.register("yellow_astilba", YellowAstilbaFeature::new);
	public static final RegistryObject<Feature<?>> ALOE_VERA = REGISTRY.register("aloe_vera", AloeVeraFeature::new);
	public static final RegistryObject<Feature<?>> ALOE_VERA_TIGER = REGISTRY.register("aloe_vera_tiger", AloeVeraTigerFeature::new);
	public static final RegistryObject<Feature<?>> TUMBLEWEED = REGISTRY.register("tumbleweed", TumbleweedFeature::new);
	public static final RegistryObject<Feature<?>> BAOBAB1 = REGISTRY.register("baobab1", Baobab1Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB2 = REGISTRY.register("baobab2", Baobab2Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB3 = REGISTRY.register("baobab3", Baobab3Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB4 = REGISTRY.register("baobab4", Baobab4Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB5 = REGISTRY.register("baobab5", Baobab5Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB6 = REGISTRY.register("baobab6", Baobab6Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB7 = REGISTRY.register("baobab7", Baobab7Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB8 = REGISTRY.register("baobab8", Baobab8Feature::new);
	public static final RegistryObject<Feature<?>> DRY_BAOBAB1 = REGISTRY.register("dry_baobab1", Drybaobab1Feature::new);
	public static final RegistryObject<Feature<?>> DRY_BAOBAB2 = REGISTRY.register("dry_baobab2", Drybaobab2Feature::new);
	public static final RegistryObject<Feature<?>> MUD_RUIN1_SAVANNA = REGISTRY.register("mud_ruin1_savanna", MudRuin1Feature::new);
	public static final RegistryObject<Feature<?>> MUD_RUIN1_DESERT = REGISTRY.register("mud_ruin1_desert", MudRuin1DesertFeature::new);
	public static final RegistryObject<Feature<?>> MUD_RUIN1_BADLANDS = REGISTRY.register("mud_ruin1_badlands", MudRuin1BadlandFeature::new);
	public static final RegistryObject<Feature<?>> BAOBAB_9 = REGISTRY.register("baobab_9", Baobab9Feature::new);
	public static final RegistryObject<Feature<?>> BAOBAB_10 = REGISTRY.register("baobab_10", Baobab10Feature::new);
	public static final RegistryObject<Feature<?>> RAIDER_BASE_IN_BAOBAB = REGISTRY.register("raider_base_in_baobab", RaiderBaseInBaobabFeature::new);
	public static final RegistryObject<Feature<?>> DIED_ACACIA_1 = REGISTRY.register("died_acacia_1", DiedAcacia1Feature::new);
	public static final RegistryObject<Feature<?>> DIED_ACACIA_2 = REGISTRY.register("died_acacia_2", DiedAcacia2Feature::new);
	public static final RegistryObject<Feature<?>> DIED_ACACIA_3 = REGISTRY.register("died_acacia_3", DiedAcacia3Feature::new);
	public static final RegistryObject<Feature<?>> DIED_ACACIA_4 = REGISTRY.register("died_acacia_4", DiedAcacia4Feature::new);
	public static final RegistryObject<Feature<?>> DIED_ACACIA_5 = REGISTRY.register("died_acacia_5", DiedAcacia5Feature::new);
	public static final RegistryObject<Feature<?>> JACK_LANTERN = REGISTRY.register("jack_lantern", JackLanternFeature::new);
	public static final RegistryObject<Feature<?>> GRAVEL_SURFACE = REGISTRY.register("gravel_surface", GravelsurfaceFeature::new);
	public static final RegistryObject<Feature<?>> COARSE_DIRT_SURFACE = REGISTRY.register("coarse_dirt_surface", CoarseDirtSurfaceFeature::new);
}
