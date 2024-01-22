buildscript {
    dependencies {
        classpath(DaggerHilt.hiltPlugin)
        classpath(Android.AGP)
        classpath(Kotlin.gradlePlugin)
        classpath(Google.ksp)
        classpath(Kotlin.serialization)
    }
}

plugins {
    id("com.android.application") version "8.2.1" apply false
    id("com.android.library") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.0" apply false
}

allprojects {
    val ktlint by configurations.creating
    dependencies {
        ktlint("com.pinterest:ktlint:0.46.1") {
            attributes {
                attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling.EXTERNAL))
            }
        }
    }

    val outputDir = "${project.buildDir}/reports/ktlint/"
    val inputFiles = project.fileTree(mapOf("dir" to "src", "include" to "main/**/*.kt"))

    val ktlintCheck by tasks.creating(JavaExec::class) {
        inputs.files(inputFiles)
        outputs.dir(outputDir)
        description = "Local Check Code Style"
        classpath = ktlint
        mainClass.set("com.pinterest.ktlint.Main")
        args = listOf(
            "src/main/**/*.kt",
            "**/**/src/main/**/*.kt",
            "**/*.kts",
            "*.kts",
            "**/**/src/**/*.kt",
            "buildSrc/**/*.kt"
        )
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}