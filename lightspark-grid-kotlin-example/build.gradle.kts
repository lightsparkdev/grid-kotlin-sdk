plugins {
    id("lightspark-grid.kotlin")
    application
}

dependencies {
    implementation(project(":lightspark-grid-kotlin-core"))
    implementation(project(":lightspark-grid-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :lightspark-grid-kotlin-example:run` to run `Main`
    // Use `./gradlew :lightspark-grid-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.lightspark.grid.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
