/*
 * This file ("CrusherCrafting.java") is part of the Actually Additions Mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense/
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2016 Ellpeck
 */

package de.ellpeck.actuallyadditions.crafting;

import de.ellpeck.actuallyadditions.config.values.ConfigCrafting;
import de.ellpeck.actuallyadditions.items.InitItems;
import de.ellpeck.actuallyadditions.items.metalists.TheFoods;
import de.ellpeck.actuallyadditions.recipe.CrusherRecipeRegistry;
import de.ellpeck.actuallyadditions.util.ModUtil;
import de.ellpeck.actuallyadditions.util.Util;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class CrusherCrafting{

    public static CrusherRecipeRegistry.CrusherRecipe recipeIronHorseArmor;
    public static CrusherRecipeRegistry.CrusherRecipe recipeGoldHorseArmor;
    public static CrusherRecipeRegistry.CrusherRecipe recipeDiamondHorseArmor;
    public static ArrayList<CrusherRecipeRegistry.CrusherRecipe> miscRecipes = new ArrayList<CrusherRecipeRegistry.CrusherRecipe>();

    public static void init(){
        ModUtil.LOGGER.info("Initializing Crusher Recipes...");

        CrusherRecipeRegistry.addRecipe(new ItemStack(Items.bone), new ItemStack(Items.dye, 6, 15));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Items.reeds), new ItemStack(Items.sugar, 3));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());

        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.yellow_flower), new ItemStack(Items.dye, 3, 11));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 0), new ItemStack(Items.dye, 3, 1));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 1), new ItemStack(Items.dye, 3, 12));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 2), new ItemStack(Items.dye, 3, 13));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 3), new ItemStack(Items.dye, 3, 7));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 4), new ItemStack(Items.dye, 3, 1));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 5), new ItemStack(Items.dye, 3, 14));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 6), new ItemStack(Items.dye, 3, 7));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 7), new ItemStack(Items.dye, 3, 9));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 8), new ItemStack(Items.dye, 3, 7));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.double_plant, 1, 0), new ItemStack(Items.dye, 4, 11));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.double_plant, 1, 1), new ItemStack(Items.dye, 4, 13));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.double_plant, 1, 4), new ItemStack(Items.dye, 4, 1));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.double_plant, 1, 5), new ItemStack(Items.dye, 4, 9));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());

        CrusherRecipeRegistry.addRecipe("oreRedstone", "dustRedstone", 10);
        CrusherRecipeRegistry.addRecipe("oreLapis", "gemLapis", 12);
        CrusherRecipeRegistry.addRecipe("coal", "dustCoal", 1);
        CrusherRecipeRegistry.addRecipe("oreCoal", "coal", 3);
        CrusherRecipeRegistry.addRecipe("blockCoal", "coal", 9);
        CrusherRecipeRegistry.addRecipe("oreQuartz", "gemQuartz", 3);
        CrusherRecipeRegistry.addRecipe("cobblestone", "sand", 1);
        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.gravel), new ItemStack(Items.flint), new ItemStack(Items.flint), 50);
        CrusherRecipeRegistry.addRecipe("stone", "cobblestone", 1);

        CrusherRecipeRegistry.addRecipe(new ItemStack(InitItems.itemFoods, 1, TheFoods.RICE.ordinal()), new ItemStack(Items.sugar, 2));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());

        CrusherRecipeRegistry.addRecipe(new ItemStack(Blocks.glowstone), new ItemStack(Items.glowstone_dust, 4));
        miscRecipes.add(Util.GetRecipes.lastCrusherRecipe());

        CrusherRecipeRegistry.addRecipe("oreNickel", "dustNickel", 2, "dustPlatinum", 1, 15);
        CrusherRecipeRegistry.addRecipe("oreIron", "dustIron", 2, "dustGold", 1, 20);

        if(ConfigCrafting.HORSE_ARMORS.isEnabled()){
            CrusherRecipeRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), "dustIron", 8);
            recipeIronHorseArmor = Util.GetRecipes.lastCrusherRecipe();

            CrusherRecipeRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), "dustGold", 8);
            recipeGoldHorseArmor = Util.GetRecipes.lastCrusherRecipe();

            CrusherRecipeRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), "dustDiamond", 8);
            recipeDiamondHorseArmor = Util.GetRecipes.lastCrusherRecipe();
        }

        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("oreNether", 6));
        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("orePoor", 4, "nugget"));
        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("denseore", 8));
        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("gem", 1));
        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("ingot", 1));
        CrusherRecipeRegistry.searchCases.add(new CrusherRecipeRegistry.SearchCase("ore", 2));

        CrusherRecipeRegistry.registerFinally();
    }
}