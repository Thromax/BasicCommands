package com.thromax.basiccommands.constants;

public final class ConfigurationPaths {
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>BasicCommands version name</p>
     */
    public static final String CONFIG_VERSION = "version";

    // Configurations
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>int</i>)</p>
     * <p>Time (in seconds) that players will have to wait between /back uses (0 to remove cooldown)</p>
     */
    public static final String CONFIG_BACK_COOLDOWN = "Configs.BackCooldown";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive every time they connect to the server.</p><br>
     * <p>%sender% = Player's name</p>
     */
    public static final String CONFIG_WELCOME_MESSAGE = "Messages.Welcome";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive every time they successfully get teleported by the plugin</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = Location</p>
     */
    public static final String CONFIG_TELEPORTED_MESSAGE = "Messages.Teleported";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive every time they die to remind them they can use /back command to return</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = Location</p>
     */
    public static final String CONFIG_NEW_DEATH_LOCATION_MESSAGE = "Messages.NewDeathLocation";

    // Gamemode Messages
    // Survival
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when changing their own gamemode to survival through /gm</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_GM_SURVIVAL_SELF_MESSAGE = "Messages.GameModes.SurvivalSelf";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to survival by another player using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SURVIVAL_BY_PLAYER_MESSAGE = "Messages.GameModes.SurvivalByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to survival by the server console using /gm</p><br>
     * <p>%sender% = Console's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SURVIVAL_BY_CONSOLE_MESSAGE = "Messages.GameModes.SurvivalByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they change another player's gamemode to survival using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SURVIVAL_PLAYER_MESSAGE = "Messages.GameModes.SurvivalPlayer";

    // Creative
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when changing their own gamemode to creative through /gm</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_GM_CREATIVE_SELF_MESSAGE = "Messages.GameModes.CreativeSelf";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to creative by another player using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_CREATIVE_BY_PLAYER_MESSAGE = "Messages.GameModes.CreativeByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to creative by the server console using /gm</p><br>
     * <p>%sender% = Console's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_CREATIVE_BY_CONSOLE_MESSAGE = "Messages.GameModes.CreativeByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they change another player's gamemode to creative using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_CREATIVE_PLAYER_MESSAGE = "Messages.GameModes.CreativePlayer";

    // Adventure
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when changing their own gamemode to adventure through /gm</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_GM_ADVENTURE_SELF_MESSAGE = "Messages.GameModes.AdventureSelf";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to adventure by another player using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_ADVENTURE_BY_PLAYER_MESSAGE = "Messages.GameModes.AdventureByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to adventure by the server console using /gm</p><br>
     * <p>%sender% = Console's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_ADVENTURE_BY_CONSOLE_MESSAGE = "Messages.GameModes.AdventureByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they change another player's gamemode to adventure using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_ADVENTURE_PLAYER_MESSAGE = "Messages.GameModes.AdventurePlayer";

    // Spectator
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when changing their own gamemode to spectator through /gm</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_GM_SPECTATOR_SELF_MESSAGE = "Messages.GameModes.SpectatorSelf";


    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to spectator by another player using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SPECTATOR_BY_PLAYER_MESSAGE = "Messages.GameModes.SpectatorByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when their gamemode gets changed to spectator by the server console using /gm</p><br>
     * <p>%sender% = Console's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SPECTATOR_BY_CONSOLE_MESSAGE = "Messages.GameModes.SpectatorByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they change another player's gamemode to spectator using /gm</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Gamemode-changed player's name</p>
     */
    public static final String CONFIG_GM_SPECTATOR_PLAYER_MESSAGE = "Messages.GameModes.SpectatorPlayer";

    // Healing And Feeding Messages
    // Healing
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they heal themselves using /heal</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_HEAL_SELF_MESSAGE = "Messages.HealingAndFeeding.HealedSelf";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when healed by another player through /heal</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Healed player's name</p>
     */
    public static final String CONFIG_HEAL_BY_PLAYER_MESSAGE = "Messages.HealingAndFeeding.HealedByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when healed by the server console through /heal</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Healed player's name</p>
     */
    public static final String CONFIG_HEAL_BY_CONSOLE_MESSAGE = "Messages.HealingAndFeeding.HealedByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when healing another player using /heal</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Fed player's name</p>
     */
    public static final String CONFIG_HEAL_PLAYER_MESSAGE = "Messages.HealingAndFeeding.HealedPlayer";

    // Feeding
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when they feed themselves using /feed</p><br>
     * <p>%sender%/%target% = Player's name</p>
     */
    public static final String CONFIG_FEED_SELF_MESSAGE = "Messages.HealingAndFeeding.FedSelf";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when fed by another player through /feed</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Fed player's name</p>
     */
    public static final String CONFIG_FEED_BY_PLAYER_MESSAGE = "Messages.HealingAndFeeding.FedByPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when fed by the server console through /feed</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Fed player's name</p>
     */
    public static final String CONFIG_FEED_BY_CONSOLE_MESSAGE = "Messages.HealingAndFeeding.FedByConsole";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when feeding another player using /feed</p><br>
     * <p>%sender% = Command sender's player name</p>
     * <p>%target% = Fed player's name</p>
     */
    public static final String CONFIG_FEED_PLAYER_MESSAGE = "Messages.HealingAndFeeding.FedPlayer";

    // Weather Messages
    // Dawn
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting their current world time to dawn using /dawn</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = World name</p>
     */
    public static final String CONFIG_DAWN_CURRENT_WORLD_MESSAGE = "Messages.Weather.DawnCurrentWorld";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting a world time to dawn using /dawn</p>
     * <p>%sender% = Player's name</p>
     * <p> %target% = World name</p>
     */
    public static final String CONFIG_DAWN_ON_WORLD_MESSAGE = "Messages.Weather.DawnOnWorld";

    // Day
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting their current world time to day using /day</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = World name</p>
     */
    public static final String CONFIG_DAY_CURRENT_WORLD_MESSAGE = "Messages.Weather.DayCurrentWorld";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting a world time to day using /day</p>
     * <p>%sender% = Player's name</p>
     * <p> %target% = World name</p>
     */
    public static final String CONFIG_DAY_ON_WORLD_MESSAGE = "Messages.Weather.DayOnWorld";

    // Dusk
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting their current world time to dusk using /dusk</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = World name</p>
     */
    public static final String CONFIG_DUSK_CURRENT_WORLD_MESSAGE = "Messages.Weather.DuskCurrentWorld";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting a world time to dusk using /dusk</p>
     * <p>%sender% = Player's name</p>
     * <p> %target% = World name</p>
     */
    public static final String CONFIG_DUSK_ON_WORLD_MESSAGE = "Messages.Weather.DuskOnWorld";

    // Night
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting their current world time to night using /night</p><br>
     * <p>%sender% = Player's name</p>
     * <p>%target% = World name</p>
     */
    public static final String CONFIG_NIGHT_CURRENT_WORLD_MESSAGE = "Messages.Weather.NightCurrentWorld";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when setting a world time to night using /night</p>
     * <p>%sender% = Player's name</p>
     * <p> %target% = World name</p>
     */
    public static final String CONFIG_NIGHT_ON_WORLD_MESSAGE = "Messages.Weather.NightOnWorld";

    // System
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be shown in the console on plugin load</p>
     */
    public static final String CONFIG_SYSTEM_LOAD_MESSAGE = "Messages.System.Load";
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be shown in the console on plugin start</p>
     */
    public static final String CONFIG_SYSTEM_START_MESSAGE = "Messages.System.Start";
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be shown in the console on plugin stop</p>
     */
    public static final String CONFIG_SYSTEM_DISABLE_MESSAGE = "Messages.System.Disable";

    // Alerts
    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message players will receive when trying to issue a command they lack permissions for</p><br>
     * <p>%sender% = Command issuer's name</p>
     */
    public static final String CONFIG_PERMISSIONS_ALERT = "Messages.Alerts.Permission";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when inputting too many arguments on a BasicCommands command</p><br>
     * <p>%sender% = Command issuer's name</p>
     */
    public static final String CONFIG_TOO_MANY_ARGS_ALERT = "Messages.Alerts.TooManyArgs";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when using a limited command too quickly</p><br>
     * <p>%sender% = Command issuer's name</p>
     */
    public static final String CONFIG_COOLDOWN_ALERT = "Messages.Alerts.Cooldown";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when a non-player command issuer attempts to use a player-only command</p><br>
     * <p>%sender% = Command issuer's name</p>
     */
    public static final String CONFIG_NOT_PLAYER_ALERT = "Messages.Alerts.NotPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be shown to players when using /back without any previous death location entry registered</p><br>
     * <p>%sender% = Command issuer's name</p>
     */
    public static final String CONFIG_NO_LAST_DEATH_ALERT = "Messages.Alerts.NoLastDeath";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when inputting an invalid gamemode</p><br>
     * <p>%sender% = Command issuer's name</p>
     * <p>%target% = GameMode issued</p>
     */
    public static final String CONFIG_INVALID_GM_ALERT = "Messages.Alerts.InvalidGM";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when inputting an invalid player</p><br>
     * <p>%sender% = Command issuer's name</p>
     * <p>%target% = Player issued</p>
     */
    public static final String CONFIG_INVALID_PLAYER_ALERT = "Messages.Alerts.InvalidPlayer";

    /**
     * <p><b>Configuration Path (config.yml)</b></p>
     * <p>Config Type: (<i>String</i>)</p>
     * <p>Message that will be displayed when inputting an invalid world</p><br>
     * <p>%sender% = Command issuer's name</p>
     * <p>%target% = World issued</p>
     */
    public static final String CONFIG_INVALID_WORLD_ALERT = "Messages.Alerts.InvalidWorld";
}
