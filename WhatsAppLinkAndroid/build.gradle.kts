plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.whatsapplink.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.whatsapplink.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.5.1")

    //fow
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    //country picker
    implementation ("com.github.appleader707:country-code-picker-compose:Tag")

}