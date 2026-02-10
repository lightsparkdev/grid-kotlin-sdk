import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Grid API")
        description.set("API for managing global payments on the open Money Grid. Built by Lightspark.\nSee the full documentation at https://grid.lightspark.com/.")
        url.set("grid.lightspark.com")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Lightspark Grid")
                email.set("support@lightspark.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/lightsparkdev/grid-kotlin-sdk.git")
            developerConnection.set("scm:git:git://github.com/lightsparkdev/grid-kotlin-sdk.git")
            url.set("https://github.com/lightsparkdev/grid-kotlin-sdk")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
