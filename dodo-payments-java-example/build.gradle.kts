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
    // Use `./gradlew :dodo-payments-java-example:run` to run `Main`
    // Use `./gradlew :dodo-payments-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dodopayments.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
