plugins {
    id("java")
}

group = "org.example"
//version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()

    testLogging.showStandardStreams = true
    testLogging.events("passed", "failed", "skipped")
}

tasks.jar {
    manifest.attributes["Main-Class"] = "com.company.unit_tests.App"
    val dependencies = configurations
        .runtimeClasspath
        .get()
        .map(::zipTree)
    from(dependencies)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    archiveBaseName.set("UnitTests")
}


