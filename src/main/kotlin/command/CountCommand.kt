package io.random.command

import io.random.Furrtism
import io.random.feature.Count
import net.mamoe.mirai.console.command.CompositeCommand
import net.mamoe.mirai.console.command.UserCommandSender

object CountCommand : CompositeCommand(
    Furrtism,
"count"
) {

    @SubCommand("mw")
    suspend fun UserCommandSender.mw() {
        subject.sendMessage(Count.mw().getMessage())
    }

    @SubCommand("sw")
    suspend fun UserCommandSender.sw() {
        subject.sendMessage(Count.sw().getMessage())
    }

    @SubCommand("uhc")
    suspend fun UserCommandSender.uhc() {
        subject.sendMessage(Count.uhc().getMessage())
    }

    @SubCommand("total")
    suspend fun UserCommandSender.total() {
        subject.sendMessage(Count.total().getMessage())
    }

}