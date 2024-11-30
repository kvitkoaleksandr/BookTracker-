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
    mavenCentral() // Центральный Maven репозиторий
    maven { url = uri("https://repo1.maven.org/maven2/") } // Дополнительный репозиторий
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
    implementation("org.postgresql:postgresql:42.6.0")
    implementation("org.projectlombok:lombok:1.18.28")
    implementation("org.hibernate.validator:hibernate-validator:8.0.0.Final") // Для валидации
    implementation("org.glassfish:jakarta.el:4.0.2") // Обновлено с 5.0.2 на 4.0.2
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}
