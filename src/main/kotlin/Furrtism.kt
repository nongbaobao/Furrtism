package io.random

import io.random.command.*
import net.mamoe.mirai.console.command.CommandManager.INSTANCE.register
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info
object Furrtism : KotlinPlugin(
    JvmPluginDescription(
        id = "io.random.furrtism",
        name = "Furrtism",
        version = "0.0.1",
    ) {

author("herry")
    }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }

        Config.reload()
        CountCommand.register()
    }
}