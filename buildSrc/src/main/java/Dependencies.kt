object Dependencies {
    val androidCore by lazy { "androidx.core:core-ktx:${Versions.versionAndroidCore}" }
    val androidAppCompat by lazy { "androidx.appcompat:appcompat:${Versions.versionAndroidAppCompat}" }
    val androidMaterial by lazy { "com.google.android.material:material:${Versions.versionAndroidMaterial}" }
    val androidConstraitLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.versionAndroidConstraintLayout}" }
    val androidJUnit by lazy { "junit:junit:${Versions.versionAndroidJUnit}" }
    val androidExtUnit by lazy { "androidx.test.ext:junit:${Versions.versionAndroidExtUnit}" }
    val androidEspresso by lazy { "androidx.test.espresso:espresso-core:${Versions.versionAndroidEspresso}" }

    // Retrofit
    val androidCoroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.versionAndroidCoroutines}" }
    val androidCoroutinesKotlinx by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.versionAndroidCoroutines}" }
    val androidCoroutinesKotlinxCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.versionAndroidCoroutines}" }

    // Retrofit
    val androidRetrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.versionAndroidRetrofit}" }
    val androidGson by lazy { "com.squareup.retrofit2:converter-gson:${Versions.versionAndroidRetrofit}" }
    val androidInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.versionAndroidInterceptor}" }

    // Room
    val androidRoomRuntime by lazy { "androidx.room:room-runtime:${Versions.versionAndroidRoom}" }
    val androidRoomCompiler by lazy { "androidx.room:room-compiler:${Versions.versionAndroidRoom}" }
    val androidRoomRx by lazy { "androidx.room:room-rxjava2:${Versions.versionAndroidRoom}" }
    val androidRoomKtx by lazy { "androidx.room:room-ktx:${Versions.versionAndroidRoom}" }

    // Lifecyce
    val androidLifeCycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.versionAndroidLifeCycle}" }
    val androidLifeCycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.versionAndroidLifeCycle}" }
    val androidLifeCycleLivedata by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.versionAndroidLifeCycle}" }
    val androidLifeCycleExtensions by lazy { "androidx.lifecycle:lifecycle-extensions:${Versions.versionAndroidLifecycleExtension}" }
    val androidLifeCycleCommon by lazy { "androidx.lifecycle:lifecycle-common:${Versions.versionAndroidLifeCycle}" }

    // Logging
    val androidHttp3Loggin by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.versionAndroidHttp3Logging}" }

    // Hilt
    val androidHiltCore by lazy { "com.google.dagger:hilt-android:${Versions.androidHilt}" }
    val androidHiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.androidHilt}" }

}