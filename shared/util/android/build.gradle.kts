plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.ksp)
    id(Plugins.kotlinParcelize)
    kotlin(Plugins.serialization) version Kotlin.version
}

android {
    namespace = AppConfig.NameSpace.utilAndroid
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {

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
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
}

kotlin {
    sourceSets {
        debug {
            kotlin.srcDir("build/generated/ksp/debug/kotlin")
        }
        release {
            kotlin.srcDir("build/generated/ksp/release/kotlin")
        }
    }
}
dependencies {
    implementation(project(Modules.coreMvi))
    implementation(project(Modules.uiCommon))
    implementation(project(Modules.utilKotlin))

    implementation(Java.javaxInject)

    implementation(platform(Compose.bom))
    implementation(Compose.ui)
    implementation(Compose.tooling)
    implementation(Compose.toolingPreview)
    implementation(Compose.material)
    implementation(Compose.material3)
    implementation(Compose.icon)
    implementation(Compose.runtime)

    implementation(Compose.coilCore)
    implementation(Compose.coilCompose)

    implementation(Compose.navigationAnimation)

    implementation(DaggerHilt.hiltAndroid)
    ksp(DaggerHilt.hiltAndroidCompiler)
    implementation(Compose.hiltNavigation)

    implementation(Util.Jetpack.coreKtx)
    implementation(Util.Jetpack.activityCompose)
    implementation(Util.Jetpack.activityKtx)
    implementation(Util.Jetpack.recyclerview)
    implementation(Util.Jetpack.appcompat)

    implementation(Util.zxing)
    implementation(Util.zxingCore)

    implementation(Kotlin.serialization)
}