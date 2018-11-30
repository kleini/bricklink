/*
configurations {
    jaxws
    wsimport
}

dependencies {
    jaxws 'com.sun.xml.ws:jaxws-tools:2.2.10'
}

group = 'de.dpag'
version = '3.0'

sourceSets {
    wsimport
    main {
        compileClasspath += wsimport.output
        runtimeClasspath += wsimport.output
    }
}

task wsimport {
    doLast {
        sourceSets.wsimport.output.classesDirs[0].mkdirs()
        sourceSets.wsimport.java.srcDirs[0].mkdirs()
        ant {
            taskdef(name: 'wsimport', classname: 'com.sun.tools.ws.ant.WsImport', classpath: configurations.jaxws.asPath)
            wsimport(
                keep: true,
                destdir: sourceSets.wsimport.output.classesDirs[0],
                sourcedestdir: sourceSets.wsimport.java.srcDirs[0],
                package: "de.dpag.oneclickforapp.webservice",
                xnocompile: "true",
                wsdl: 'https://internetmarke.deutschepost.de/OneClickForAppV3/OneClickForAppServiceV3?wsdl'
            )
        }
    }
}

wsimport.outputs.dir sourceSets.wsimport.java.srcDirs[0]

compileWsimportJava.dependsOn(wsimport)
compileJava.dependsOn(compileWsimportJava)

jar.from sourceSets.wsimport.runtimeClasspath
sourcesJar.from sourceSets.wsimport.allJava, sourceSets.main.allJava

clean {
    delete sourceSets.wsimport.java.srcDirs
}
*/