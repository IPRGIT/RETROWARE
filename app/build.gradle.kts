plugins {

        id("com.android.application")
        id("org.jetbrains.kotlin.android")
        id("androidx.navigation.safeargs.kotlin")

}

android {
    namespace = "com.marisma.retroware"
    compileSdk = 35

    viewBinding {
        enable=true
    }

    defaultConfig {
        applicationId = "com.marisma.retroware"
        minSdk = 21
        targetSdk = 34
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
    buildFeatures {
        viewBinding = true
    }

dependencies {


    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(kotlin("script-runtime"))


//Cards dependencies
    implementation("androidx.cardview:cardview:1.0.0")

//glide - transforma urls en imagenes
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("androidx.preference:preference:1.2.1")
// Glide v4 uses this new annotation processor -- see https://bumptech.github.io/glide/doc/generatedapi.html
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")

//NavComponent
    /**val navVersion = "2.7.7"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")*/


    val nav_version = "2.8.5"
// Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
//implementation(libs.androidx.navigation.fragment.ktx)
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
//implementation(libs.androidx.navigation.ui.ktx)
// Testing Navigation
    implementation("androidx.navigation:navigation-testing:$nav_version")
//implementation(libs.androidx.navigation.testing)


//picasso transforma url en imagen
    implementation("com.squareup.picasso:picasso:2.8")

//retrofit2 turns your HTTP API into a Java interface
    val retrofit2Version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit2Version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit2Version")

//coroutines - Library support for Kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC2")

    implementation("androidx.annotation:annotation:1.9.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")

    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")


}

}
dependencies {
    implementation("androidx.media3:media3-datasource:1.5.1")
}



























