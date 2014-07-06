package fr.mouarius.quickly.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mouarius.quickly.item.ItemQuicklyTab;
import fr.mouarius.quickly.reference.Names;
import fr.mouarius.quickly.util.LogHelper;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item item_quickly_tab;

    public static void initItems()
    {
        item_quickly_tab = new ItemQuicklyTab();

        registerItems();
        LogHelper.info("Items loaded successfully");
    }

    protected static void registerItems()
    {
        GameRegistry.registerItem(item_quickly_tab, Names.Items.QUICKLY_TAB_ITEM);
    }
}
