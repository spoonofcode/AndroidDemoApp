package com.spoonofcode.androiddemoapp.data.repository.fake

import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.model.User
import com.spoonofcode.androiddemoapp.network.fake.FakeNetworkDataSource

class FakeUsersRepository(
    private val dataSource: FakeNetworkDataSource
) : UsersRepository {
    override fun getUser(id: String): User {
        val networkUser = dataSource.getUser(id = id)
        return User(networkUser.id, networkUser.firstName, networkUser.lastName)
    }
}