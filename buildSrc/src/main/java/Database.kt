object Database {
    private object Version {
        const val roomVersion = "2.5.2"
        const val preferencesVersion = "1.0.0"
    }

    const val roomRuntime = "androidx.room:room-runtime:${Version.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Version.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomVersion}"

    const val datastorePreferences = "androidx.datastore:datastore-preferences:${Version.preferencesVersion}"
}