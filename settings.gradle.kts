pluginManagement {
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

rootProject.name = "Components"
include(":app")
include(":shared:core-mvi")
include(":shared:ui:common")
include(":shared:ui:system")
include(":shared:util:kotlin")
include(":shared:util:android")
include(":feature:home")
