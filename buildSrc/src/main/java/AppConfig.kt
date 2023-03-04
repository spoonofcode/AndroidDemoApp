import org.gradle.api.JavaVersion

//app level config constants
object AppConfig {
    const val namespace = "com.spoonofcode"
    const val applicationId = "com.spoonofcode"
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val buildToolsVersion = "29.0.3"

    const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    const val proguardConsumerRules =  "consumer-rules.pro"
    const val dimension = "environment"
}