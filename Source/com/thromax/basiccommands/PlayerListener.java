/*
The original author is Thromax, if you have downloaded this plugin from another author you should remove it and download the original or your server
could be in danger
El autor original de este plugin es Thromax, si has descargado este plugin de otro autor deberias eliminarlo y descargarlo de su autor oficial o tu
servidor podria estar comprometido
 */
package com.thromax.basiccommands;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {

    private Main plugin;
    private static FileConfiguration config = Main.config;

    public PlayerListener(Main instance) {
        plugin = instance;

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.sendMessage((config.getString("Messages.Welcome")));
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        if (p.hasPermission("bc.all.*") || p.hasPermission("bc.move.*") || p.isOp()) {
        } else if (!p.hasPermission("bc.move.*")) {
            event.setCancelled(true);
            p.sendMessage(config.getString("Alerts.Movement"));

        }

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onDeath(PlayerDeathEvent event) {
        Player p = event.getEntity();
        if (p.hasPermission("bc.back.*") || p.hasPermission("bc.all.*") || p.isOp()) {
            Main.lastDeath.put(p.getName(), p.getLocation());
            p.sendMessage(config.getString("Messages.NewDeathLocation"));

        }
    }
}
