plugins {
    id("androiddemoapp.android.library")
//    id("androiddemoapp.android.library.jacoco")
//    id("nowinandroid.android.hilt")
}

android {
    namespace = "com.spoonofcode.core.common"
}

dependencies {
    implementation(libs.koin.android)
    implementation(libs.kotlinx.coroutines.android)
//    testImplementation(project(":core:testing"))
}