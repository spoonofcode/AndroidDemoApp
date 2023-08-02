import com.android.build.gradle.LibraryExtension
import com.spoonofcode.androiddemoapp.configureGradleManagedDevices
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("androiddemoapp.android.library")
                apply("androiddemoapp.android.koin")
            }
            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner =
                        "androidx.test.runner.AndroidJUnitRunner"
                }
                configureGradleManagedDevices(this)
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                add("implementation", project(":core:data"))
                add("implementation", project(":core:model"))
                add("implementation", project(":core:navigation"))
                add("implementation", project(":core:network"))
                add("implementation", project(":core:ui"))

//                add("testImplementation", kotlin("test"))
//                add("testImplementation", project(":core:testing"))
//                add("androidTestImplementation", kotlin("test"))
//                add("androidTestImplementation", project(":core:testing"))

                add("implementation", libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.viewModelCompose").get())
            }
        }
    }
}
