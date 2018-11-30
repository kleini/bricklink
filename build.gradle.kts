import org.gradle.api.plugins.JavaPluginConvention

subprojects {

    apply {
        plugin("java")
        plugin("maven-publish")
    }

    repositories {
        jcenter()
    }

    group = "org.kleini"

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType(JavaCompile::class.java).configureEach {
        options.apply {
            compilerArgs = mutableListOf("-Xlint:unchecked", "-Xlint:deprecation")
        }
    }

    val sourceJar = tasks.create<Jar>("sourceJar") {
        classifier = "sources"
        this.from(project.convention.getPlugin(JavaPluginConvention::class.java).sourceSets.getByName("main").allSource)
    }

    configure<PublishingExtension> {
        publications {
            register<MavenPublication>("mavenJava") {
                from(components.getByName("java"))
                artifact(sourceJar)
            }
        }
    }
}
