import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidKoinConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
//            pluginManager.apply {
//                apply("androiddemoapp.android.library")
//            }
//            extensions.configure<LibraryExtension> {
//                defaultConfig {
//                    testInstrumentationRunner =
//                        "androidx.test.runner.AndroidJUnitRunner"
//                }
//                configureGradleManagedDevices(this)
//            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                // Koin for Android
                add("implementation", libs.findLibrary("koin.androidx.compose").get())
            }
        }
    }
}
