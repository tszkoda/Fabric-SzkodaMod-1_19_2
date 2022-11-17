package net.thomas.szkodamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thomas.szkodamod.SzkodaMod;

public class ModItems {


    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SzkodaMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SzkodaMod.LOGGER.debug("Registering Mod Items for " + SzkodaMod.MOD_ID);
    }
}
