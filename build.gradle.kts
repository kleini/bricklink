subprojects {

    plugins {
        java
        `maven-publish`
    }

    repositories {
        jcenter()
    }

    group = "org.kleini"

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
/*
    gradle.projectsEvaluated {
        tasks.withType(JavaCompile) {
            options.compilerArgs << "-Xlint:unchecked" << "-Xlint:deprecation"
        }
    }

    task sourcesJar(type: Jar) {
        classifier = 'sources'
        from sourceSets.main.allJava
    }

    publishing {
        publications {
            mavenJava(MavenPublication) {
                from components.java

                artifact sourcesJar
            }
        }
    }
*/
}
