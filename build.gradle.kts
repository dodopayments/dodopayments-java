plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "com.dodopayments.api"
    version = "1.14.2" // x-release-please-version
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaJavadocCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaJavadocCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "dodo-payments-java" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
