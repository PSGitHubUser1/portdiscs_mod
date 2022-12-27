
package net.mojang.portdiscs.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;
import java.util.Set;
import java.util.List;

public class DesertRuinsmainFeature extends Feature<NoneFeatureConfiguration> {
	public static DesertRuinsmainFeature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DesertRuinsmainFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("portdiscs:desert_ruins", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("portdiscs:desert_ruins", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("bamboo_jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("bamboo_jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("beach")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("birch_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("birch_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("cold_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("dark_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("dark_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_cold_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_dark")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_frozen_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_lukewarm_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("deep_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("warm_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("desert")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("dripstone_caves")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("eroded_badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("flower_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("frozen_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("frozen_peaks")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("frozen_river")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("grove")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("ice_spikes")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jagged_peaks")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("lukewarm_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("lush_caves")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("mangrove_swamp")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("meadow")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("eroded_badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_gravelly_hills")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("sparse_jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("wooded_badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_hills")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("mushroom_fields")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("mushroom_fields")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_birch_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_birch_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_pine_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_pine_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_spruce_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("old_growth_spruce_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("plains")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("river")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("savanna")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("savanna_plateau")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_savanna")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_slopes")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_beach")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_hills")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_plains")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("snowy_taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("sparse_jungle")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("stony_peaks")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("stony_shore")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("sunflower_plains")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("swamp")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("swamp")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("taiga")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_forest")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_gravelly_hills")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_hills")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("windswept_savanna")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("wooded_badlands")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("warm_ocean")));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public DesertRuinsmainFeature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(Blocks.WATER, Blocks.WATER, Blocks.BUBBLE_COLUMN);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("portdiscs", "desertruins2_main1"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 2800) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
