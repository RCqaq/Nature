package nature.common.registration.impl;

import nature.common.registration.WrappedDefferedRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemDefferedRegister extends WrappedDefferedRegister
{
    public ItemDefferedRegister(String modid)
    {
        super(modid, ForgeRegistries.ITEMS);
    }
}
