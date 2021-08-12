package nature.common.tabs;

import nature.common.registries.NatureItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TabBotanic extends CreativeModeTab
{
    public TabBotanic()
    {
        super("tab_botanic");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(NatureItems.GRASS_FIBER.get());
    }
}
