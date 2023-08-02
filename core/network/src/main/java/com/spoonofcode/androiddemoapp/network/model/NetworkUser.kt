package com.spoonofcode.androiddemoapp.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkUser(
    val id: String,
    val firstName: String,
    val lastName: String,
)