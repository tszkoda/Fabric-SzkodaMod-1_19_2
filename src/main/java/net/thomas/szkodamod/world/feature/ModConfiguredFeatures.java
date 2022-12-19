package net.thomas.szkodamod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.thomas.szkodamod.SzkodaMod;
import net.thomas.szkodamod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TUNGSTEN_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TUNGSTEN_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TUNGSTEN_ORE =
            ConfiguredFeatures.register("tungsten_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TUNGSTEN_ORES, 12));

    public static void registerConfiguredFeatures(){
        SzkodaMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + SzkodaMod.MOD_ID);
    }
}
