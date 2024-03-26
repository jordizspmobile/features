import es.apruebalo.gradle.dependencies.Dependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("shared-properties")
}

android {
    namespace = "es.apruebalo.navigator"
}

dependencies {

    implementation(project(":features:navigator-utils"))
    implementation(project(":features:splash"))
    implementation(project(":features:home"))
}