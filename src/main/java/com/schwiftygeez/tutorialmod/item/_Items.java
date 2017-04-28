package com.schwiftygeez.tutorialmod.item;

import com.schwiftygeez.tutorialmod.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SchwiftyGeez on 4/28/2017.
 */
public class _Items
{
    public static final List<Item> items = new ArrayList<Item>();
    public static Item itemTutorial;

    public static final void commonPreinit()
    {
        itemTutorial = registerItem(new Item(), "item_tutorial");
    }

    public static final void clientInit()
    {
        for(Item item : items) {
            registerRender(itemTutorial);
        }
    }

    private static final void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(ModInfo.MODID + ":" + item.getRegistryName().getResourcePath(), "inventory")
        );
    }

    public static final Item registerItem(Item item, String name)
    {
        GameRegistry.register(item, new ResourceLocation(ModInfo.MODID, name));
        item.setUnlocalizedName(name);
        items.add(item);
        return item;
    }
}
