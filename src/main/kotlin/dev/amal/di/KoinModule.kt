package dev.amal.di

import dev.amal.repository.HeroRepository
import dev.amal.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}