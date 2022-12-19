package net.thomas.szkodamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thomas.szkodamod.SzkodaMod;
import net.thomas.szkodamod.item.custom.EightBallItem;

public class ModItems {


    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten",
            new Item(new FabricItemSettings().group(ModItemGroup.TUNGSTEN_INGOT)));

    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TUNGSTEN_INGOT)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.TUNGSTEN_INGOT).maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SzkodaMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SzkodaMod.LOGGER.debug("Registering Mod Items for " + SzkodaMod.MOD_ID);
    }
}
