
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.world.features.ores.CitrineoreFeature;
import net.mojang.portdiscs.world.features.WagonmainFeature;
import net.mojang.portdiscs.world.features.StriderStablesnomainFeature;
import net.mojang.portdiscs.world.features.SoulBunkerMainFeature;
import net.mojang.portdiscs.world.features.SeafortmainFeature;
import net.mojang.portdiscs.world.features.PillagerStationmainFeature;
import net.mojang.portdiscs.world.features.OvergrownDungeonmainFeature;
import net.mojang.portdiscs.world.features.MysteriousEggmainFeature;
import net.mojang.portdiscs.world.features.MinersHideoutmainFeature;
import net.mojang.portdiscs.world.features.LabmainFeature;
import net.mojang.portdiscs.world.features.GoldenHeartmainFeature;
import net.mojang.portdiscs.world.features.ElvenHideoutmainFeature;
import net.mojang.portdiscs.world.features.DesertRuinsmainFeature;
import net.mojang.portdiscs.world.features.CloudmainFeature;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class PortdiscsModFeatures {
	public static void load() {
		register("citrineore", CitrineoreFeature.feature(), CitrineoreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("miners_hideout", MinersHideoutmainFeature.feature(), MinersHideoutmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("pillager_station", PillagerStationmainFeature.feature(), PillagerStationmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("soul_bunker", SoulBunkerMainFeature.feature(), SoulBunkerMainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("wagon", WagonmainFeature.feature(), WagonmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("golden_heart", GoldenHeartmainFeature.feature(), GoldenHeartmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("desert_ruins", DesertRuinsmainFeature.feature(), DesertRuinsmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("mysterious_egg", MysteriousEggmainFeature.feature(), MysteriousEggmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("lab", LabmainFeature.feature(), LabmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("cloud", CloudmainFeature.feature(), CloudmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.RAW_GENERATION);
		register("overgrown_dungeon", OvergrownDungeonmainFeature.feature(), OvergrownDungeonmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
		register("elven_hideout", ElvenHideoutmainFeature.feature(), ElvenHideoutmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("seafort", SeafortmainFeature.feature(), SeafortmainFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("strider_stablesnomain", StriderStablesnomainFeature.feature(), StriderStablesnomainFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(PortdiscsMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(PortdiscsMod.MODID, registryName)));
	}
}
