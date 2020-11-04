package com.thromax.basiccommands.commands.time;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

import static com.thromax.basiccommands.Utils.configStringParser;
import static com.thromax.basiccommands.constants.ConfigurationPaths.*;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_TIME_NIGHT;

/**
 * It turns night in the selected world.
 * <p><br><b>Usage: </b>/night [world name or index]</p>
 */
public class NightCommand implements CommandExecutor {
    private static final int NIGHT_TIME = 13000;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            if (sender.hasPermission(PERMISSION_CMD_TIME_NIGHT)) {
                World w;
                if (sender instanceof Player) {
                    w = ((Player) sender).getWorld();
                    sender.sendMessage(configStringParser(CONFIG_NIGHT_CURRENT_WORLD_MESSAGE, sender.getName(), w.getName()));
                } else {
                    w = sender.getServer().getWorlds().get(0);
                    sender.sendMessage(configStringParser(CONFIG_NIGHT_ON_WORLD_MESSAGE, sender.getName(), w.getName()));
                }
                w.setTime(NIGHT_TIME);
            } else
                sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
        } else if (args.length == 1) {
            if (sender.hasPermission(PERMISSION_CMD_TIME_NIGHT)) {
                World w;
                try {
                    int i = Integer.parseInt(args[0]);
                    List<World> worldList = sender.getServer().getWorlds();
                    w = worldList.get(i);
                } catch (Exception e) {
                    w = sender.getServer().getWorld(args[0]);
                }
                if (w != null) {
                    w.setTime(NIGHT_TIME);
                    sender.sendMessage(configStringParser(CONFIG_NIGHT_ON_WORLD_MESSAGE, sender.getName(), w.getName()));
                } else
                    sender.sendMessage(configStringParser(CONFIG_INVALID_WORLD_ALERT, sender.getName(), args[0]));
            } else
                sender.sendMessage(configStringParser(CONFIG_PERMISSIONS_ALERT, sender.getName()));
        } else {
            sender.sendMessage(configStringParser(CONFIG_TOO_MANY_ARGS_ALERT, sender.getName()));
            return false;
        }
        return true;
    }
}
