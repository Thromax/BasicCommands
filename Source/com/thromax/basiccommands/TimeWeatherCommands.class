/*
The original author is Thromax, if you have downloaded this plugin from another author you should remove it and download the original or your server
could be in danger
El autor original de este plugin es Thromax, si has descargado este plugin de otro autor deberias eliminarlo y descargarlo de su autor oficial o tu
servidor podria estar comprometido
 */
package com.thromax.basiccommands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class TimeWeatherCommands implements CommandExecutor {

    private Main plugin;
    private static int tiempo;
    //private static String clima;
    private static FileConfiguration config = Main.config;

    public TimeWeatherCommands(Main instance) {
        plugin = instance;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

/*WEATHER CONTROL IN FUTURE BUILDS!!*/

//TIME
        //DAWN
        if (label.equalsIgnoreCase("dawn")) {
            if (sender.hasPermission("bc.time.dawn") || sender.hasPermission("bc.all.*") || sender.isOp() || sender.hasPermission("bc.time.*")) {
                tiempo = 0;
                TimeWeatherCommands.cambiaTiempo(sender, cmd, label, args);
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        //DAY
        if (label.equalsIgnoreCase("day")) {
            if (sender.hasPermission("bc.time.day") || sender.hasPermission("bc.all.*") || sender.isOp() || sender.hasPermission("bc.time.*")) {
                tiempo = 1000;
                TimeWeatherCommands.cambiaTiempo(sender, cmd, label, args);
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        //DUSK
        if (label.equalsIgnoreCase("dusk")) {
            if (sender.hasPermission("bc.time.dusk") || sender.hasPermission("bc.all.*") || sender.isOp() || sender.hasPermission("bc.time.*")) {
                tiempo = 12000;
                TimeWeatherCommands.cambiaTiempo(sender, cmd, label, args);
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        //NIGHT
        if (label.equalsIgnoreCase("night")) {
            if (sender.hasPermission("bc.time.night") || sender.hasPermission("bc.all.*") || sender.isOp() || sender.hasPermission("bc.time.*")) {
                tiempo = 13000;
                TimeWeatherCommands.cambiaTiempo(sender, cmd, label, args);
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        //DAWN 0 DAY 1000 DUSK 12000 NIGHT 13000
        return true;
    }

    private static void cambiaTiempo(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length == 0) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                World world = p.getWorld();
                world.setTime(tiempo);
                sender.sendMessage(ChatColor.GOLD + "Se ha cambiado el tiempo a " + tiempo);
            } else {
                sender.sendMessage(config.getString(("Alerts.NotPlayer")));
            }
        } else {
            sender.sendMessage(config.getString("Alerts.TooManyArgs"));
        }
    }
}
