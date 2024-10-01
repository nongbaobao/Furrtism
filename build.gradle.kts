plugins {
    val kotlinVersion = "1.8.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.16.0"
}

group = "io.random"
version = "0.0.1"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
}

mirai {
    jvmTarget = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.alibaba:fastjson:2.0.28")
}