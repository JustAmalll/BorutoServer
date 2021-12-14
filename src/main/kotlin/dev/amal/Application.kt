package dev.amal

import io.ktor.application.*
import dev.amal.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
}
