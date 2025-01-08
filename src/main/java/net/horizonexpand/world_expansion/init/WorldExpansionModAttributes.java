
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.horizonexpand.world_expansion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.BuiltInRegistries;

import net.horizonexpand.world_expansion.WorldExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WorldExpansionModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, WorldExpansionMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> KICKBACK_MULTIPLIER = REGISTRY.register("kickback_multiplier", () -> new RangedAttribute("attribute.world_expansion.kickback_multiplier", 1, -1024, 1024).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, KICKBACK_MULTIPLIER);
	}
}
