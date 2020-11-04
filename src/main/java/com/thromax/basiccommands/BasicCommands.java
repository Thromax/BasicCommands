package com.thromax.basiccommands;

import com.thromax.basiccommands.commands.BackCommand;
import com.thromax.basiccommands.commands.FeedCommand;
import com.thromax.basiccommands.commands.GamemodeCommand;
import com.thromax.basiccommands.commands.HealCommand;
import com.thromax.basiccommands.commands.time.DawnCommand;
import com.thromax.basiccommands.commands.time.DayCommand;
import com.thromax.basiccommands.commands.time.DuskCommand;
import com.thromax.basiccommands.commands.time.NightCommand;
import com.thromax.basiccommands.utils.LastDeath;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;

import static com.thromax.basiccommands.Utils.configStringParser;

public class BasicCommands extends JavaPlugin {

    public static FileConfiguration config;
    public final String version = this.getDescription().getVersion();
    public static HashMap<Player, LastDeath> lastDeath = new HashMap<Player, LastDeath>();
    public static ConsoleCommandSender console;

    @Override
    public void onLoad() {
        // Create config.yml if doesn't exist already
        File configFile = new File(getDataFolder() + File.separator + "config.yml");
        if (!configFile.exists()) {
            saveDefaultConfig();
        }
        // Load config.yml
        config = YamlConfiguration.loadConfiguration(configFile);

        // Create ConsoleCommandSender
        console = this.getServer().getConsoleSender();

        this.getLogger().info(configStringParser("Messages.System.Load", true));
    }

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new PlayerEventListener(), this);

        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("feed").setExecutor(new FeedCommand());
        this.getCommand("gm").setExecutor(new GamemodeCommand());
        this.getCommand("dawn").setExecutor(new DawnCommand());
        this.getCommand("day").setExecutor(new DayCommand());
        this.getCommand("dusk").setExecutor(new DuskCommand());
        this.getCommand("night").setExecutor(new NightCommand());
        this.getCommand("back").setExecutor(new BackCommand());

        this.getLogger().info(configStringParser("Messages.System.Start", true));

    }

    @Override
    public void onDisable() {
        this.getLogger().info(configStringParser("Messages.System.Disable", true));
    }

}

