package com.thromax.basiccommands.constants;

import com.thromax.basiccommands.utils.StringHashMap;
import org.bukkit.ChatColor;
import org.fusesource.jansi.Ansi;

public final class ColorPlaceholders {
    /**
     * Immutable custom type HashMap that contains all color placeholders and their replacements.
     * <p>Values are stored like: [placeholder (key)]:[replacement (value)]</p>
     */
    public static final StringHashMap COLOR_PLACEHOLDERS = new StringHashMap(new String[][]
            {
                    {"%black%", ChatColor.BLACK.toString()},
                    {"%dark_blue%", ChatColor.DARK_BLUE.toString()},
                    {"%dark_green%", ChatColor.DARK_GREEN.toString()},
                    {"%dark_aqua%", ChatColor.DARK_AQUA.toString()},
                    {"%dark_red%", ChatColor.DARK_RED.toString()},
                    {"%dark_purple%", ChatColor.DARK_PURPLE.toString()},
                    {"%gold%", ChatColor.GOLD.toString()},
                    {"%gray%", ChatColor.GRAY.toString()},
                    {"%dark_gray%", ChatColor.DARK_GRAY.toString()},
                    {"%blue%", ChatColor.BLUE.toString()},
                    {"%green%", ChatColor.GREEN.toString()},
                    {"%aqua%", ChatColor.AQUA.toString()},
                    {"%red%", ChatColor.RED.toString()},
                    {"%pink%", ChatColor.LIGHT_PURPLE.toString()},
                    {"%yellow%", ChatColor.YELLOW.toString()},
                    {"%white%", ChatColor.WHITE.toString()},
                    {"%random%", ChatColor.MAGIC.toString()},
                    {"%bold%", ChatColor.BOLD.toString()},
                    {"%strike%", ChatColor.STRIKETHROUGH.toString()},
                    {"%underline%", ChatColor.UNDERLINE.toString()},
                    {"%italic%", ChatColor.ITALIC.toString()}
            });

    /**
     * Immutable custom type HashMap that contains all color placeholders and their replacements.
     * <p>Values are stored like: [placeholder (key)]:[replacement (value)]</p>
     */
    public static final StringHashMap ANSI_PLACEHOLDERS = new StringHashMap(new String[][]
            {
                    {"%black%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLACK).boldOff().toString()},
                    {"%dark_blue%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLUE).boldOff().toString()},
                    {"%dark_green%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.GREEN).boldOff().toString()},
                    {"%dark_aqua%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.CYAN).boldOff().toString()},
                    {"%dark_red%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.RED).boldOff().toString()},
                    {"%dark_purple%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.MAGENTA).boldOff().toString()},
                    {"%gold%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.YELLOW).boldOff().toString()},
                    {"%gray%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.WHITE).boldOff().toString()},
                    {"%dark_gray%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLACK).bold().toString()},
                    {"%blue%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.BLUE).bold().toString()},
                    {"%green%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.GREEN).bold().toString()},
                    {"%aqua%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.CYAN).bold().toString()},
                    {"%red%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.RED).bold().toString()},
                    {"%pink%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.MAGENTA).bold().toString()},
                    {"%yellow%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.YELLOW).bold().toString()},
                    {"%white%", Ansi.ansi().a(Ansi.Attribute.RESET).fg(Ansi.Color.WHITE).bold().toString()},
                    {"%random%", Ansi.ansi().a(Ansi.Attribute.BLINK_SLOW).toString()},
                    {"%bold%", Ansi.ansi().a(Ansi.Attribute.UNDERLINE_DOUBLE).toString()},
                    {"%strike%", Ansi.ansi().a(Ansi.Attribute.STRIKETHROUGH_ON).toString()},
                    {"%underline%", Ansi.ansi().a(Ansi.Attribute.UNDERLINE).toString()},
                    {"%italic%", Ansi.ansi().a(Ansi.Attribute.ITALIC).toString()}
            });
}

