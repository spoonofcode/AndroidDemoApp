//version constants for the Kotlin DSL dependencies
object Versions {
    //app level
    const val gradle = "7.2.2"
    const val kotlin = "1.7.20"
    const val jvmTarget = "1.8"
    const val kotlinCompilerExtensionVersion = "1.3.2"

    //libs
    object Androidx {
        const val coreKtx = "1.7.0"
        const val lifecycleRuntime = "2.3.1"
        const val activity = "1.3.1"
        const val compose = "1.1.1"
        const val material3 = "1.0.0-alpha02"
        const val constraintLayout = "2.0.0-beta8"
        const val appcompat = "1.3.0-alpha01"

        object Test {
            const val extJUnit = "1.1.3"
            const val espresso = "3.4.0"
        }
    }

    // tests
    object Test {
        const val jUnit = "4.13.2"
    }
}