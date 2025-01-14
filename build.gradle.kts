// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

    //Firebase SDK 사용을 위한 사전 작업 1: 프로젝트 수준의 build.gradle.kts 파일에 플러그인을 종속 항목으로 추가
    //참고: 현재 이 파일은 루트 수준(프로젝트 수준) Gradle 파일입니다. Hanple/build.gradle.kts
    id("com.google.gms.google-services") version "4.4.2" apply false
}