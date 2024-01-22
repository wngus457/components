plugins {
    id(Plugins.javaLibrary)
    id(Plugins.kotlinJvm)
    kotlin(Plugins.serialization) version "1.9.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(Kotlin.coroutineCore)
    implementation(Java.javaxInject)
    implementation(Kotlin.serialization)
}