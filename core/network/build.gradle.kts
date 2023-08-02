plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.koin")
    id("kotlinx-serialization")
}

android {
    namespace = "com.spoonofcode.androiddemoapp.network"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)

//    testImplementation(project(":core:testing"))
}