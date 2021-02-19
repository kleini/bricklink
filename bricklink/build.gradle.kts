import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.3.72"
}

version = "0.9.0"

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    compile("com.fasterxml.jackson.core", "jackson-databind", "2.8.1")
    compile("oauth.signpost", "signpost-commonshttp4", "1.2.1.2")
    compile("net.sf.opencsv", "opencsv", "2.3")
    compile("commons-io", "commons-io", "2.5")
    compile("org.seleniumhq.selenium", "selenium-java", "3.6.0") {
        exclude("org.seleniumhq.selenium", "selenium-ie-driver")
        exclude("org.seleniumhq.selenium", "selenium-safari-driver")
        exclude("org.seleniumhq.selenium", "selenium-opera-driver")
        exclude("org.seleniumhq.selenium", "selenium-edge-driver")
    }
    compile(project(":dataobjects"))
    testCompile("junit", "junit", "4.12")
    testRuntime("org.junit.platform", "junit-platform-launcher", "1.4.0")
    testRuntime("org.junit.jupiter", "junit-jupiter-engine", "5.4.0")
    testRuntime("org.junit.vintage", "junit-vintage-engine", "5.4.0")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

tasks {
    register<Jar>("fatJar") {
        group = "application"
        archiveClassifier.set("all")
        with(jar.get() as CopySpec)
        dependsOn(configurations.runtimeClasspath)
        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    }
}

tasks.register("partout", JavaExec::class.java) {
    main = "org.kleini.bricklink.PartOut"
    args(System.getProperty("exec.args")?.toString()?.split(" ") ?: emptyList<String>())
}

tasks.register("pgTabs", JavaExec::class.java) {
    main = "org.kleini.bricklink.PriceGuideTabs"
    systemProperties = mapOf("configurationFile" to "src/main/resources/myconfiguration.properties", "numTabs" to 10, "browser" to "firefox")
    args(System.getProperty("exec.args")?.toString()?.split(" ") ?: emptyList<String>())
}

tasks.register("setValues", JavaExec::class.java) {
    main = "org.kleini.bricklink.DetermineSetValues"
    args(System.getProperty("exec.args")?.toString()?.split(" ") ?: emptyList<String>())
}

tasks.register("contained", JavaExec::class.java) {
    main = "org.kleini.bricklink.Contained"
    args(System.getProperty("exec.args")?.toString()?.split(" ") ?: emptyList<String>())
}

tasks.register("colorsAndCategories", JavaExec::class.java) {
    main = "org.kleini.bricklink.tools.ColorsAndCategories"
}

tasks.register("info4LEGOarticles", JavaExec::class.java) {
    main = "org.kleini.bricklink.Info4LEGOarticles"
    args(System.getProperty("exec.args")?.toString()?.split(" ") ?: emptyList<String>())
}

tasks.register("determineSetValues", JavaExec::class.java) {
    main = "org.kleini.bricklink.DetermineSetValues"
    args(project.properties["appArgs"] ?: emptyList<String>())
}

tasks.register("categoryParts", JavaExec::class.java) {
    main = "org.kleini.bricklink.CategoryParts"
    if (project.properties.containsKey("appArgs")) {
        args(project.properties["appArgs"])
    }
}

tasks.register("listStamps", JavaExec::class.java) {
    main = "org.kleini.dpdhl.ListStamps"
}

tasks {
    val minifigData by registering(JavaExec::class) {
        main = "org.kleini.MinifigData"
        if (project.hasProperty("bsx")) {
            args(project.property("bsx"))
        }
    }
}

tasks.withType(JavaExec::class.java) {
    classpath = sourceSets["main"].runtimeClasspath
    systemProperties = mapOf(
        "configurationFile" to project.file("src/main/resources/myconfiguration.properties").absolutePath
    )
    if (System.getProperties().containsKey("browser")) {
        systemProperties["browser"] = System.getProperty("browser")
    }
}
