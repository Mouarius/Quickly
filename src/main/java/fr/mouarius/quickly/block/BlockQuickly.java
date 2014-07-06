package fr.mouarius.quickly.block;

import fr.mouarius.quickly.util.ModCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockQuickly extends Block
{

    protected BlockQuickly(Material material)
    {
        super(material);
        this.setCreativeTab(ModCreativeTabs.tabQuicklyMod);
    }
}
