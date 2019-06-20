package com.cacagdas.androidmvvm.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.cacagdas.androidmvvm.model.Country

class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries() // outside callers do not need to know how this operation is performed.
    }

    private fun fetchCountries() {

        val mockData = listOf(Country("Country A"),
            Country("Country B"),
            Country("Country C")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}