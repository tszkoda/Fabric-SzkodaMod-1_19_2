package net.thomas.szkodamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.thomas.szkodamod.SzkodaMod;
import net.thomas.szkodamod.block.custom.JumpyBlock;
import net.thomas.szkodamod.item.ModItemGroup;

public class ModBlocks {

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f, 13.0f).requiresTool().sounds(BlockSoundGroup.METAL)),
            ModItemGroup.TUNGSTEN_INGOT);

    public static final Block RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f, 10.0f).requiresTool().sounds(BlockSoundGroup.METAL)),
            ModItemGroup.TUNGSTEN_INGOT);

    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool(),
        UniformIntProvider.create(3,7)), ModItemGroup.TUNGSTEN_INGOT);

    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.0f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE),
                    UniformIntProvider.create(3,7)), ModItemGroup.TUNGSTEN_INGOT);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemGroup.TUNGSTEN_INGOT);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SzkodaMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){

        return Registry.register(Registry.ITEM, new Identifier(SzkodaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        SzkodaMod.LOGGER.debug("Registering Modblocks for " + SzkodaMod.MOD_ID);
    }
}
