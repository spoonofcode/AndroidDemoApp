plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.koin")
}

android {
    namespace = "com.spoonofcode.androiddemoapp.data"
}

dependencies {
    implementation(project(":core:model"))
    implementation(project(":core:network"))
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.kotlinx.coroutines.android)
//    implementation(libs.kotlinx.datetime)
//    implementation(libs.kotlinx.serialization.json)

//    testImplementation(project(":core:datastore-test"))
//    testImplementation(project(":core:testing"))
}