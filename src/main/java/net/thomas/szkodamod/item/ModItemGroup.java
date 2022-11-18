package net.thomas.szkodamod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.thomas.szkodamod.SzkodaMod;

public class ModItemGroup {
    public static final ItemGroup TUNGSTEN_INGOT = FabricItemGroupBuilder.build(
            new Identifier(SzkodaMod.MOD_ID, "tungsten_ingot"), () -> new ItemStack(ModItems.TUNGSTEN_INGOT));
}
