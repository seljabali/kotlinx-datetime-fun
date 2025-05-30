val kotlinVersion by extra { "2.1.21" }
val junitVersion by extra { "5.8.1" }

plugins {
    kotlin("jvm") version "2.1.21"
    id("org.jetbrains.dokka") version "1.9.20"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    `java-library`
    `maven-publish`
    signing
}

group = "org.eljabali.sami.kotlinxdatetimefun"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks{
    register<Jar>("dokkaJar") {
        from(dokkaHtml)
        dependsOn(dokkaHtml)
        archiveClassifier.set("javadoc")
    }
    withType<Jar> {
        metaInf.with(
            copySpec {
                from("${project.rootDir}/LICENSE")
            }
        )
    }
}

signing {
    useInMemoryPgpKeys(
        System.getProperty("GPG_PRIVATE_KEY"),
        System.getProperty("GPG_PRIVATE_PASSWORD")
    )
    sign(publishing.publications)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            pom {
                name.set(project.name)
                description.set("kotlinx.datetime Kotlin extension functions library.")
                url.set("https://github.com/seljabali/kotlinx-datetime-fun")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://github.com/seljabali/kotlinx-datetime-fun/blob/main/LICENSE")
                    }
                }
                developers {
                    developer {
                        id.set("seljabali")
                        name.set("Sami Eljabali")
                        email.set("sami@eljabali.org")
                        url.set("sami.eljabali.org")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/seljabali/kotlinx-datetime-fun.git")
                    developerConnection.set("scm:git:ssh://github.com/seljabali/kotlinx-datetime-fun.git")
                    url.set("https://github.com/seljabali/kotlinx-datetime-fun/tree/main")
                }
            }
            groupId = project.group as String
            artifactId = project.name
            version = project.version as String
            from(components["java"])
            artifacts {
                artifact(tasks["dokkaJar"])
                artifact(tasks.kotlinSourcesJar) {
                    classifier = "sources"
                }
            }
        }
    }
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))
            username.set(System.getProperty("SONATYPE_USERNAME"))
            password.set(System.getProperty("SONATYPE_PASSWORD"))
        }
    }
}