package com.cacagdas.androidmvvm.di

import com.cacagdas.androidmvvm.model.CountriesService
import com.cacagdas.androidmvvm.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}