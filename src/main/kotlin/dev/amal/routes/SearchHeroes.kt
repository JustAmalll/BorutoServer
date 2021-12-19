package dev.amal.routes

import dev.amal.repository.HeroRepositoryAlternative
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepositoryAlternative: HeroRepositoryAlternative by inject()

    get("/boruto/heroes/search") {
        val name = call.request.queryParameters["name"]
        val apiResponse = heroRepositoryAlternative.searchHeroes(name = name)
        call.respond(message = apiResponse, status = HttpStatusCode.OK)
    }
}