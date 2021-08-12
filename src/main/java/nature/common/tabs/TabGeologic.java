package nature.common.tabs;

import nature.common.registries.NatureItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabGeologic extends CreativeModeTab
{
    public TabGeologic()
    {
        super("tab_geologic");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(NatureItems.GRASS_FIBER.get());
    }
}
