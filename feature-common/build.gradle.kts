plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = General.nameSpace
    compileSdk = General.compileSDK.toInt()

    defaultConfig {
        minSdk = General.minSDK.toInt()

        testInstrumentationRunner = General.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
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

    implementation(Dependencies.androidCore)
    implementation(Dependencies.androidAppCompat)
    implementation(Dependencies.androidMaterial)
    testImplementation(Dependencies.androidJUnit)
    androidTestImplementation(Dependencies.androidExtUnit)
    androidTestImplementation(Dependencies.androidEspresso)

    // Room
    kapt(Dependencies.androidRoomCompiler)
    implementation(Dependencies.androidRoomRuntime)
    implementation(Dependencies.androidRoomKtx)
    implementation(Dependencies.androidRoomRx)

    // Retrofit
    implementation(Dependencies.androidRetrofit)
    implementation(Dependencies.androidGson)
    implementation(Dependencies.androidInterceptor)
    implementation(Dependencies.androidCoroutinesKotlinx)
    implementation(Dependencies.androidCoroutinesKotlinxCore)
}