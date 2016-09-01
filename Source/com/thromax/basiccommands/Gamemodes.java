/*
The original author is Thromax, if you have downloaded this plugin from another author you should remove it and download the original or your server
could be in danger
El autor original de este plugin es Thromax, si has descargado este plugin de otro autor deberias eliminarlo y descargarlo de su autor oficial o tu
servidor podria estar comprometido
 */
package com.thromax.basiccommands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Gamemodes implements CommandExecutor {

    private Main plugin;
    private static int gamemode;
    private static FileConfiguration config = Main.config;

    public Gamemodes(Main instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("gm")) {
            if (sender.hasPermission("bc.gm.survival") || sender.hasPermission("bc.gm.creative") || sender.hasPermission("bc.gm.adventure") || sender.hasPermission("bc.gm.spectator") || sender.hasPermission("bc.gm.*") || sender.hasPermission("bc.gm.op") || sender.isOp()) {
                if (args.length == 0) {
                    sender.sendMessage(config.getString("Alerts.InsValidGM"));
                }

                if (args.length > 2) {
                    sender.sendMessage(config.getString("Alerts.TooManyArgs"));
                }

                if (args.length == 1) {
                    if (sender instanceof Player) {

                        //SURVIVAL
                        if ("0".equals(args[0]) || "survival".equals(args[0])) {
                            if (sender.hasPermission("bc.gm.survival") || sender.hasPermission("bc.gm.*") || sender.hasPermission("bc.gm.op") || sender.isOp()) {
                                gamemode = 0;
                                Gamemodes.cambiaGamemode(sender, cmd, label, args);

                            } else {
                                sender.sendMessage(config.getString(("Alerts.Permission")));
                            }

                        }

                        //CREATIVO
                        if ("1".equals(args[0]) || "creative".equals(args[0])) {
                            if (sender.hasPermission("bc.gm.creative") || sender.hasPermission("bc.gm.*") || sender.hasPermission("bc.gm.op") || sender.isOp()) {
                                gamemode = 1;
                                Gamemodes.cambiaGamemode(sender, cmd, label, args);

                            } else {
                                sender.sendMessage(config.getString(("Alerts.Permission")));
                            }

                        }

                        //AVENTURA
                        if ("2".equals(args[0]) || "adventure".equals(args[0])) {
                            if (sender.hasPermission("bc.gm.adventure") || sender.hasPermission("bc.gm.*") || sender.hasPermission("bc.gm.op") || sender.isOp()) {
                                gamemode = 2;
                                Gamemodes.cambiaGamemode(sender, cmd, label, args);

                            } else {
                                sender.sendMessage(config.getString(("Alerts.Permission")));
                            }

                        }

                        //ESPECTADOR
                        if ("3".equals(args[0]) || "spectator".equals(args[0])) {
                            if (sender.hasPermission("bc.gm.spectator") || sender.hasPermission("bc.gm.*") || sender.hasPermission("bc.gm.op") || sender.isOp()) {
                                gamemode = 3;
                                Gamemodes.cambiaGamemode(sender, cmd, label, args);

                            } else {
                                sender.sendMessage(config.getString(("Alerts.Permission")));
                            }

                        }

                    } else {
                        sender.sendMessage(config.getString(("Alerts.NotPlayer")));
                    }
                }

                //A OTROS JUGADORES
                if (args.length == 2) {

                    if (sender.hasPermission("bc.gm.op") || sender.isOp()) {
                        //SURVIVAL
                        if ("0".equals(args[0]) || "survival".equals(args[0])) {
                            gamemode = 0;
                            Gamemodes.cambiaGMOther(sender, cmd, label, args);

                        }

                        //CREATIVO
                        if ("1".equals(args[0]) || "creative".equals(args[0])) {

                            gamemode = 1;
                            Gamemodes.cambiaGMOther(sender, cmd, label, args);

                        }

                        //AVENTURA
                        if ("2".equals(args[0]) || "adventure".equals(args[0])) {

                            gamemode = 2;
                            Gamemodes.cambiaGMOther(sender, cmd, label, args);

                        }

                        //ESPECTADOR
                        if ("3".equals(args[0]) || "spectator".equals(args[0])) {

                            gamemode = 3;
                            Gamemodes.cambiaGMOther(sender, cmd, label, args);

                        }
                    } else {
                        sender.sendMessage(config.getString(("Alerts.Permission")));
                    }

                }

            }

        }

        return true;
    }

    private static void cambiaGamemode(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if (gamemode == 0) {
            p.setGameMode(GameMode.SURVIVAL);
            sender.sendMessage(config.getString("Messages.GameModes.Survival"));
        }

        if (gamemode == 1) {
            p.setGameMode(GameMode.CREATIVE);
            sender.sendMessage(config.getString("Messages.GameModes.Creative"));
        }

        if (gamemode == 2) {
            p.setGameMode(GameMode.ADVENTURE);
            sender.sendMessage(config.getString("Messages.GameModes.Adventure"));
        }

        if (gamemode == 3) {
            p.setGameMode(GameMode.SPECTATOR);
            sender.sendMessage(config.getString("Messages.GameModes.Spectator"));
        }
    }

    private static void cambiaGMOther(CommandSender sender, Command cmd, String label, String[] args) {

        Player targetPlayer = (Player) sender.getServer().getPlayer(args[1]);
        if (targetPlayer == null) {
            sender.sendMessage(config.getString("Alerts.InsValidPlayer"));
        } else {
            if (gamemode == 0) {
                targetPlayer.setGameMode(GameMode.SURVIVAL);
                sender.sendMessage(ChatColor.GOLD + "Has cambiado al jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " al modo " + ChatColor.BLUE + "survival");
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + p.getName() + ChatColor.GOLD + " te ha cambiado al modo" + ChatColor.BLUE + " survival");

                } else {
                    targetPlayer.sendMessage(ChatColor.GOLD + "La consola te ha cambiado al modo " + ChatColor.BLUE + "survival");
                }
            }

            if (gamemode == 1) {
                targetPlayer.setGameMode(GameMode.CREATIVE);
                sender.sendMessage(ChatColor.GOLD + "Has cambiado al jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " al modo" + ChatColor.BLUE + " creativo");
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + p.getName() + ChatColor.GOLD + " te ha cambiado al modo" + ChatColor.BLUE + " creativo");
                } else {
                    targetPlayer.sendMessage(ChatColor.GOLD + "La consola te ha cambiado al modo" + ChatColor.BLUE + " creativo");
                }
            }

            if (gamemode == 2) {
                targetPlayer.setGameMode(GameMode.ADVENTURE);
                sender.sendMessage(ChatColor.GOLD + "Has cambiado al jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " al modo " + ChatColor.BLUE + "aventura");
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + p.getName() + ChatColor.GOLD + " te ha cambiado al modo" + ChatColor.BLUE + " aventura");
                } else {
                    targetPlayer.sendMessage(ChatColor.GOLD + "La consola te ha cambiado al modo" + ChatColor.BLUE + " aventura");
                }
            }

            if (gamemode == 3) {
                targetPlayer.setGameMode(GameMode.SPECTATOR);
                sender.sendMessage(ChatColor.GOLD + "Has cambiado al jugador " + ChatColor.BLUE + targetPlayer.getName() + ChatColor.GOLD + " al modo " + ChatColor.BLUE + "espectador");
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    targetPlayer.sendMessage(ChatColor.GOLD + "El jugador " + ChatColor.BLUE + p.getName() + ChatColor.GOLD + " te ha cambiado al modo" + ChatColor.BLUE + " espectador");
                } else {
                    targetPlayer.sendMessage(ChatColor.GOLD + "La consola te ha cambiado al modo " + ChatColor.BLUE + "espectador");
                }
            }
        }
    }
}
