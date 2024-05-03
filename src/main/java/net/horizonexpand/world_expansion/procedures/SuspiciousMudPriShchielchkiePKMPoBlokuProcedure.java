package net.horizonexpand.world_expansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.concurrent.atomic.AtomicReference;

public class SuspiciousMudPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BRUSH) {
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1) < 3) {
				if (Math.random() < 0.2) {
					{
						int _value = (int) ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1) + 1);
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.brush.brushing.generic")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.brush.brushing.generic")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			} else {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 1), (z + 0.5), (new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, BlockPos.containing(x, y, z), 0)));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(blockstate));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.MUD.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[tag=sus_mud]");
			}
			if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip15 ? blockstate.getValue(_getip15) : -1) == 0) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[tag=sus_mud]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon minecraft:item_display ~0.5 ~0.5 ~0.5 {item:{\"id\":\"" + "" + ForgeRegistries.ITEMS.getKey((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem()).toString() + "\", Count:1b},Tags:[\"" + "sus_mud" + "\"]}"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("data modify entity @e[tag=" + "sus_mud" + ",limit=1,sort=nearest] transformation.scale set value [0.5f,0.5f,0.5f]"));
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip22 ? blockstate.getValue(_getip22) : -1) == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[tag=sus_mud]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon minecraft:item_display ~0.5 ~0.6 ~0.5 {item:{\"id\":\"" + "" + ForgeRegistries.ITEMS.getKey((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem()).toString() + "\", Count:1b},Tags:[\"" + "sus_mud" + "\"]}"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("data modify entity @e[tag=" + "sus_mud" + ",limit=1,sort=nearest] transformation.scale set value [0.5f,0.5f,0.5f]"));
			} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip29 ? blockstate.getValue(_getip29) : -1) == 2) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[tag=sus_mud]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("summon minecraft:item_display ~0.5 ~0.7 ~0.5 {item:{\"id\":\"" + "" + ForgeRegistries.ITEMS.getKey((new Object() {
								public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
									return _retval.get();
								}
							}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem()).toString() + "\", Count:1b},Tags:[\"" + "sus_mud" + "\"]}"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 0.5), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							("data modify entity @e[tag=" + "sus_mud" + ",limit=1,sort=nearest] transformation.scale set value [0.5f,0.5f,0.5f]"));
			}
		}
	}
}
