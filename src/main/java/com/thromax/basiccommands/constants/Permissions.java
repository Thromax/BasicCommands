package com.thromax.basiccommands.constants;

/**
 * BasicCommands permissions stored in constants
 */
public final class Permissions {
    // Global permissions
    /**
     * <p><b>Global permission</b></p>
     * Gives players full access to everything within the plugin.
     */
    public static final String PERMISSION_ALL = "bc.all.*";

    // Command Permissions
    // Command /heal
    /**
     * <p><b>Command permission</b></p>
     * Allows players to heal themselves and others using /heal.
     */
    public static final String PERMISSION_CMD_HEAL_ALL = "bc.heal.*";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to heal themselves using /heal
     */
    public static final String PERMISSION_CMD_HEAL_SELF = "bc.heal.self";

    // Command /feed
    /**
     * <p><b>Command permission</b></p>
     * Allows players to feed themselves and others using /feed.
     */
    public static final String PERMISSION_CMD_FEED_ALL = "bc.feed.*";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to feed themselves using /feed
     */
    public static final String PERMISSION_CMD_FEED_SELF = "bc.feed.self";

    // Command /gm
    /**
     * <p><b>Command permission</b></p>
     * Allows players to set their own and other players' gamemode to any value using /gm.
     */
    public static final String PERMISSION_CMD_GM_ALL = "bc.gm.*";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to change to any gamemode using /gm.
     */
    public static final String PERMISSION_CMD_GM_ANY = "bc.gm.any";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to change to survival mode using /gm.
     */
    public static final String PERMISSION_CMD_GM_SURVIVAL = "bc.gm.survival";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to change to creative mode using /gm.
     */
    public static final String PERMISSION_CMD_GM_CREATIVE = "bc.gm.creative";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to change to adventure mode using /gm.
     */
    public static final String PERMISSION_CMD_GM_ADVENTURE = "bc.gm.adventure";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to change to spectator mode using /gm.
     */
    public static final String PERMISSION_CMD_GM_SPECTATOR = "bc.gm.spectator";

    // Command /time
    /**
     * <p><b>Command permission</b></p>
     * Allows players to set time to any hour using /time.
     */
    public static final String PERMISSION_CMD_TIME_ALL = "bc.time.*";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to set time to dawn using /time dawn.
     */
    public static final String PERMISSION_CMD_TIME_DAWN = "bc.time.dawn";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to set time to day using /time day.
     */
    public static final String PERMISSION_CMD_TIME_DAY = "bc.time.day";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to set time to dusk using /time dusk.
     */
    public static final String PERMISSION_CMD_TIME_DUSK = "bc.time.dusk";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to set time to night using /time night.
     */
    public static final String PERMISSION_CMD_TIME_NIGHT = "bc.time.night";

    // Command /back
    /**
     * <p><b>Command permission</b></p>
     * Allows players to return to their last death location using /back ignoring time limits.
     */
    public static final String PERMISSION_CMD_BACK_ALL = "bc.back.*";

    /**
     * <p><b>Command permission</b></p>
     * Allows players to return to their last death using /back during the period established BasicCommands settings.
     */
    public static final String PERMISSION_CMD_BACK_LIMITED = "bc.back.limited";
}
