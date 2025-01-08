package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.horizonexpand.world_expansion.init.WorldExpansionModBlocks;

public class Baobab2SaplingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean dontSpawn = false;
		String airTag = "";
		BlockState customSappling = Blocks.AIR.defaultBlockState();
		double random = 0;
		double offset = 0;
		double rotation = 0;
		double structureOffsetX = 0;
		double structureOffsetZ = 0;
		double posX = 0;
		double sizeX = 0;
		double posY = 0;
		double posZ = 0;
		double conditionOffsetZ = 0;
		double conditionOffsetX = 0;
		double sizeY = 0;
		double sizeZ = 0;
		if (!world.isClientSide()) {
			customSappling = WorldExpansionModBlocks.BAOBAB_SAPLING.get().defaultBlockState();
			airTag = "world_expansion:air";
			structureOffsetX = 1;
			structureOffsetZ = 1;
			conditionOffsetX = 1;
			conditionOffsetZ = 1;
			sizeX = 9;
			sizeY = 12;
			sizeZ = 6;
			if (!(airTag).isEmpty() && ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == customSappling.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == customSappling.getBlock()
					&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == customSappling.getBlock()
					|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == customSappling.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == customSappling.getBlock()
							&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == customSappling.getBlock()
					|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == customSappling.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == customSappling.getBlock()
							&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == customSappling.getBlock()
					|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == customSappling.getBlock() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == customSappling.getBlock()
							&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == customSappling.getBlock())) {
				offset = 1;
				posX = x - ((sizeX - offset) / 2 - conditionOffsetX);
				posY = y + 1;
				posZ = z - ((sizeZ - offset) / 2 - conditionOffsetZ);
				for (int index0 = 0; index0 < (int) (sizeY - 1); index0++) {
					for (int index1 = 0; index1 < (int) sizeX; index1++) {
						for (int index2 = 0; index2 < (int) sizeZ; index2++) {
							if (!(world.getBlockState(BlockPos.containing(posX, posY, posZ))).is(BlockTags.create(ResourceLocation.parse((airTag).toLowerCase(java.util.Locale.ENGLISH))))) {
								dontSpawn = true;
								break;
							}
							posZ = posZ + 1;
						}
						if (dontSpawn) {
							break;
						}
						posZ = z - ((sizeZ - offset) / 2 - conditionOffsetZ);
						posX = posX + 1;
					}
					if (dontSpawn) {
						break;
					}
					posZ = z - ((sizeZ - offset) / 2 - conditionOffsetZ);
					posX = x - ((sizeX - offset) / 2 - conditionOffsetX);
					posY = posY + 1;
				}
				rotation = Mth.nextInt(RandomSource.create(), 0, 11);
				if (!dontSpawn && rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.LEFT_RIGHT).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 6) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 7) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.LEFT_RIGHT).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 8) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 9) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.LEFT_RIGHT).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 10) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									BlockPos.containing(x - ((sizeX - offset) / 2 - structureOffsetX), y, z - ((sizeZ - offset) / 2 - structureOffsetZ)),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.FRONT_BACK).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (!dontSpawn && rotation == 11) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("world_expansion", "baobab0"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									BlockPos.containing(x + (sizeX - offset) / 2 + structureOffsetX, y, z + (sizeZ - offset) / 2 + structureOffsetZ),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.LEFT_RIGHT).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
