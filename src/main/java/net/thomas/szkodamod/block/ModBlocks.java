package net.thomas.szkodamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thomas.szkodamod.SzkodaMod;
import net.thomas.szkodamod.item.ModItemGroup;

public class ModBlocks {

    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(0.1f).requiresTool()), ModItemGroup.TUNGSTEN_INGOT);

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
