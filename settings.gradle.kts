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

rootProject.name = "My Application"
include(":app")
include(":app01")
include(":myapp02")
include(":myapp03")
include(":myapp04")
include(":myapp05")
include(":myapp06")
include(":myapp07")
include(":myapp08")
include(":myapp09")
include(":myapp10_db")
