plugins {
    //`maven-publish`
    jacoco
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.allopen")
    id("com.adarshr.test-logger")
    id("org.jetbrains.dokka")
    id("com.gorylenko.gradle-git-properties") version "2.2.2"
    id("org.springframework.boot") version "2.3.3.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

project.base.archivesBaseName = rootProject.name

dependencies {
    implementation(project(":business"))
    implementation(project(":remote"))
    implementation(project(":persistence"))

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.data:spring-data-commons")
    // Sert à la classe de monitoring
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    //implementation("com.auth0:auth0-spring-security-api:1.1.0")
    implementation("ch.qos.logback:logback-classic")
    implementation("ch.qos.logback:logback-core")
    implementation("net.logstash.logback:logstash-logback-encoder:6.4")

    testImplementation("com.atlassian.oai:swagger-request-validator-core:2.11.0")
    testImplementation("com.atlassian.oai:swagger-request-validator-mockmvc:2.11.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
/*
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = rootProject.group as String?
            artifactId = rootProject.name
            version = rootProject.version as String
            from(components["java"])
        }
    }
    repositories {
        maven {
            val baseUrl = "http://srvpic.intra.sada.fr:7080/artifactory"
            val releasesRepoUrl = "$baseUrl/libs-release-local"
            val snapshotsRepoUrl = "$baseUrl/libs-snapshot-local"
            url = uri(if ((version as String).endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl)
            credentials {
                username = "deployer"
                password = "d3ploy3r-23"
            }
        }
    }
}
*/
springBoot {
    buildInfo()
}

tasks {
    bootJar {
        launchScript()
    }
}