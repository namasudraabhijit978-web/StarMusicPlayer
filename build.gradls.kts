// Top-level build file
plugins {
    // Android aur Kotlin ke latest plugins
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
    
    // KSP (Kotlin Symbol Processing) - Room Database ko fast compile karne ke liye
    id("com.google.devtools.ksp") version "1.9.20-1.0.14" apply false
}
