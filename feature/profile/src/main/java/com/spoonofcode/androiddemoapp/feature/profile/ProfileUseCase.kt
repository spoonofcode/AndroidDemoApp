package com.spoonofcode.androiddemoapp.feature.profile

import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.model.User
import kotlinx.coroutines.flow.Flow

class ProfileUseCase(
    private val userRepository: UsersRepository,
) {

    fun getProfile(userId: String): Flow<User> = userRepository.getUser(userId)
}