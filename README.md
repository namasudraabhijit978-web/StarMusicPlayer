# 🌟 STAR Music Player

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)
![C++](https://img.shields.io/badge/C++-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Material Design 3](https://img.shields.io/badge/Material_Design_3-757575?style=for-the-badge&logo=material-design&logoColor=white)

A Next-Generation Offline Music Player for Android that combines the beauty of **Material Design 3** with the raw power of a **Custom C++ DSP Audio Engine**. Built for audiophiles who demand zero-latency processing and fluid 60FPS UI.

## ✨ Key Features

*   **🎨 True Material Design 3:** Dynamic color theming that extracts accents directly from Album Art.
*   **🎛️ Custom C++ Audio Engine:** Powered by Google Oboe and custom Biquad Filters for extreme low-latency processing.
*   **🎚️ 10-Band Professional EQ:** In-built equalizer, Bass Boost, and 3D Virtualizer without relying on the system default.
*   **⚡ Lightning Fast Local Scanning:** Instantly scans and organizes your `.mp3`, `.flac`, and `.wav` local library.
*   **🛡️ 100% Offline & Private:** No trackers, no ads, no cloud sync. Your music, your device.

## 🏗️ Architecture (Hybrid-Modular)

Star Music Player is built using a "Two-Brain" architecture to ensure UI threads never block audio processing:
1.  **Frontend (Kotlin / Jetpack Compose):** Handles the UI, Room Database, and MediaStore API.
2.  **Backend (Native C++):** Handles Digital Signal Processing (DSP), Limiting, and Audio Output via JNI Bridge.

## 🚀 Getting Started

### Prerequisites
*   Android Studio (or CLI tools like Termux/Acode)
*   Android NDK & CMake installed
*   Kotlin 1.9+ & Gradle 8.2+

### Build Instructions
1. Clone the repository:
```bash
   git clone [https://github.com/YourUsername/Star-Music-Player.git](https://github.com/YourUsername/Star-Music-Player.git)
