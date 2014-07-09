package fr.mouarius.quickly.item;

import fr.mouarius.quickly.reference.Names;

public class ItemQuicker extends ItemQuickly
{
    public ItemQuicker()
    {
        this.setUnlocalizedName(Names.Items.QUICKLY_TAB_ITEM);
        this.maxStackSize = 1;
        this.canRepair= false;
    }

}
