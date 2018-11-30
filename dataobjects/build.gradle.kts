val wsimport = configurations.register("wsimport")

group = "de.deutschepost.dpdhl.wsprovider"
version = "3.0"

sourceSets {
    register("wsimport")
    getByName("main") {
        compileClasspath += sourceSets.getByName("wsimport").output
        runtimeClasspath += sourceSets.getByName("wsimport").output
    }
}

/*sourceSets {
    wsimport
    main {
        compileClasspath += wsimport.output
        runtimeClasspath += wsimport.output
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