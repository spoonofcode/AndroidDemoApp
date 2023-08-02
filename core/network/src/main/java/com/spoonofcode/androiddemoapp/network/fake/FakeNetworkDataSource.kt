package com.spoonofcode.androiddemoapp.network.fake

import JvmUnitTestFakeAssetManager
import com.spoonofcode.androiddemoapp.network.NetworkDataSource
import com.spoonofcode.androiddemoapp.network.model.NetworkUser
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream

class FakeNetworkDataSource(
    private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json,
    private val assets: FakeAssetManager = JvmUnitTestFakeAssetManager,
) : NetworkDataSource {

    companion object {
        private const val USERS_ASSET = "users.json"
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun getUsers(ids: List<String>?): List<NetworkUser> =
        withContext(ioDispatcher) {
            assets.open(USERS_ASSET).use(networkJson::decodeFromStream)
    }
}