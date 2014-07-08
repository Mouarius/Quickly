package fr.mouarius.quickly.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mouarius.quickly.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipesHandler
{
    public static void initRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.quicker, 1), new Object[]{
            " P ", "PYP", " P ", 'P', Items.paper, 'Y', new ItemStack(Items.dye,1, 11)
        });
    }
}
