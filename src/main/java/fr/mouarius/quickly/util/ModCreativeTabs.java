package fr.mouarius.quickly.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mouarius.quickly.init.ModItems;
import fr.mouarius.quickly.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs
{
    public static final CreativeTabs tabQuicklyMod = new CreativeTabs(Reference.MOD_NAME)
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ModItems.item_quickly_tab;
        }
    };
}
