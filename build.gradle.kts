plugins {
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.spring") version "1.9.10"
}

group = "com.yourname.booktracker"
version = "1.0-SNAPSHOT"
var sourceCompatibility = "17"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-security")
    implementation ("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    implementation ("org.postgresql:postgresql:42.6.0")
    implementation ("org.projectlombok:lombok:1.18.28")

    developmentOnly ("org.springframework.boot:spring-boot-devtools")

    testImplementation ("org.springframework.boot:spring-boot-starter-test")

}

tasks.test {
    useJUnitPlatform()
}