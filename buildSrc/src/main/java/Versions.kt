//version constants for the Kotlin DSL dependencies
object Versions {
    //app level
    const val gradle = "7.4.0"
    const val kotlin = "1.7.20"
    const val jvmTarget = "1.8"
    const val composeCompiler = "1.3.2"

    //libs
    object Androidx {
        const val coreKtx = "1.9.0"
        const val lifecycleRuntime = "2.5.1"
        const val activity = "1.6.1"
        const val compose = "1.3.1"
        const val material3 = "1.0.1"
        const val appcompat = "1.6.1"
        const val navigation = "2.5.3"

        object Test {
            const val extJUnit = "1.1.5"
            const val espresso = "3.5.1"
        }
    }

    // tests
    object Test {
        const val jUnit = "4.13.2"
    }
}