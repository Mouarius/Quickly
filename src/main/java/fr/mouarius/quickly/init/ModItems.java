package fr.mouarius.quickly.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mouarius.quickly.item.ItemQuicker;
import fr.mouarius.quickly.reference.Names;
import fr.mouarius.quickly.util.LogHelper;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item quicker;

    public static void initItems()
    {
        quicker = new ItemQuicker();

        registerItems();
        LogHelper.info("Items loaded successfully");
    }

    protected static void registerItems()
    {
        GameRegistry.registerItem(quicker, Names.Items.QUICKLY_TAB_ITEM);
    }
}
