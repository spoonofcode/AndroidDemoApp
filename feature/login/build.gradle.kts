plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.library.compose")
}

android {
    namespace = "com.spoonofcode.androiddemoapp.feature.login"
}

dependencies {
    implementation(project(":core:ui"))
}