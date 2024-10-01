package io.random.feature

import com.alibaba.fastjson.JSON
import io.random.Config
import io.random.util.Browser

object Count {

    const val BASE_URL = "https://api.hypixel.net/counts?key="

    suspend fun mw(): MegaWalls {
        val json = Browser.get("$BASE_URL${Config.hyp_apiKey}")
        val parseObject = JSON.parseObject(json)
        if (parseObject.getBoolean("success")) {
            return parseObject
                .getJSONObject("games")
                .getJSONObject("WALLS3")
                .getJSONObject("modes")
                .toJavaObject(MegaWalls::class.java)
        } else {
            return MegaWalls(0, 0)
        }
    }

    suspend fun sw(): SkyWars {
        val json = Browser.get("$BASE_URL${Config.hyp_apiKey}")
        val parseObject = JSON.parseObject(json)
        if (parseObject.getBoolean("success")) {
            return parseObject
                .getJSONObject("games")
                .getJSONObject("SKYWARS")
                .getJSONObject("modes")
                .toJavaObject(SkyWars::class.java)
        } else {
            return SkyWars(0, 0, 0, 0)
        }
    }

}
