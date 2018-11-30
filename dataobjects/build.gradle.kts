import com.github.gmazzo.gradle.plugins.tasks.DownloadWSDL
import com.github.gmazzo.gradle.plugins.tasks.WsImport

plugins {
    id("com.github.gmazzo.wsdl") version "0.2"
}

group = "de.deutschepost.dpdhl.wsprovider"
version = "3.0"

/*sourceSets {
    getByName("main") {
        compileClasspath += sourceSets.getByName("wsimport").output
        runtimeClasspath += sourceSets.getByName("wsimport").output
    }
}*/

/*sourceSets {
    wsimport
    main {
        compileClasspath += wsimport.output
        runtimeClasspath += wsimport.output
    }
}*/

wsdl {
    getByName("main") {
        register("prodws") {
            //argument("")
            forcePackage("de.deutschepost.dpdhl.wsprovider.dataobjects")
        }
    }
}

val download = tasks.register("downloadWSDLs", DownloadWSDL::class.java) {
    into("src/main/wsdl")
    from("prodws", "https://prodws.deutschepost.de:8443/ProdWSProvider_1_1/prodws?wsdl")
}

val wsimport = tasks.withType(WsImport::class.java) {
    dependsOn(download)
}

tasks.getByName("sourceJar").dependsOn(wsimport)

/*val wsimport = tasks.register("wsimport", Exec::class.java) {
    // ext.set("srcDir", sourceSets.getByName("wsimport").allJava.sourceDirectories)
    // ext.set("outputDir", sourceSets.getByName("wsimport").output.classesDirs)
    doFirst {
        sourceSets.getByName("wsimport").allJava.sourceDirectories.onEach { it.mkdirs() }
        sourceSets.getByName("wsimport").output.classesDirs.onEach { it.mkdirs() }
    }
}*/

/*task wsimport(type:Exec) {
    ext.srcDir = sourceSets.wsimport.java.srcDirs[0]
    ext.outputDir = sourceSets.wsimport.output.classesDirs[0]
    doFirst {
        wsimport.srcDir.mkdirs()
        wsimport.outputDir.mkdirs()
    }
    commandLine 'wsimport', '-J-Djavax.xml.accessExternalSchema=all', '-s', srcDir, '-d', outputDir, '-keep', '-p', 'de.deutschepost.dpdhl.wsprovider.dataobjects', 'https://prodws.deutschepost.de:8443/ProdWSProvider_1_1/prodws?wsdl', '-Xnocompile'
    onlyIf {
        !wsimport.srcDir.exists()
    }
}

compileWsimportJava.dependsOn(wsimport)
compileJava.dependsOn(compileWsimportJava)

jar.from sourceSets.wsimport.runtimeClasspath
sourcesJar.from sourceSets.wsimport.allJava, sourceSets.main.allJava

clean {
    delete sourceSets.wsimport.java.srcDirs
}
*/