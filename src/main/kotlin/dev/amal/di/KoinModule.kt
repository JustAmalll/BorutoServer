package dev.amal.di

import dev.amal.repository.HeroRepository
import dev.amal.repository.HeroRepositoryAlternative
import dev.amal.repository.HeroRepositoryImpl
import dev.amal.repository.HeroRepositoryImplAlternative
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
    single<HeroRepositoryAlternative> {
        HeroRepositoryImplAlternative()
    }
}