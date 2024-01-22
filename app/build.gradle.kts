plugins {
    id(Plugins.androidApplication)
    id(Plugins.android)
    id(Plugins.hiltAndroid)
    id(Plugins.ksp)
    kotlin(Plugins.serialization) version Kotlin.version
}

android {
    namespace = AppConfig.applicationId
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            enableAndroidTestCoverage = true
            enableUnitTestCoverage = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(Modules.coreMvi))

    implementation(platform(Compose.bom))
    implementation(Compose.ui)
    implementation(Compose.tooling)
    implementation(Compose.toolingPreview)
    implementation(Compose.material)
    implementation(Compose.material3)
    implementation(Compose.icon)

    implementation(Retrofit.okHttp)
    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttpLogginInterceptor)
    implementation(Retrofit.moshiConverter)
    implementation(Retrofit.moshi)

    implementation(Compose.accompanistSystemUi)
    implementation(Compose.accompanistPermission)

    implementation(DaggerHilt.hiltAndroid)
    ksp(DaggerHilt.hiltAndroidCompiler)
    implementation(Compose.hiltNavigation)

    implementation(Database.roomRuntime)
    ksp(Database.roomCompiler)
    implementation(Database.roomKtx)

    implementation(Util.LifeCycle.lifeCycle)
    implementation(Util.LifeCycle.lifeCycleService)

    implementation(Database.datastorePreferences)

    implementation(Kotlin.serialization)
}