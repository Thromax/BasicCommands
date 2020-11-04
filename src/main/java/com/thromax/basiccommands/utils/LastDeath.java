package com.thromax.basiccommands.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.time.LocalDateTime;

public class LastDeath {

    private Player player;
    private Location deathLocation;
    private LocalDateTime lastUsed;

    public LastDeath(Player player, Location deathLocation, LocalDateTime lastUsed) {
        this.player = player;
        this.deathLocation = deathLocation;
        this.lastUsed = lastUsed;
    }

    public LastDeath(Player player, Location deathLocation) {
        this(player, deathLocation, null);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getDeathLocation() {
        return deathLocation;
    }

    public void setDeathLocation(Location deathLocation) {
        this.deathLocation = deathLocation;
    }

    public LocalDateTime getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(LocalDateTime lastUsed) {
        this.lastUsed = lastUsed;
    }

}
