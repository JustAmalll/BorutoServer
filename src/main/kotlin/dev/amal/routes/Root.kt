package dev.amal.routes

fun Route.root() {
    get("/"){
        call.respond(
            message = "Welcome to Boruto API!",
            status = HttpStatusCode.OK
        )
    }
}