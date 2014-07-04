package fr.mouarius.quickly.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import fr.mouarius.quickly.handler.ConfigurationHandler;
import fr.mouarius.quickly.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen parentScreen)
    {
//        super(parentScreen, new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
//                Reference.MOD_ID,
//                false,
//                false,
//                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        super(parentScreen,
                new ConfigElement(new ConfigurationHandler().configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath((new ConfigurationHandler().configuration.toString())));
    }
}
