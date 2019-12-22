// common
val kotlinVer = "1.3.61"
val javaVer = JavaVersion.VERSION_1_8

// android SDK
val minSdkVersion = 21
val targetSdkVersion = 29
val compileSdkVersion = targetSdkVersion
val buildToolsVersion = "29.0.2"

// androidX
val androidxVersion = "1.1.0"
val lifecycleVersion = "2.1.0"
val constraintLayoutVersion = "1.1.3"
val androidMaterialVersion = "1.0.0"
val androidxPrefsVersion = "1.1.0"
val viewPager2Version = "1.0.0-beta05"
val securityVersion = "1.0.0-alpha02"

// RX
val rxJavaVersion = "2.2.15"
val rxAndroidVersion = "2.1.1"
val rxKotlinVersion = "2.4.0"
val rxRelayVersion = "2.1.1"
val rxBindingVersion = "2.2.0"

// google services
val servicesVersion = "4.3.0"
val firebaseVersion = "17.0.1"
val perfPluginVersion = "1.3.1"
val perfMonitorVersion = "18.0.1"

// analytics
val fabricPluginVersion = "1.31.2"
val appDistributionVersion = "1.1.0"
val crashlyticsVersion = "2.10.1"
val leakCanaryVersion = "2.0"

// room
val roomVersion = "2.2.0"

// network
val retrofitVersion = "2.6.2"
val okHttpVersion = "4.2.1"

// cicerone
val ciceroneVersion = "5.0.0"

// tests
val jUnitVersion = "4.12"
val testRunnerVersion = "1.2.0"
val espressoVersion = "3.2.0"

// dagger
val daggerVersion = "2.25.2"

// gson
val gsonVersion = "2.8.5"

// timber
val timberVersion = "4.7.1"

// Glide
val glideVersion = "4.10.0"

// datetime
val threetenabpVersion = "1.2.1"

// bouncycastle
val bouncycastleVersion = "1.64"

// ZXIng(Zebra crossing)
val zxingCoreVersion = "3.4.0"

//Ted Permissions
val tedPermissionVersion = "2.2.2"

// NFC
val scubaVersion = "0.0.18"
val scubaDroidVersion = "0.0.20"
val jmrtdVersion = "0.7.17"

//Input mask
val inputMaskVersion = "5.0.0"

extra.apply {
    set("kotlinVer", kotlinVer)
    set("javaVer", javaVer)
    set("kotlin-stdlib", "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVer")
}

extra.apply {
    set("minSdkVersion", minSdkVersion)
    set("targetSdkVersion", targetSdkVersion)
    set("compileSdkVersion", compileSdkVersion)
    set("buildToolsVersion", buildToolsVersion)
}

extra.apply {
    set("baseAndroidDependencies", listOf(
        "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion",
        "androidx.appcompat:appcompat:$androidxVersion",
        "androidx.core:core-ktx:$androidxVersion",
        "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion",
        "com.google.android.material:material:$androidMaterialVersion"
    ))
    set("androidxAppcompat", "androidx.appcompat:appcompat:$androidxVersion")
    set("androidxCore", "androidx.core:core-ktx:$androidxVersion")
    set("androidxLifecycle", "androidx.lifecycle:lifecycle-extensions:$lifecycleVersion")
    set("androidMaterial", "com.google.android.material:material:$androidMaterialVersion")
    set("androidxPreferences", "androidx.preference:preference:$androidxPrefsVersion")
    set("viewPager2", "androidx.viewpager2:viewpager2:$viewPager2Version")
    set("androidxSecurity", "androidx.security:security-crypto:$securityVersion")
}

extra.apply {
    set("baseRxDependencies", listOf(
        "io.reactivex.rxjava2:rxjava:$rxJavaVersion",
        "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion",
        "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion",
        "com.jakewharton.rxrelay2:rxrelay:$rxRelayVersion",
        "com.jakewharton.rxbinding2:rxbinding-kotlin:$rxBindingVersion"
    ))
    set("rxJava", "io.reactivex.rxjava2:rxjava:$rxJavaVersion")
    set("rxAndroid", "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion")
    set("rxKotlin", "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion")
    set("rxRelay", "com.jakewharton.rxrelay2:rxrelay:$rxRelayVersion")
    set("rxBinding", "com.jakewharton.rxbinding2:rxbinding-kotlin:$rxBindingVersion")
}

