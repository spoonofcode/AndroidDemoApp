package com.spoonofcode.androiddemoapp.feature.profile

import androidx.lifecycle.ViewModel
import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProfileViewModel(
    private val userRepository: UsersRepository,
) : ViewModel() {

    private val _stateFlow = MutableStateFlow(userRepository.getUser("1"))
//    private val _stateFlow = MutableStateFlow(User("11", "Bartek", "Tokarski"))
    val stateFlow = _stateFlow.asStateFlow()

//    fun triggerStateFlow() {
//        _stateFlow.value = "State flow ${counter++}"
//    }

}