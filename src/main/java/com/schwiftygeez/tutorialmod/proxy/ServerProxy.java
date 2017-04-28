package com.schwiftygeez.tutorialmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by SchwiftyGeez on 4/28/2017.
 */

public class ServerProxy extends CommonProxy
{
    public void preinit(FMLPreInitializationEvent e)
    {
        super.preinit(e);
    }

    public void init(FMLInitializationEvent e)
    {
        super.init(e);
    }

    public void postinit(FMLPostInitializationEvent e)
    {
        super.postinit(e);
    }
}
