package com.untamemadman.plugins.customplugins.Commands;

import com.untamemadman.plugins.customplugins.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * Created by untamemadman on 11/07/2017.
 */
public class CommandPlugins implements Listener
{
    @EventHandler
    public void onCommandPreprocess(PlayerCommandPreprocessEvent event)
    {
        Player sender = event.getPlayer();

        if (event.getMessage().equalsIgnoreCase("/plugins"))
        {
            event.setCancelled(true);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Plugins (1): &a"+ Main.name));
        }
        if (event.getMessage().equalsIgnoreCase("/pl"))
        {
            event.setCancelled(true);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Plugins (1): &a"+ Main.name));
        }
    }
}
