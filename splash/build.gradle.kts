import es.apruebalo.gradle.dependencies.Dependencies

plugins {
    kotlin("kapt")
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("shared-properties")
}

android {
    namespace = "es.apruebalo.splash"
}

dependencies {

    implementation(project(":features:common-ui"))
    implementation(project(":features:navigator-utils"))

    implementation(Dependencies.Core.daggerHilt)
    kapt(Dependencies.Core.daggerHiltAndroidCompiler)

    // Tests
    testImplementation(Dependencies.Tests.junit)
    androidTestImplementation(Dependencies.Tests.junit)
    androidTestImplementation(Dependencies.Tests.junitExtension)
    androidTestImplementation(Dependencies.Tests.espresso)
}