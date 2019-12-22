package com.example.tangonoches.di

import com.example.tangonoches.presentation.main.MainVm
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [NetworkModule::class]
)
@Singleton
interface MainComponent {
    fun inject(mainVm: MainVm)
}