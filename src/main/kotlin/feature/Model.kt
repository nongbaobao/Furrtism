package io.random.feature

import com.alibaba.fastjson.annotation.JSONField
import net.mamoe.mirai.message.data.MessageChain
import net.mamoe.mirai.message.data.buildMessageChain
import net.mamoe.mirai.message.data.toPlainText

data class Total(
    @JSONField(name = "playerCount", defaultValue = "0")
    val total: Int
) {
    fun getMessage(): MessageChain {
        return buildMessageChain {
            +"====Furrtism====".toPlainText()
            +"| Server: mc.hypixel.net".toPlainText()
            +"| Total: $total".toPlainText()
        }
    }
}

data class MegaWalls(
    @JSONField(name = "standard", defaultValue = "0")
    val standard: Int,
    @JSONField(name = "face_off", defaultValue = "0")
    val faceOff: Int
) {
    fun getMessage(): MessageChain {
        return buildMessageChain {
            +"====Furrtism====".toPlainText()
            +"| Mode: Mega Walls".toPlainText()
            +"| Standard: $standard".toPlainText()
            +"| Face Off: $faceOff".toPlainText()
        }
    }
}

data class SkyWars(
    @JSONField(name = "solo_normal", defaultValue = "0")
    val soloNormal: Int,
    @JSONField(name = "solo_insane", defaultValue = "0")
    val soloInsane: Int,
    @JSONField(name = "teams_normal", defaultValue = "0")
    val teamsNormal: Int,
    @JSONField(name = "teams_insane", defaultValue = "0")
    val teamsInsane: Int
) {
    fun getMessage(): MessageChain {
        return buildMessageChain {
            +"====Furrtism====".toPlainText()
            +"| Mode: SkyWars".toPlainText()
            +"| Solo Normal: $soloNormal".toPlainText()
            +"| Solo Insane: $soloInsane".toPlainText()
            +"| Teams Normal: $teamsNormal".toPlainText()
            +"| Teams Insane: $teamsInsane".toPlainText()
        }
    }
}

data class UHC(
    @JSONField(name = "SOLO", defaultValue = "0")
    val solo: Int,
    @JSONField(name = "TEAMS", defaultValue = "0")
    val teams: Int,
    @JSONField(name = "BRAWL_DUO", defaultValue = "0")
    val brawlDuo: Int
) {
    fun getMessage(): MessageChain {
        return buildMessageChain {
            +"====Furrtism====".toPlainText()
            +"| Mode: UHC".toPlainText()
            +"| Solo: $solo".toPlainText()
            +"| Teams: $teams".toPlainText()
        }
    }
}