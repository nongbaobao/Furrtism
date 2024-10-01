package io.random.command

import io.random.Furrtism
import net.mamoe.mirai.console.command.CompositeCommand
import net.mamoe.mirai.console.command.UserCommandSender

object CountCommand : CompositeCommand(
    Furrtism,
"count"
) {

    @SubCommand("mw")
    suspend fun UserCommandSender.mw() {

    }


}