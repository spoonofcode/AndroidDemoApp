pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidDemoApp"
include(":app")

include(":core:data")
include(":core:model")
include(":core:navigation")
include(":core:network")
include(":core:ui")

include(":feature:login")
include(":feature:home")
include(":feature:profile")
include(":feature:search")
