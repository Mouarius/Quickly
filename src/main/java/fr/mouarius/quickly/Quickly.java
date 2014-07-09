package fr.mouarius.quickly;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.mouarius.quickly.handler.ConfigurationHandler;
import fr.mouarius.quickly.handler.RecipesHandler;
import fr.mouarius.quickly.init.ModItems;
import fr.mouarius.quickly.proxy.IProxy;
import fr.mouarius.quickly.reference.Reference;
import fr.mouarius.quickly.util.LogHelper;
import fr.mouarius.quickly.util.ModCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Quickly
{
    @Mod.Instance(Reference.MOD_ID)
    public static Quickly instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static CreativeTabs getTab()
    {
        return ModCreativeTabs.tabQuicklyMod;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.initItems();

        LogHelper.info("Pre-Initialization Complete");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RecipesHandler.initRecipes();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

        LogHelper.info("Post-Initialization Complete");
    }

}
