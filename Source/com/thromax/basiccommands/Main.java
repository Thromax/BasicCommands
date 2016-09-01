/*
The original author is Thromax, if you have downloaded this plugin from another author you should remove it and download the original or your server
could be in danger
El autor original de este plugin es Thromax, si has descargado este plugin de otro autor deberias eliminarlo y descargarlo de su autor oficial o tu
servidor podria estar comprometido
 */
package com.thromax.basiccommands;

import java.io.File;
import java.util.HashMap;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static double version = 1.0;
    public static String versionString = "1.0 - BETA";
    public static Main instance;
    public static FileConfiguration config;
    public static HashMap<String, Location> lastDeath = new HashMap<>();

    @Override
    public void onLoad() {
        this.getLogger().info((getConfig().getString("Messages.System.Load")));
    }

    @Override
    public void onEnable() {
        instance = this;
        File configFile = new File(getDataFolder() + File.separator + "config.yml");
        config = YamlConfiguration.loadConfiguration(configFile);

        if (!configFile.exists() || getConfig().getDouble("version") != version) {
            saveDefaultConfig();

        }

        this.getServer().getPluginManager().registerEvents(new PlayerListener(instance), instance);

        this.getCommand("exit").setExecutor(new Comando(this));
        this.getCommand("save").setExecutor(new Comando(this));
        this.getCommand("heal").setExecutor(new Comando(this));
        this.getCommand("feed").setExecutor(new Comando(this));
        this.getCommand("gm").setExecutor(new Gamemodes(this));
        this.getCommand("dawn").setExecutor(new TimeWeatherCommands(this));
        this.getCommand("day").setExecutor(new TimeWeatherCommands(this));
        this.getCommand("dusk").setExecutor(new TimeWeatherCommands(this));
        this.getCommand("night").setExecutor(new TimeWeatherCommands(this));
        this.getCommand("version").setExecutor(new Comando(this));
        this.getCommand("back").setExecutor(new Comando(this));

        this.getLogger().info((getConfig().getString("Messages.System.Start")));

    }

    @Override
    public void onDisable() {
        this.getLogger().info((config.getString("Messages.System.Disable")));
    }

}
