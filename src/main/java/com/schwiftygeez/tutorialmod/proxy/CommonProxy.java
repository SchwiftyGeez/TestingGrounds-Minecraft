package com.schwiftygeez.tutorialmod.proxy;

import com.schwiftygeez.tutorialmod.item._Items;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by SchwiftyGeez on 4/28/2017.
 */

public class CommonProxy {

    public void preinit(FMLPreInitializationEvent e)
    {
        _Items.commonPreinit();
    }

    public void init(FMLInitializationEvent e)
    {

    }

    public void postinit(FMLPostInitializationEvent e)
    {

    }
}
