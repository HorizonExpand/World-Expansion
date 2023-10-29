package net.horizonexpand.world_expansion.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BaobabSaplingObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("age", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "age") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "age") == 16 && Math.random() < 0.5 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 7) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 3), BlockPos.containing(x - 6, y - 2, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 4), BlockPos.containing(x - 6, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, x - 6), BlockPos.containing(x - 6, y - 2, x - 6), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 4), BlockPos.containing(x - 4, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z - 4), BlockPos.containing(x - 4, y - 1, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y - 1, z - 2), BlockPos.containing(x - 2, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 2), BlockPos.containing(x - 3, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "age") == 20 && Math.random() < 0.7 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 7) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 3), BlockPos.containing(x - 6, y - 2, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 4), BlockPos.containing(x - 6, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, x - 6), BlockPos.containing(x - 6, y - 2, x - 6), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 4), BlockPos.containing(x - 4, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z - 4), BlockPos.containing(x - 4, y - 1, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y - 1, z - 2), BlockPos.containing(x - 2, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 2), BlockPos.containing(x - 3, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "age") == 24 && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Mth.nextInt(RandomSource.create(), 1, 7) == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 3), BlockPos.containing(x - 6, y - 2, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, z - 4), BlockPos.containing(x - 6, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 6, y - 2, x - 6), BlockPos.containing(x - 6, y - 2, x - 6), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 4), BlockPos.containing(x - 4, y - 2, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 1, z - 4), BlockPos.containing(x - 4, y - 1, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y - 1, z - 2), BlockPos.containing(x - 2, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("world_expansion", "baobab7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 2), BlockPos.containing(x - 3, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "age") == 24 && !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 2, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 4, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 7, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.AIR)) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("age", 16);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
