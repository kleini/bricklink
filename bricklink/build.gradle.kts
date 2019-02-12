
/*
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'org.junit.platform:junit-platform-gradle-plugin:1.0.1'
    }
}*/

version = "0.8.5"

//apply plugin: 'org.junit.platform.gradle.plugin'

dependencies {
    compile(group = "com.fasterxml.jackson.core", name = "jackson-databind", version = "2.8.1")
    compile(group = "oauth.signpost", name = "signpost-commonshttp4", version = "1.2.1.2")
    compile(group = "net.sf.opencsv", name = "opencsv", version = "2.3")
    compile(group = "commons-io", name = "commons-io", version = "2.5")
    compile(group = "org.seleniumhq.selenium", name = "selenium-java", version = "3.6.0") {
        exclude(group = "org.seleniumhq.selenium", module = "selenium-ie-driver")
        exclude(group = "org.seleniumhq.selenium", module = "selenium-safari-driver")
        exclude(group = "org.seleniumhq.selenium", module = "selenium-opera-driver")
        exclude(group = "org.seleniumhq.selenium", module = "selenium-edge-driver")
    }
    compile(project(":dataobjects"))
}

/*dependencies {
    compile 'com.fasterxml.jackson.core:jackson-databind:2.8.1'
    compile 'oauth.signpost:signpost-commonshttp4:1.2.1.2'
    compile 'net.sf.opencsv:opencsv:2.3'
    compile group: 'commons-io', name: 'commons-io', version: '2.5'
    compile(group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '3.6.0') {
        exclude group: 'org.seleniumhq.selenium', module: 'selenium-ie-driver'
        exclude group: 'org.seleniumhq.selenium', module: 'selenium-safari-driver'
        exclude group: 'org.seleniumhq.selenium', module: 'selenium-opera-driver'
        exclude group: 'org.seleniumhq.selenium', module: 'selenium-edge-driver'
    }
    compile group: 'com.github.detro', name: 'ghostdriver', version: '2.1.0'
    compile project(':dataobjects')

    testCompile group: 'org.mockito', name: 'mockito-core', version: '2.+'
    testCompile group: 'junit', name: 'junit', version: '4.12'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.0.1'
    testCompileOnly group: 'org.apiguardian', name: 'apiguardian-api', version: '1.0.0'

    testRuntime group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '4.12.1'
    testRuntime group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.0.1'
    testRuntime group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.9.0'
    testRuntime group: 'org.apache.logging.log4j', name: 'log4j-jul', version: '2.9.0'
    testRuntime group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.0.1'
}

task fatJar(type: Jar) {
    baseName = project.name + '-all'
    from {
        configurations.compile.collect {
            it.isDirectory() ? it : zipTree(it)
        }
    }
    with jar
}

task partout(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.PartOut'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
  if (null != System.getProperty("exec.args")) {
    args System.getProperty("exec.args") .split()
  }
}

task pgTabs(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.PriceGuideTabs'
  systemProperties = [ configurationFile: 'src/main/resources/bricklink.properties', numTabs: 10, browser: 'firefox' ]
  if (null != System.getProperty("exec.args")) {
    args System.getProperty("exec.args") .split()
  }
}

task setValues(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.DetermineSetValues'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
  if (null != System.getProperty("exec.args")) {
    args System.getProperty("exec.args") .split()
  }
}

task contained(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.Contained'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
  if (null != System.getProperty("exec.args")) {
    args System.getProperty("exec.args") .split()
  }
}

task colorsAndCategories(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.tools.ColorsAndCategories'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
}

task info4LEGOarticles(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.bricklink.Info4LEGOarticles'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
  if (null != System.getProperty("exec.args")) {
    args System.getProperty("exec.args") .split()
  }
}

task determineSetValues(type: JavaExec) {
  classpath = sourceSets.main.runtimeClasspath
  main = 'org.kleini.bricklink.DetermineSetValues'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
  if (project.hasProperty("appArgs")) {
    args appArgs.split(',')
  }
}

task listStamps(type: JavaExec) {
  classpath sourceSets.main.runtimeClasspath
  main 'org.kleini.dpdhl.ListStamps'
  systemProperties = [ configurationFile: 'src/main/resources/myconfiguration.properties' ]
}
*/