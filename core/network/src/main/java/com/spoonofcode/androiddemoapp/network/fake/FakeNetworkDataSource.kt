package com.spoonofcode.androiddemoapp.network.fake

import com.spoonofcode.androiddemoapp.network.NetworkDataSource
import com.spoonofcode.androiddemoapp.network.model.NetworkUser

class FakeNetworkDataSource() : NetworkDataSource {

    companion object {
        private const val USERS_ASSET = "users.json"
    }

    override fun getUser(id: String): NetworkUser {
        return NetworkUser("1", "BartekTest", "LuczakTest")
    }
}