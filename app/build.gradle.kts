plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android") // Added Hilt
}

android {
    namespace = "com.starmusic.app"
    compileSdk = 34
    ndkVersion = "26.3.11579264" // NDK Locked

    defaultConfig {
        applicationId = "com.starmusic.app"
        minSdk = 26 // Target modern phones (Android 8+)
        targetSdk = 34
        versionCode = 1
        versionName = "1.0-alpha"

        // APK Size Optimization
        ndk { abiFilters += listOf("arm64-v8a") }

        externalNativeBuild {
            cmake { cppFlags += "-std=c++20" }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true // ProGuard/R8
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        compose = true
        viewBinding = true
        prefab = true
    }

    // Modern Java 17
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }

    ksp { arg("room.schemaLocation", "$projectDir/schemas") }
}

dependencies {
    // BOM ke latest versions (2024/25 standards)
    val composeBom = platform("androidx.compose:compose-bom:2024.05.00")
    implementation(composeBom)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    
    // Lifecycle & Media3 Updated
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")
    implementation("androidx.media3:media3-exoplayer:1.3.1")
    implementation("androidx.media3:media3-session:1.3.1")
    
    // Room & Hilt
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")
    implementation("com.google.dagger:hilt-android:2.51.1")
    ksp("com.google.dagger:hilt-compiler:2.51.1")
    
    implementation("com.google.oboe:oboe:1.8.0")
}
