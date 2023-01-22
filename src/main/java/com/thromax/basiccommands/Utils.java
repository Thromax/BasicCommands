package com.thromax.basiccommands;

import org.bukkit.World;
import org.fusesource.jansi.Ansi;

import java.util.List;

import static com.thromax.basiccommands.BasicCommands.config;
import static com.thromax.basiccommands.constants.ColorPlaceholders.ANSI_PLACEHOLDERS;
import static com.thromax.basiccommands.constants.ColorPlaceholders.COLOR_PLACEHOLDERS;
import static com.thromax.basiccommands.constants.ConfigPlaceholders.SENDER_NAME_PLACEHOLDER;
import static com.thromax.basiccommands.constants.ConfigPlaceholders.TARGET_PLACEHOLDER;

/**
 * Tools for internal use
 */
public class Utils {
    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     *
     * @param configPath Configuration path
     * @param ansiMode   Use Ansi for color coding instead of Bukkit ChatColors (Console mode)
     * @param senderName Command executor's name
     * @param target     Target
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, boolean ansiMode, String senderName, String target) {
        if (configPath != null && config.getString(configPath) != null) {
            String conf = colorStringParser(config.getString(configPath), ansiMode);
            conf = conf.replaceAll(SENDER_NAME_PLACEHOLDER, senderName);
            conf = conf.replaceAll(TARGET_PLACEHOLDER, target);
            return conf;
        } else return colorStringParser("%red%Missing message! Is config.yml valid?");
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     * <p>(Color parsing is performed using Bukkit ChatColors)</p>
     *
     * @param configPath Configuration path
     * @param senderName Command executor's name
     * @param target     Target
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, String senderName, String target) {
        return configStringParser(configPath, false, senderName, target);
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     *
     * @param configPath Configuration path
     * @param ansiMode   Use Ansi for color coding instead of Bukkit ChatColors (Console mode)
     * @param senderName Command executor's name
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, boolean ansiMode, String senderName) {
        return configStringParser(configPath, ansiMode, senderName, "Null");
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     * <p>(Color parsing is performed using Bukkit ChatColors)</p>
     *
     * @param configPath Configuration path
     * @param senderName Command executor's name
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, String senderName) {
        return configStringParser(configPath, senderName, "Null");
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     * <p>(Color parsing is performed using Bukkit ChatColors)</p>
     *
     * @param configPath   Configuration path
     * @param ansiMode     Use Ansi for color coding instead of Bukkit ChatColors (Console mode)
     * @param senderTarget Command executor's name or target
     * @param target       Defines if specified String is target
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, boolean ansiMode, String senderTarget, boolean target) {
        return (target) ? configStringParser(configPath, ansiMode, "Null", senderTarget) : configStringParser(configPath, ansiMode, senderTarget, "Null");
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     * <p>(Color parsing is performed using Bukkit ChatColors)</p>
     *
     * @param configPath   Configuration path
     * @param senderTarget Command executor's name or target
     * @param target       Defines if specified String is target
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, String senderTarget, boolean target) {
        return (target) ? configStringParser(configPath, "Null", senderTarget) : configStringParser(configPath, senderTarget, "Null");
    }

    /**
     * Retrieves and parses configuration from config.yml using placeholders.
     * <p>(Just replaces non-color placeholders to "Null", used for color parsing)</p>
     *
     * @param configPath Configuration path
     * @param ansiMode   Use Ansi for color coding instead of Bukkit ChatColors (Console mode)
     * @return Parsed configuration string
     */
    public static String configStringParser(String configPath, boolean ansiMode) {
        return configStringParser(configPath, ansiMode, "Null", "Null");
    }

    /**
     * Replaces all color placeholders with actual color codes.
     *
     * @param str      String to be parsed
     * @param ansiMode Use ANSI codes instead of Bukkit ChatColors (Console mode)
     * @return Parsed string
     */
    public static String colorStringParser(String str, boolean ansiMode) {
        if (str != null) {
            if (ansiMode) {
                for (String color : ANSI_PLACEHOLDERS) {
                    str = str.replaceAll(color, ANSI_PLACEHOLDERS.get(color));
                }
                str += Ansi.ansi().a(Ansi.Attribute.RESET).toString();
            } else {
                for (String color : COLOR_PLACEHOLDERS) {
                    str = str.replaceAll(color, COLOR_PLACEHOLDERS.get(color));
                }
            }
            return str;
        } else return "Null";
    }

    /**
     * Replaces all color placeholders with actual Spigot color codes (Bukkit ChatColors).
     *
     * @param str String to be parsed
     * @return Parsed string
     */
    public static String colorStringParser(String str) {
        return colorStringParser(str, false);
    }

    /**
     * Returns prettified World List (Uses color placeholders)
     *
     * @param worldList World List to prettify
     * @return Prettified World List
     */
    public static String listWorlds(List<World> worldList) {
        int i = 0;
        String str = "";
        for (World w : worldList) {
            str += "\n%dark_blue%(%blue%" + i + "%dark_blue%) %gold%" + w.getName();
        }
        return str;
    }

}