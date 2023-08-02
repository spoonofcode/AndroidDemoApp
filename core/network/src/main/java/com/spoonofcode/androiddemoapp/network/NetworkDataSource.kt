package com.spoonofcode.androiddemoapp.network

import com.spoonofcode.androiddemoapp.network.model.NetworkUser

interface NetworkDataSource {
    suspend fun getUsers(ids: List<String>? = null): List<NetworkUser>
}