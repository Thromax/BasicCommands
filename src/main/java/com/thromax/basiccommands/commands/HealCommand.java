package com.thromax.basiccommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static com.thromax.basiccommands.Utils.configStringParser;
import static com.thromax.basiccommands.constants.ConfigurationPaths.*;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_HEAL_ALL;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_HEAL_SELF;

/**
 * Heals a player.
 * <p><br><b>Usage: </b>/heal [player]</p>
 * <br><p>Only players can use this command without any arguments.</p>
 */
public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            if (sender.hasPermission(PERMISSION_CMD_HEAL_SELF)) {
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    p.setHealth(20);
                    p.sendMessage(configStringParser(CONFIG_HEAL_SELF_MESSAGE, p.getName(), p.getName()));
                } else {
                    sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
                }
            } else {
                sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
            }
        } else if (args.length == 1) {
            if (sender.hasPermission(PERMISSION_CMD_HEAL_ALL)) {
                Player targetPlayer = sender.getServer().getPlayer(args[0]);
                if (sender instanceof Player) {
                    if (targetPlayer == null) {
                        sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[0]));
                    } else {
                        targetPlayer.setHealth(20);
                        sender.sendMessage(configStringParser(CONFIG_HEAL_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                        targetPlayer.sendMessage(configStringParser(CONFIG_HEAL_BY_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));

                    }
                } else {
                    if (targetPlayer == null) {
                        sender.sendMessage(configStringParser(CONFIG_INVALID_PLAYER_ALERT, sender.getName(), args[0]));
                    } else {
                        targetPlayer.setHealth(20);
                        sender.sendMessage(configStringParser(CONFIG_HEAL_PLAYER_MESSAGE, sender.getName(), targetPlayer.getName()));
                        targetPlayer.sendMessage(configStringParser(CONFIG_HEAL_BY_CONSOLE_MESSAGE, sender.getName(), targetPlayer.getName()));
                    }
                }
            } else {
                sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
            }
        } else {
            sender.sendMessage(configStringParser(CONFIG_TOO_MANY_ARGS_ALERT, sender.getName()));
            return false;
        }
        return true;
    }
}
