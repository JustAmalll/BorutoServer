package dev.amal.di

import dev.amal.repository.HeroRepositoryAlternative
import dev.amal.repository.HeroRepositoryImplAlternative
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepositoryAlternative> {
        HeroRepositoryImplAlternative()
    }
}