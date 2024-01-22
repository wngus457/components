object Kotlin {
    const val version = "1.9.0"

    private const val coroutineVersion = "1.6.3"
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
    const val coroutineCoreJvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:$coroutineVersion"

    private const val serializationVersion = "1.6.1"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"

    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
}