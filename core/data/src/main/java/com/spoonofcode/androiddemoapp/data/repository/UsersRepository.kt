package com.spoonofcode.androiddemoapp.data.repository

import com.spoonofcode.androiddemoapp.model.User
import kotlinx.coroutines.flow.Flow

interface UsersRepository {
    fun getUsers(): Flow<List<User>>
    fun getUser(id: String): Flow<User>
}