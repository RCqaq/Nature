package nature.common.registration;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class WrappedDefferedRegister<T extends IForgeRegistryEntry<T>>
{
    protected final DeferredRegister<T> internal;

    public WrappedDefferedRegister(String modid, IForgeRegistry<T> registry)
    {
        internal = DeferredRegister.create(registry, modid);
    }
}
