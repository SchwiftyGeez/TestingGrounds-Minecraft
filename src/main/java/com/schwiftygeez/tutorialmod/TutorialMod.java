package com.schwiftygeez.tutorialmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.schwiftygeez.tutorialmod.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION, name = ModInfo.NAME)
public class TutorialMod
{
    @Mod.Instance
    public static TutorialMod instance;

    @SidedProxy(clientSide = ModInfo.PROXY_BASE + ".ClientProxy", serverSide = ModInfo.PROXY_BASE + ".ServerProxy")
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger(ModInfo.MODID);

    @EventHandler
    public void preinit(FMLPreInitializationEvent e)
    {
        proxy.preinit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent e)
    {
        proxy.postinit(e);
    }
}
