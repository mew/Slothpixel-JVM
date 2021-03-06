package zone.nora.slothpixel.player.stats.quake

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.quake.cosmetics.QuakeCosmetics
import zone.nora.slothpixel.player.stats.quake.cosmetics.EquippedQuakeCosmetics
import zone.nora.slothpixel.player.stats.quake.gamemodes.QuakeGamemodes
import zone.nora.slothpixel.player.stats.quake.settings.QuakeSettings
import zone.nora.slothpixel.player.stats.quake.votes.QuakeVotes

class Quake {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("gamemodes")
    val gamemodes = QuakeGamemodes()

    @SerializedName("kills_timeattack")
    val killsTimeattack = 0

    @SerializedName("highest_killstreak")
    val highestKillstreak = 0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("dash_power")
    val dashPower = 0

    @SerializedName("dash_cooldown")
    val dashCooldown = 0

    @SerializedName("alternative_gun_cooldown_indicator")
    val alternativeGunCooldownIndicator = false

    @SerializedName("equipped_cosmetics")
    val equippedCosmetics = EquippedQuakeCosmetics()

    @SerializedName("cosmetics")
    val cosmetics = QuakeCosmetics()

    @SerializedName("settings")
    val settings = QuakeSettings()

    @SerializedName("votes")
    val votes = QuakeVotes()
}