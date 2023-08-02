package com.spoonofcode.androiddemoapp.feature.profile

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

class ProfileViewModel(
    private val profileUseCase: ProfileUseCase,
) : ViewModel() {

    private val _stateFlow = MutableStateFlow(
        profileUseCase.getProfile("2").map {
            ProfileViewState(user = it)
        }
    )

    val stateFlow = _stateFlow.asStateFlow()
}