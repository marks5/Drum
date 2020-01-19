const val kotlinVersion = "1.3.21"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.3"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"

}

object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
    const val buildTools = "29.0.2"
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.0-beta01"
        const val constraintLayout = "1.1.2"
        const val ktx = "1.1.0-alpha05"
        const val rxJavaVersion = "2.2.7"
        const val rxKotlinVersion = "2.2.0"
        const val rxAndroidVersion = "2.1.1"
        const val koinVersion = "2.1.0-alpha-7"
        const val retrofitVersion = "2.3.0"
        const val gsonVersion = "2.8.5"
        const val roomVersion = "2.2.0-beta01"
        const val okhttpVersion = "4.3.0"

        const val multidex = "2.0.1"
        const val activity = "1.0.0"
        const val fragment = "1.2.0-rc02"
        const val recyclerView = "1.0.0"
        const val lifecycle = "2.1.0"
        const val materialDesign = "1.0.0"

        const val cardViewVersion = "1.0.0"
        const val glideVersion = "4.10.0"
    }

    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val activity = "androidx.activity:activity-ktx:${Versions.activity}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardViewVersion}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"

    const val koin = "org.koin:koin-core:${Versions.koinVersion}"
    const val koinAndroid = "org.koin:koin-android:${Versions.koinVersion}"
    const val koinAndroidScope = "org.koin:koin-androidx-scope:${Versions.koinVersion}"
    const val koinAndroidFragment = "org.koin:koin-androidx-fragment:${Versions.koinVersion}"
    const val koinAndroidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitRxAdapter =
        "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val retrofitGsonConverter =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"

    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomRxJava = "androidx.room:room-rxjava2:${Versions.roomVersion}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.0-alpha4"
        const val espresso = "3.1.0-alpha4"
        const val mockk = "1.9.3.kotlin12"
        const val truth = "1.0"
        const val mockWebServer = "4.2.0"
        const val androidxCoreTesting = "2.1.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val truth = "com.google.truth:truth:${Versions.truth}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
    const val androidxCoreTesting =
        "androidx.arch.core:core-testing:${Versions.androidxCoreTesting}"
}

object AndroidTestLibraries {
    private object Versions {
        const val androidxTestRunner = "1.2.0"
        const val espresso = "3.2.0"
    }

    const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTestRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

object ExoPlayer {
    private object Versions {
        const val exoplayerVersion = "2.11.1"
    }
    const val core = "com.google.android.exoplayer:exoplayer-core:${Versions.exoplayerVersion}"
    const val ui = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoplayerVersion}"
}