package nature.common.tabs;

import nature.common.registries.NatureItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabZoological extends CreativeModeTab
{
    public TabZoological()
    {
        super("tab_zoological");
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(NatureItems.GRASS_FIBER.get());
    }
}