extra.apply {
    set("googleServices", "com.google.gms:google-services:$servicesVersion")
    set("perf-plugin", "com.google.firebase:perf-plugin:$perfPluginVersion")
    set("firebaseCore", "com.google.firebase:firebase-core:$firebaseVersion")
    set("firebaseAnalytics", "com.google.firebase:firebase-analytics:$firebaseVersion")
    set("firebasePerf", "com.google.firebase:firebase-perf:$perfMonitorVersion")
}

extra.apply {
    set(
        "appDistribution",
        "com.google.firebase:firebase-appdistribution-gradle:$appDistributionVersion"
    )
    set("fabricPlugin", "io.fabric.tools:gradle:$fabricPluginVersion")
    set("crashlytics", "com.crashlytics.sdk.android:crashlytics:$crashlyticsVersion")
    set("leakCanary", "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion")
    set(
        "objectWatcher",
        "com.squareup.leakcanary:leakcanary-object-watcher-android:$leakCanaryVersion"
    )
}

extra.apply {
    set("room", "androidx.room:room-runtime:$roomVersion")
    set("roomCompiler", "androidx.room:room-compiler:$roomVersion")
    set("roomRxJava", "androidx.room:room-rxjava2:$roomVersion")
}

extra.apply {
    set("baseNetworkDependencies", listOf(
        "com.squareup.retrofit2:retrofit:$retrofitVersion",
        "com.squareup.retrofit2:converter-scalars:$retrofitVersion",
        "com.squareup.retrofit2:converter-gson:$retrofitVersion",
        "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion",
        "com.squareup.okhttp3:logging-interceptor:$okHttpVersion",
        "com.squareup.okhttp3:okhttp-urlconnection:$okHttpVersion"
    ))
    set("retrofit", "com.squareup.retrofit2:retrofit:$retrofitVersion")
    set("retrofitConverterScalars", "com.squareup.retrofit2:converter-scalars:$retrofitVersion")
    set("retrofitConverterGson", "com.squareup.retrofit2:converter-gson:$retrofitVersion")
    set("retrofitRxJava", "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion")
    set("okHttpLogging", "com.squareup.okhttp3:logging-interceptor:$okHttpVersion")
    set("okHttp", "com.squareup.okhttp3:okhttp-urlconnection:$okHttpVersion")
}

extra.apply {
    set("cicerone", "ru.terrakok.cicerone:cicerone:$ciceroneVersion")
}

extra.apply {
    set("jUnit", "junit:junit:$jUnitVersion")
    set("testRunner", "androidx.test:runner:$testRunnerVersion")
    set("espressoCore", "androidx.test.espresso:espresso-core:$espressoVersion")
}

extra.apply {
    set("dagger", "com.google.dagger:dagger:$daggerVersion")
    set("daggerCompiler", "com.google.dagger:dagger-compiler:$daggerVersion")
    set("daggerAnnotations", "javax.annotation:jsr250-api:1.0")
}

extra.apply {
    set("gson", "com.google.code.gson:gson:$gsonVersion")
}

extra.apply {
    set("timber", "com.jakewharton.timber:timber:$timberVersion")
    set("threetenabp", "com.jakewharton.threetenabp:threetenabp:$threetenabpVersion")
}

extra.apply {
    set("glide", "com.github.bumptech.glide:glide:$glideVersion")
}

extra.apply {
    set("bouncycastle", "org.bouncycastle:bcprov-jdk15on:$bouncycastleVersion")
}

extra.apply {
    set("zxing", "com.journeyapps:zxing-android-embedded:$zxingCoreVersion")
}

extra.apply {
    set("ted", "gun0912.ted:tedpermission-rx2:$tedPermissionVersion")
}

extra.apply {
    set("inputMask", "com.redmadrobot:input-mask-android:$inputMaskVersion")
}

extra.apply {
    set("scuba", "net.sf.scuba:scuba-smartcards:$scubaVersion")
    set("scubaDroid", "net.sf.scuba:scuba-sc-android:$scubaDroidVersion")
    set("jmrtd", "org.jmrtd:jmrtd:$jmrtdVersion")
}