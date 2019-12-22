
plugins{
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("kotlin-kapt")
}

android{
    val ext = rootProject.extra
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")

    defaultConfig {
        minSdkVersion(19)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = ext["javaVer"] as JavaVersion
        targetCompatibility = ext["javaVer"] as JavaVersion
    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
        }
    }
}

dependencies {
    val ext = rootProject.extra
    implementation(fileTree("dir" to "libs", "include" to "*.jar"))

    implementation(ext["kotlin-stdlib"] as String)

    (ext["baseAndroidDependencies"] as List<String>)
        .plus(ext["baseRxDependencies"] as List<String>)
        .plus(ext["baseNetworkDependencies"] as List<String>)
        .forEach {
        implementation(it)
    }

    implementation(ext["dagger"] as String)
    kapt(ext["daggerCompiler"] as String)
    kaptAndroidTest(ext["daggerCompiler"] as String)
    compileOnly(ext["daggerAnnotations"] as String)
    kaptTest(ext["daggerCompiler"] as String)
    testAnnotationProcessor(ext["daggerAnnotations"] as String)

    testImplementation(ext["jUnit"] as String)
    androidTestImplementation(ext["testRunner"] as String)
    androidTestImplementation(ext["espressoCore"] as String)
}
