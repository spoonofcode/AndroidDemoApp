plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.library.compose")
}

android {
    namespace = "com.spoonofcode.androiddemoapp.feature.home"
}

dependencies {
    implementation(project(":core:ui"))
}