package dev.amal.plugins

import dev.amal.routes.getAllHeroes
import dev.amal.routes.getAllHeroesAlternative
import dev.amal.routes.root
import dev.amal.routes.searchHeroes
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        root()
//        getAllHeroes()
        getAllHeroesAlternative()
        searchHeroes()
        static("/images") {
            resources("images")
        }
    }
}
