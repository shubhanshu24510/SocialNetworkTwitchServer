package com.plcoding.di

import com.plcoding.repository.user.FakeUserRepository
import org.koin.dsl.module

internal val testModule = module {
    single { FakeUserRepository() }
}