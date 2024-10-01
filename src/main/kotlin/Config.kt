package io.random

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.value

object Config : AutoSavePluginConfig("config") {
    val hyp_apiKey: String by value()
    val as_apiKey: String by value()
    val friends: MutableList<Long> by value()
}