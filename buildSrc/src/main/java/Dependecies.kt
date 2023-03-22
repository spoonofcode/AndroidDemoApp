import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    //std lib
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //android ui
    const val appcompat = "androidx.appcompat:appcompat:${Versions.Androidx.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.Androidx.coreKtx}"
    const val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Androidx.lifecycleRuntime}"
    const val activityCompose =
        "androidx.activity:activity-compose:${Versions.Androidx.activity}"
    const val navigation =
        "androidx.navigation:navigation-compose:${Versions.Androidx.navigation}"

    // compose
    const val composeUI =
        "androidx.compose.ui:ui:${Versions.Androidx.compose}"
    const val composeUIToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.Androidx.compose}"
    const val composeMaterial =
        "androidx.compose.material:material:${Versions.Androidx.compose}"
    const val composeMaterial3 =
        "androidx.compose.material3:material3:${Versions.Androidx.material3}"
    const val composeUITooling =
        "androidx.compose.ui:ui-tooling:${Versions.Androidx.compose}"
    const val composeUITestManifest =
        "androidx.compose.ui:ui-test-manifest:${Versions.Androidx.compose}"

    //test libs
    const val junit = "junit:junit:${Versions.Test.jUnit}"
    const val extJUnit = "androidx.test.ext:junit:${Versions.Androidx.Test.extJUnit}"
    const val espressoCore =
        "androidx.test.espresso:espresso-core:${Versions.Androidx.Test.espresso}"
    const val composeUITestJunit =
        "androidx.compose.ui:ui-test-junit4:${Versions.Androidx.compose}"

    val appLibraries = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(appcompat)
        add(lifecycleRuntime)
        add(activityCompose)
        add(navigation)
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

//fun DependencyHandler.implementation(list: List<String>) {
//    list.forEach { dependency ->
//        add("implementation", dependency)
//    }
//}

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