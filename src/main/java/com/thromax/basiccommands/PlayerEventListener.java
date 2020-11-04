package com.thromax.basiccommands;

import com.thromax.basiccommands.utils.LastDeath;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import static com.thromax.basiccommands.BasicCommands.lastDeath;
import static com.thromax.basiccommands.Utils.configStringParser;
import static com.thromax.basiccommands.constants.ConfigurationPaths.CONFIG_NEW_DEATH_LOCATION_MESSAGE;
import static com.thromax.basiccommands.constants.ConfigurationPaths.CONFIG_WELCOME_MESSAGE;
import static com.thromax.basiccommands.constants.Permissions.PERMISSION_CMD_BACK_LIMITED;

public class PlayerEventListener implements Listener {

    /**
     * Welcomes players when they connect
     */
    @EventHandler(priority = EventPriority.NORMAL)
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.sendMessage(configStringParser(CONFIG_WELCOME_MESSAGE, p.getName(), true));
    }

    /**
     * Logs player's death for later use through /back command.
     */
    @EventHandler(priority = EventPriority.MONITOR)
    public void onDeath(PlayerDeathEvent event) {
        Player p = event.getEntity();
        if (p.hasPermission(PERMISSION_CMD_BACK_LIMITED)) {
            LastDeath death = lastDeath.get(p);
            if (death == null)
                lastDeath.put(p, new LastDeath(p, p.getLocation()));
            else
                death.setDeathLocation(p.getLocation());
            p.sendMessage(configStringParser(CONFIG_NEW_DEATH_LOCATION_MESSAGE, p.getName(), p.getLocation().getBlock().getLocation().toVector().toString()));
        }
    }
}
