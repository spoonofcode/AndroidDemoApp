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
include(":core:navigation")
include(":feature:login")
include(":feature:home")
include(":feature:profile")
include(":feature:search")
include(":core:ui")
