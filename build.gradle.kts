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

    val sourcesJar = tasks.register("sourcesJar", Jar::class.java) {
        classifier = "sources"
        val javaMainSourceSet : SourceDirectorySet? = this.convention.findByType(JavaPluginConvention::class.java)?.sourceSets?.get("main")?.allJava
        if (null != javaMainSourceSet) {
            this.from(javaMainSourceSet)
        }
    }

    configure<PublishingExtension> {
        publications {
            register("mavenJava", MavenPublication::class) {
                from(components.getByName("java"))
                artifact(sourcesJar.get())
            }
        }
    }
}
