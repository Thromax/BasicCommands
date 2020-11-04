package com.thromax.basiccommands.commands;

import com.thromax.basiccommands.utils.LastDeath;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static com.thromax.basiccommands.BasicCommands.config;
import static com.thromax.basiccommands.BasicCommands.lastDeath;
import static com.thromax.basiccommands.Utils.configStringParser;
import static com.thromax.basiccommands.constants.ConfigurationPaths.*;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_BACK_ALL;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_BACK_LIMITED;

/**
 * Teleports players to their last death location (if exists)
 * <p><br><b>Usage: </b>/back</p>
 * <br><p>Only players can use this command.</p>
 */
public class BackCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission(PERMISSION_CMD_BACK_LIMITED)) {
            if (args.length == 0) {
                if (sender instanceof Player) {
                    // Check if is there any previous death location
                    Player p = (Player) sender;
                    LastDeath death = lastDeath.get(p);
                    // If there's any previous registered death teleport player to death location
                    if (death != null) {
                        // Check for command cooldown
                        int lastTime = (death.getLastUsed() == null) ? 0 : Math.toIntExact(death.getLastUsed().until(LocalDateTime.now(), ChronoUnit.SECONDS));
                        if (sender.hasPermission(PERMISSION_CMD_BACK_ALL) || death.getLastUsed() == null || lastTime >= config.getInt(CONFIG_BACK_COOLDOWN)) {
                            p.teleport(death.getDeathLocation(), PlayerTeleportEvent.TeleportCause.PLUGIN);
                            death.setLastUsed(LocalDateTime.now());
                            sender.sendMessage(configStringParser(CONFIG_TELEPORTED_MESSAGE, sender.getName(), death.getDeathLocation().getBlock().getLocation().toVector().toString()));
                        } else {
                            sender.sendMessage(configStringParser(CONFIG_COOLDOWN_ALERT, sender.getName(), String.valueOf(config.getInt(CONFIG_BACK_COOLDOWN) - lastTime)));
                        }
                    } else {
                        sender.sendMessage(configStringParser(CONFIG_NO_LAST_DEATH_ALERT, sender.getName()));
                    }
                } else
                    sender.sendMessage(configStringParser(CONFIG_NOT_PLAYER_ALERT, sender.getName()));
            } else {
                sender.sendMessage(configStringParser(CONFIG_TOO_MANY_ARGS_ALERT, sender.getName()));
                return false;
            }
        } else
            sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
        return true;
    }
}
