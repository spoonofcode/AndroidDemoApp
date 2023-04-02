plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.koin")
}

android {
    namespace = "com.spoonofcode.androiddemoapp.network"
}

dependencies {
//    implementation(project(":core:common"))
    implementation(project(":core:model"))

//    testImplementation(project(":core:testing"))
}