package io.random.feature

import com.alibaba.fastjson.annotation.JSONField

data class Total(
    @JSONField(name = "playerCount", defaultValue = "0")
    val total: Int
)

data class MegaWalls(
    @JSONField(name = "standard", defaultValue = "0")
    val standard: Int,
    @JSONField(name = "face_off", defaultValue = "0")
    val faceOff: Int
)

data class SkyWars(
    @JSONField(name = "solo_normal", defaultValue = "0")
    val soloNormal: Int,
    @JSONField(name = "solo_insane", defaultValue = "0")
    val soloInsane: Int,
    @JSONField(name = "teams_normal", defaultValue = "0")
    val teamsNormal: Int,
    @JSONField(name = "teams_insane", defaultValue = "0")
    val teamsInsane: Int
)

data class UHC(
    @JSONField(name = "SOLO", defaultValue = "0")
    val solo: Int,
    @JSONField(name = "TEAMS", defaultValue = "0")
    val teams: Int
)