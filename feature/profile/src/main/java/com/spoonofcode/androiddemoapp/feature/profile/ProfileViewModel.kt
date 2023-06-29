package com.spoonofcode.androiddemoapp.feature.profile

import androidx.lifecycle.ViewModel
import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

class ProfileViewModel(
    private val userRepository: UsersRepository,
) : ViewModel() {

    private val _stateFlow = MutableStateFlow(
            userRepository.getUser("2").map {
                ProfileViewState(user =it)
            }
    )
//    private val _stateFlow = MutableStateFlow(User("11", "Bartek", "Tokarski"))
    val stateFlow = _stateFlow.asStateFlow()

//    fun triggerStateFlow() {
//        _stateFlow.value = "State flow ${counter++}"
//    }

}