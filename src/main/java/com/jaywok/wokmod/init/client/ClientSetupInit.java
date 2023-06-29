package com.jaywok.wokmod.init.client;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

public class ClientSetupInit
{
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void clientSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("| WokMod | Client Successfully loaded!");
        LOGGER.info("| WokMod | Client Username >> {}", Minecraft.getInstance().getUser().getName());
    }
}
