package com.jaywok.wokmod;

import com.jaywok.wokmod.init.BlockInit;
import com.jaywok.wokmod.init.CreativeTabInit;
import com.jaywok.wokmod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WokMod.MODID)
public class WokMod
{
    public static final String MODID = "wokmod";

    public WokMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.WOKTAB.register(bus);
    }


}
