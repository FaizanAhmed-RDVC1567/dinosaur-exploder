// Diagnostic to see if the `mainClass` attribute is visible when Gradle runs any task
println(">>> DIAG: project.findProperty('gluonfx.mainClass') = ${project.findProperty("gluonfx.mainClass")}")

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.gluonfx) // Enabling the plugin here too. CHECK IF IT WORKS
}

/*Some code to prevent Kotlin DSL strict type checking when Gradle attempts to confirm the value
* of GluonFX's dynamic DSL property called `mainClass`. Gradle simply cannot process this value
* at compile time, so this code is an attempt at a workaround to prevent Gradle frequently
* choking itself on this plugin's DSL value.
*
* This current approach usestwo things:
* 1) Creating an unambiguous JVM entry point (Bootstrap) with a standard main method that GluonFX
* will use.
*
* 2) the `extraProperties` accessor, so that Kotlin DSL won't choke on the
* value, but will still expose this property to the GluonFX plugin at runtime, as it will avoid
* Kotlin DSL's compile-time checks when Gradle is executed.
*
* Something else that is recommended, is to fall back to Gradle version 8.6 instead of 9.0+,
* as those versions reportedly have better compatibility with GluonFX version 1.0.29*/
//project.extensions.extraProperties["gluonfx.mainClass"] = "com.jvondermarck.dinosaurexploder.Bootstrap"

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
    // `mainClass` is required, the GluonFX plugin's DSL is dynamic and Gradle will pick it up at
    // runtime ==> yes, but it should not be declared here in later versions of GluonFX
    // mainClass = "com.jvondermarck.dinosaurexploder.MainActivity"
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