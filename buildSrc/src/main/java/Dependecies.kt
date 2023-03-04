import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    //std lib
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //android ui
    private val appcompat = "androidx.appcompat:appcompat:${Versions.Androidx.appcompat}"
    private val coreKtx = "androidx.core:core-ktx:${Versions.Androidx.coreKtx}"
    private val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.Androidx.constraintLayout}"
    private val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Androidx.lifecycleRuntime}"
    private val activityCompose =
        "androidx.activity:activity-compose:${Versions.Androidx.activity}"

    // compose
    private val composeUI =
        "androidx.compose.ui:ui:${Versions.Androidx.compose}"
    private val composeUIToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.Androidx.compose}"
    private val composeMaterial3 =
        "androidx.compose.material3:material3:${Versions.Androidx.material3}"
    private val composeUITooling =
        "androidx.compose.ui:ui-tooling:${Versions.Androidx.compose}"
    private val composeUITestManifest =
        "androidx.compose.ui:ui-test-manifest:${Versions.Androidx.compose}"

    //test libs
    private val junit = "junit:junit:${Versions.Test.jUnit}"
    private val extJUnit = "androidx.test.ext:junit:${Versions.Androidx.Test.extJUnit}"
    private val espressoCore = "androidx.test.espresso:espresso-core:${Versions.Androidx.Test.espresso}"
    private val composeUITestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.Androidx.compose}"

    val appLibraries = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(appcompat)
        add(constraintLayout)
        add(lifecycleRuntime)
        add(activityCompose)
        add(composeUI)
        add(composeUIToolingPreview)
        add(composeMaterial3)
        add(composeUITooling)
        add(composeUITestManifest)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
        add(composeUITestJunit)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}