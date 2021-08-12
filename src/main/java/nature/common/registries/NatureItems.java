package nature.common.registries;

import nature.common.Nature;
import nature.common.item.GrassFiber;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class NatureItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nature.MODID);

    public static final RegistryObject<Item> GRASS_FIBER = ITEMS.register("grass_fiber", GrassFiber::new);
}
