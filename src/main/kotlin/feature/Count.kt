package io.random.feature

import com.alibaba.fastjson.JSON
import io.random.Config
import io.random.util.Browser

object Count {

    private const val BASE_URL = "https://api.hypixel.net/counts?key="

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

    suspend fun uhc(): UHC {
        val json = Browser.get("$BASE_URL${Config.hyp_apiKey}")
        val parseObject = JSON.parseObject(json)
        if (parseObject.getBoolean("success")) {
            return parseObject
                .getJSONObject("games")
                .getJSONObject("UHC")
                .getJSONObject("modes")
                .toJavaObject(UHC::class.java)
        } else {
            return UHC(0, 0, 0)
        }
    }

    suspend fun total(): Total {
        val json = Browser.get("$BASE_URL${Config.hyp_apiKey}")
        val parseObject = JSON.parseObject(json)
        if (parseObject.getBoolean("success")) {
            return parseObject
                .getJSONObject("playerCount")
                .toJavaObject(Total::class.java)
        } else {
            return Total(0)
        }
    }

}
