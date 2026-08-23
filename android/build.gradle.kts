// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // Attempting to apply gluonfx plugin here
    alias(libs.plugins.gluonfx) apply false
}