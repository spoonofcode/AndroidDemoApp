package com.spoonofcode.androiddemoapp.data.repository

import com.spoonofcode.androiddemoapp.model.User

interface UsersRepository {

    fun getUser(id: String): User
}