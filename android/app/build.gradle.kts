plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.gluonfx) // Enabling the plugin here too. CHECK IF IT WORKS
}

android {
    namespace = "com.jvondermarck.dinosaurexploder"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.jvondermarck.dinosaurexploder"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

// GluonFX settings for the application
gluonfx {
    target = "android" // If working on iOS, this value will be set to that
    // `mainClass` or `mainClassName` is not required in newer GluonFX versions
    attachConfig {
        version = "4.0.25"  // This identifier & value is required in newer versions
        configuration = "implementation"
        services("lifecycle", "display", "statusbar", "storage")
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    // Adding the line for FXGL
    implementation(libs.fxgl)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}