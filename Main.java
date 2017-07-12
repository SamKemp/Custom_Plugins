package com.untamemadman.plugins.customplugins;

import com.untamemadman.plugins.customplugins.Commands.CommandPlugins;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created by untamemadman on 11/07/2017.
 */
public class Main extends JavaPlugin
{
    public static String name = "Custom Plugin";

    @Override
    public void onEnable()
    {
        loadConfig();

        //Fired when the server enables the plugin
        getServer().getPluginManager().registerEvents(new CommandPlugins(), this);
    }

    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
    }

    //Config File
    public void loadConfig()
    {
        try
        {
            if (!getDataFolder().exists())
            {
                getDataFolder().mkdirs();
            }
            File file = new File(getDataFolder(), "config.yml");
            if (!file.exists())
            {
                getLogger().info("Config.yml not found, creating!");
                saveDefaultConfig();
            } else
            {
                getLogger().info("Config.yml found, loading!");
            }
            name = getConfig().getString("plugin-name");
        } catch (Exception e)
        {
            e.printStackTrace();
            name = "Custom Plugin";
        }


    }
}
