package dev.amal.di

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}