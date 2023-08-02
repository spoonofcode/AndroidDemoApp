package com.spoonofcode.androiddemoapp.data.repository.fake

import com.spoonofcode.androiddemoapp.data.repository.UsersRepository
import com.spoonofcode.androiddemoapp.model.User
import com.spoonofcode.androiddemoapp.network.fake.FakeNetworkDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map

class FakeUsersRepository(
    private val ioDispatcher: CoroutineDispatcher,
    private val dataSource: FakeNetworkDataSource
) : UsersRepository {
    override fun getUsers(): Flow<List<User>> = flow {
        emit(
            dataSource.getUsers().map {
                User(
                    id = it.id,
                    firstName = it.firstName,
                    lastName = it.lastName,
                )
            },
        )
    }.flowOn(ioDispatcher)

    override fun getUser(id: String): Flow<User> {
        return getUsers().map { it.first { user -> user.id == id } }
    }

}