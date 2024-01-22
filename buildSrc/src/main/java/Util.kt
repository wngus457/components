object Util {
    const val zxing = "com.journeyapps:zxing-android-embedded:4.3.0"
    const val zxingCore = "com.google.zxing:core:3.4.0"

    object Jetpack {
        const val coreKtx = "androidx.core:core-ktx:1.8.0"
        const val activityCompose = "androidx.activity:activity-compose:1.5.0"
        const val activityKtx = "androidx.activity:activity-ktx:1.5.0"
        const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
        const val appcompat = "androidx.appcompat:appcompat:1.6.1"
    }

    object LifeCycle {
        private const val lifeCycleVersion = "2.5.0"
        const val lifeCycle = "androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycleVersion"
        const val lifeCycleService = "androidx.lifecycle:lifecycle-service:$lifeCycleVersion"
    }
}