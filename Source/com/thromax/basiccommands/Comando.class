/*
The original author is Thromax, if you have downloaded this plugin from another author you should remove it and download the original or your server
could be in danger
El autor original de este plugin es Thromax, si has descargado este plugin de otro autor deberias eliminarlo y descargarlo de su autor oficial o tu
servidor podria estar comprometido
 */
package com.thromax.basiccommands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

public class Comando implements CommandExecutor {

    private Main plugin;
    private static FileConfiguration config = Main.config;
    private Location lastDeathLoc;

    public Comando(Main instance) {
        plugin = instance;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("heal")) {
            if (sender.hasPermission("bc.heal.*") || sender.hasPermission("bc.heal.op") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                if (args.length == 0) {

                    if (sender instanceof Player) {
                        Player p = (Player) sender;
                        p.setHealth(20);
                        p.sendMessage(config.getString("Healing and Feeding.SelfHealed"));
                    } else {
                        sender.sendMessage(config.getString(("Alerts.NotPlayer")));
                    }
                } else if (args.length == 1 && sender.hasPermission("bc.heal.op") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                    if (sender instanceof Player) {
                        Player targetPlayer = sender.getServer().getPlayer(args[0]);
                        if (targetPlayer == null) {
                            sender.sendMessage(config.getString("Alerts.InsValidPlayer"));
                        } else {
                            targetPlayer.setHealth(20);
                            targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + sender.getName() + " te ha curado!!");
                            sender.sendMessage(ChatColor.GOLD + "El jugador " + targetPlayer.getName() + " ha sido curado!!");
                        }
                    } else {
                        Player targetPlayer = sender.getServer().getPlayer(args[0]);
                        if (targetPlayer == null) {
                            sender.sendMessage(config.getString("Alerts.InsValidPlayer"));
                        } else {
                            targetPlayer.setHealth(20);
                            sender.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " ha sido curado!!");
                            targetPlayer.sendMessage(config.getString("Healing and Feeding.HealedByConsole"));
                        }
                    }
                } else {
                    sender.sendMessage(config.getString(("Alerts.Permission")));
                }
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        if (label.equalsIgnoreCase("feed")) {
            if (sender.hasPermission("bc.feed.*") || sender.hasPermission("bc.feed.op") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                if (args.length == 0) {

                    if (sender instanceof Player) {
                        Player p = (Player) sender;
                        p.setFoodLevel(20);
                        p.sendMessage(config.getString("Healing and Feeding.SelfFeeded"));
                    } else {
                        sender.sendMessage(config.getString(("Alerts.NotPlayer")));
                    }
                } else if (args.length == 1 && sender.hasPermission("bc.feed.op") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                    if (sender instanceof Player) {
                        Player targetPlayer = sender.getServer().getPlayer(args[0]);
                        if (targetPlayer == null) {
                            sender.sendMessage(config.getString("Alerts.InsValidPlayer"));
                        } else {
                            targetPlayer.setFoodLevel(20);
                            sender.sendMessage(ChatColor.GOLD + "El jugador " + targetPlayer.getName() + " ha sido alimentado!!");
                            targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + sender.getName() + " te ha alimentado!!");
                        }
                    } else {
                        Player targetPlayer = sender.getServer().getPlayer(args[0]);
                        if (targetPlayer == null) {
                            sender.sendMessage(config.getString("Alerts.InsValidPlayer"));
                        } else {
                            targetPlayer.setFoodLevel(20);
                            sender.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " ha sido alimentado!!");
                            targetPlayer.sendMessage(config.getString("Healing and Feeding.FeededByConsole"));
                        }
                    }
                } else {
                    sender.sendMessage(config.getString(("Alerts.Permission")));
                }
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }
        }

        if (label.equalsIgnoreCase("exit")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("bc.exit.*") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                    Player p = (Player) sender;
                    sender.sendMessage(config.getString("Messages.System.Saving"));
                    sender.getServer().savePlayers();
                    sender.sendMessage(config.getString("Messages.System.Stopping"));
                    sender.getServer().shutdown();
                } else {
                    sender.sendMessage(config.getString(("Alerts.Permission")));
                }
            } else {

                sender.sendMessage(config.getString("Messages.System.Saving"));
                sender.getServer().savePlayers();
                sender.sendMessage(config.getString("Messages.System.Stopping"));
                sender.getServer().shutdown();
            }
        }

        if (label.equalsIgnoreCase("save")) {
            if (sender.hasPermission("bc.save.*") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                sender.sendMessage(config.getString("Messages.System.Saving"));
                sender.getServer().savePlayers();
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }

        }

        if (label.equalsIgnoreCase("version")) {
            if (sender.hasPermission("bc.version.*") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                sender.sendMessage(ChatColor.GOLD + "BasicCommands by Thromax    GNU General Public License version 3 (GPLv3)   version " + ChatColor.BLUE + Main.versionString);
                sender.sendMessage(ChatColor.GOLD + "If you have downloaded this plugin from another author you should " + ChatColor.RED + "remove it" + ChatColor.GOLD + " and download the original" + ChatColor.RED + " or your server could be in danger");
                sender.sendMessage(ChatColor.GOLD + "Si has descargado este plugin de otro autor deberias " + ChatColor.RED + " eliminarlo" + ChatColor.GOLD + " y descargarlo de su autor oficial" + ChatColor.RED + " o tu servidor podria estar comprometido");

            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }

        }

        if (label.equalsIgnoreCase("back")) {
            if (sender.hasPermission("bc.back.*") || sender.hasPermission("bc.all.*") || sender.isOp()) {
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    if (Main.lastDeath.containsKey(p.getName())) {

                        lastDeathLoc = Main.lastDeath.get(p.getName());
                        p.teleport(lastDeathLoc);
                        sender.sendMessage(config.getString(("Messages.Teleported")));
                    } else {
                        sender.sendMessage(config.getString(("Alerts.NoLastDeath")));
                    }

                } else {
                    sender.sendMessage(config.getString(("Alerts.NotPlayer")));
                }
            } else {
                sender.sendMessage(config.getString(("Alerts.Permission")));
            }

        }




return true;
    }

}
