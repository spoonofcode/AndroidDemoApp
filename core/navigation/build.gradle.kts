plugins {
    id("androiddemoapp.android.library")
    id("androiddemoapp.android.library.compose")
}

android {
    namespace = "com.spoonofcode.core.navigation"
}
dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.runtime.livedata)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
}