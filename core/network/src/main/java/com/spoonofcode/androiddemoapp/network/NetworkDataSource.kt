package com.spoonofcode.androiddemoapp.network

import com.spoonofcode.androiddemoapp.network.model.NetworkUser

interface NetworkDataSource {
    fun getUser(id: String): NetworkUser
}