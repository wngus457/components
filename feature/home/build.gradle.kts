plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.ksp)
    id(Plugins.kotlinParcelize)
}

android {
    namespace = AppConfig.NameSpace.home
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
    implementation(project(Modules.utilAndroid))
    implementation(project(Modules.uiSystem))


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

    implementation(Compose.accompanistPermission)
    
    implementation(Compose.navigationAnimation)

    implementation(DaggerHilt.hiltAndroid)
    ksp(DaggerHilt.hiltAndroidCompiler)
    implementation(Compose.hiltNavigation)

    implementation(Kotlin.serialization)
}