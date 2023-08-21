plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.foodsapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.foodsapp"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    /// Coordinator Layout
    implementation ("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    /// Material Components
    implementation ("com.google.android.material:material:1.9.0")

    // Navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.0")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.0")

    // Room components
    implementation ("androidx.room:room-runtime:2.2.5")
    implementation ("androidx.room:room-ktx:2.2.5")
    androidTestImplementation ("androidx.room:room-testing:2.2.5")

    // DataStore
    implementation ("androidx.datastore:datastore-preferences:1.0.0-alpha01")

    // Recyclerview
    implementation ("androidx.recyclerview:recyclerview:1.1.0")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.28-alpha")

    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")

    // Image Loading library Coil
    implementation ("io.coil-kt:coil:0.13.0")

    // Gson
    implementation ("com.google.code.gson:gson:2.8.6")

    // Shimmer
    implementation ("com.facebook.shimmer:shimmer:0.5.0")
    implementation ("com.todkars:shimmer-recyclerview:0.4.0")

    // Jsoup
    implementation ("org.jsoup:jsoup:1.13.1")




    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}