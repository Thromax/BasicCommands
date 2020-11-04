![Banner](https://user-images.githubusercontent.com/20110319/96116220-684cd780-0ee8-11eb-8e8e-7371d6c72e3a.png)
<h2><img src="https://user-images.githubusercontent.com/20110319/96505298-36c06d00-1256-11eb-99ff-cc239b3625eb.png" width=40px style="float:left;">(EN) English</h2>

Just a simple toolkit designed to be as flexible and customizable as possible.
You can always contribute by creating a ticket, tickets can be about adding new functionality or fixing issues or typos.

Also, you can always download BasicCommands on the [BasicCommands CurseForge page](https://www.curseforge.com/minecraft/bukkit-plugins/thromax-basiccommands/ "BasicCommands on Bukkit") or by using the [releases menu](.../releases "Releases").

### Commands
| Command  | Description  |
| ------------ | ------------ |
| `heal [player]`  | Heals player  |
| `feed [player]`  | Feeds player  |
| <p>`gm (survival\|creative\|adventure\|spectator)`</p><p>`gm <0\|1\|2\|3>`</p>| Sets player's gamemode  |
| <p>`dawn`</p><p>`day`</p><p>`dusk`</p><p>`night`</p>  | Changes time on current world  |
| `back` | Teleports players to their last death location  |

### Permissions
| Permission  | Description  | Default | Children |
| ------------ | ------------ | ------------ | ------------ |
| `bc.all.*`  | Gives players full access to everything within the plugin.  | `op` | <p>`bc.heal.*`</p><p>`bc.feed.*`</p><p>`bc.gm.*`</p><p>`bc.time.*`</p><p>`bc.back.*`</p> |
| `bc.heal.*`  | Allows players to heal themselves and others using /heal.  | `op` | `bc.heal.self` |
| `bc.heal.self`  | Allows players to heal themselves using /heal.  | `op` | |
| `bc.feed.*`  | Allows players to feed themselves and others using /feed.  | `op` | `bc.feed.self` |
| `bc.feed.self`  | Allows players to feed themselves using /feed.  | `op` | |
| `bc.gm.*`  | Allows players to set their own and other players' gamemode to any value using /gm. | `op`  | `bc.gm.any` |
| `bc.gm.any`  | Allows players to change to any gamemode using /gm. | `op` | <p>`bc.gm.survival`</p><p>`bc.gm.creative`</p><p>`bc.gm.adventure`</p><p>`bc.gm.spectator`</p> |
| `bc.gm.survival`  | Allows players to change to survival mode using /gm. | `op` | |
| `bc.gm.creative`  | Allows players to change to creative mode using /gm. | `op` | |
| `bc.gm.adventure`  | Allows players to change to adventure mode using /gm. | `op` | |
| `bc.gm.spectator`  | Allows players to change to spectator mode using /gm. | `op` | |
| `bc.time.*`  | Allows players to set time to any hour using BasicCommands time commands. | `op` | <p>`bc.time.dawn`</p><p>`bc.time.day`</p><p>`bc.time.dusk`</p><p>`bc.time.night`</p> |
| `bc.gm.dawn`  | Allows players to set time to dawn using /dawn. | `op` | |
| `bc.gm.day`  | Allows players to set time to day using /day. | `op` | |
| `bc.gm.dusk`  | Allows players to set time to dusk using /dusk. | `op` | |
| `bc.gm.night`  | Allows players to set time to night using /night. | `op` | |
| `bc.back.*` | Allows players to return to their last death location using /back ignoring time limits. | `op` | `bc.back.limited` |
| `bc.back.limited` | Allows players to return to their last death using /back during the period established BasicCommands settings. | `true` | |

### Config.yml Placeholders
You can fully customise your config.yml file by using console-compatible chat colors and supported placeholders.

| Placeholder | Description |
| ------------ | ------------ |
| `%sender%` | Placeholder for command sender's player name. <p>_(Only on compatible configurations)_</p> |
| `%target%` | Placeholder for current target. <p>_(Only on compatible configurations)_</p><p>This can be various things (specified per configuration) such as a player's name, gamemode, location or world.</p> |
| `%black%` | Color placeholder equivalent to `§0` |
| `%dark_blue%` | Color placeholder equivalent to `§1` |
| `%dark_green%` | Color placeholder equivalent to `§2` |
| `%dark_aqua%` | Color placeholder equivalent to `§3` |
| `%dark_red%` | Color placeholder equivalent to `§4` |
| `%dark_purple%` | Color placeholder equivalent to `§5` |
| `%gold%` | Color placeholder equivalent to `§6` |
| `%gray%` | Color placeholder equivalent to `§7` |
| `%dark_gray%` | Color placeholder equivalent to `§8` |
| `%blue%` | Color placeholder equivalent to `§9` |
| `%green%` | Color placeholder equivalent to `§a` |
| `%aqua%` | Color placeholder equivalent to `§b` |
| `%red%` | Color placeholder equivalent to `§c` |
| `%pink%` | Color placeholder equivalent to `§d` |
| `%yellow%` | Color placeholder equivalent to `§e` |
| `%white%` | Color placeholder equivalent to `§f` |
| `%bold%` | Text formatting placeholder equivalent to `§l` |
| `%random%` | Text formatting placeholder equivalent to `§k` |
| `%strike%` | Text formatting placeholder equivalent to `§m` |
| `%underline%` | Text formatting placeholder equivalent to `§n` |
| `%italic%` | Text formatting placeholder equivalent to `§o` |