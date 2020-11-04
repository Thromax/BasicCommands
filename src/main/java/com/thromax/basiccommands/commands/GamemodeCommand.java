package com.thromax.basiccommands.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static com.thromax.basiccommands.Utils.configStringParser;
import static com.thromax.basiccommands.constants.ConfigurationPaths.*;
import static com.thromax.basiccommands.constants.Permissions.*;

/**
 * Changes gamemode of a player.
 * <p><br><b>Usage: </b>/gm (gamemode or 1-3) [player]</p>
 * <br><p>Only players can use this command without setting any target player.</p>
 */
public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1 || args.length == 2) {
            switch (args[0]) {
                case "0":
                    if (args.length == 1 && sender.hasPermission(PERMISSION_CMD_GM_SURVIVAL)) {
                        if (sender instanceof Player) {
                            ((Player) sender).setGameMode(GameMode.SURVIVAL);
                            sender.sendMessage(configStringParser(CONFIG_GM_SURVIVAL_SELF_MESSAGE, sender.getName(), sender.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
                    } else if (args.length == 2 && sender.hasPermission(PERMISSION_CMD_GM_ALL)) {
                        Player targetPlayer = sender.getServer().getPlayer(args[1]);
                        if (targetPlayer != null) {
                            targetPlayer.setGameMode(GameMode.SURVIVAL);
                            sender.sendMessage(configStringParser(CONFIG_GM_SURVIVAL_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            if (sender instanceof Player)
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_SURVIVAL_BY_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            else
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_SURVIVAL_BY_CONSOLE_MESSAGE, sender.getName(), targetPlayer.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[1]));
                    } else
                        sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
                    break;
                case "1":
                    if (args.length == 1 && sender.hasPermission(PERMISSION_CMD_GM_CREATIVE)) {
                        if (sender instanceof Player) {
                            ((Player) sender).setGameMode(GameMode.CREATIVE);
                            sender.sendMessage(configStringParser(CONFIG_GM_CREATIVE_SELF_MESSAGE, sender.getName(), sender.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
                    } else if (args.length == 2 && sender.hasPermission(PERMISSION_CMD_GM_ALL)) {
                        Player targetPlayer = sender.getServer().getPlayer(args[1]);
                        if (targetPlayer != null) {
                            targetPlayer.setGameMode(GameMode.CREATIVE);
                            sender.sendMessage(configStringParser(CONFIG_GM_CREATIVE_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            if (sender instanceof Player)
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_CREATIVE_BY_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            else
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_CREATIVE_BY_CONSOLE_MESSAGE, sender.getName(), targetPlayer.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[1]));
                    } else
                        sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
                    break;
                case "2":
                    if (args.length == 1 && sender.hasPermission(PERMISSION_CMD_GM_ADVENTURE)) {
                        if (sender instanceof Player) {
                            ((Player) sender).setGameMode(GameMode.ADVENTURE);
                            sender.sendMessage(configStringParser(CONFIG_GM_ADVENTURE_SELF_MESSAGE, sender.getName(), sender.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
                    } else if (args.length == 2 && sender.hasPermission(PERMISSION_CMD_GM_ALL)) {
                        Player targetPlayer = sender.getServer().getPlayer(args[1]);
                        if (targetPlayer != null) {
                            targetPlayer.setGameMode(GameMode.ADVENTURE);
                            sender.sendMessage(configStringParser(CONFIG_GM_ADVENTURE_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            if (sender instanceof Player)
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_ADVENTURE_BY_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            else
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_ADVENTURE_BY_CONSOLE_MESSAGE, sender.getName(), targetPlayer.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[1]));
                    } else
                        sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
                    break;
                case "3":
                    if (args.length == 1 && sender.hasPermission(PERMISSION_CMD_GM_SPECTATOR)) {
                        if (sender instanceof Player) {
                            ((Player) sender).setGameMode(GameMode.SPECTATOR);
                            sender.sendMessage(configStringParser(CONFIG_GM_SPECTATOR_SELF_MESSAGE, sender.getName(), sender.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
                    } else if (args.length == 2 && sender.hasPermission(PERMISSION_CMD_GM_ALL)) {
                        Player targetPlayer = sender.getServer().getPlayer(args[1]);
                        if (targetPlayer != null) {
                            targetPlayer.setGameMode(GameMode.SPECTATOR);
                            sender.sendMessage(configStringParser(CONFIG_GM_SPECTATOR_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            if (sender instanceof Player)
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_SPECTATOR_BY_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                            else
                                targetPlayer.sendMessage(configStringParser(CONFIG_GM_SPECTATOR_BY_CONSOLE_MESSAGE, sender.getName(), targetPlayer.getName()));
                        } else
                            sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[1]));
                    } else
                        sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
                    break;
                default:
                    sender.sendMessage(configStringParser(CONFIG_INVALID_GM_ALERT, sender.getName(), args[0]));
                    return false;
            }
        } else {
            if (args.length != 0)
                sender.sendMessage(configStringParser(CONFIG_TOO_MANY_ARGS_ALERT, sender.getName()));
            return false;
        }
        return true;
    }
}
