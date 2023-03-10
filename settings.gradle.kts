pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Binlist"
include(":app")
include(":Presentation")
include(":data")
include(":domain")
include(":NetworkDataSource")
include(":LocalDataSource")
include(":Repository")
