package com.cmicro.neatcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        //Crafting
        GameRegistry.addShapedRecipe
        (
                new ItemStack(ModItems.itemSteel),
                "III",
                "FIF",
                "III", 'I', new ItemStack(Items.iron_ingot), 'F', new ItemStack(Items.flint)
        );
        GameRegistry.addShapedRecipe
        (
                new ItemStack(ModItems.itemEnderSteel),
                " E ",
                " I ",
                " E ", 'I', new ItemStack(ModItems.itemHardenedSteel), 'E', Items.ender_eye
        );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.rodSteel, 6),
                        " S ",
                        " S ",
                        " S ", 'S', new ItemStack(ModItems.itemSteel)
                );

        //Steel
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelSword),
                        " S ",
                        " S ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelPickaxe),
                        "SSS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelAxe),
                        "SS ",
                        "SR ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelAxe),
                        " SS",
                        " RS",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelHoe),
                        " SS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelHoe),
                        "SS ",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSteel, 9), new ItemStack(ModBlocks.blockSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemHardenedSteel, 9), new ItemStack(ModBlocks.blockHSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockHSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemHardenedSteel), 1.0F);
    }
}
