plugins {
    id("dodo-payments.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":dodo-payments-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.dodopayments.api.example.Main"
}
