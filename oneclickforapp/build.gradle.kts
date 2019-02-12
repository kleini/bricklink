plugins {
    id("uk.co.boothen.gradle.wsimport") version "0.4"
}

group = "de.dpag"
version = "3.0"

tasks.register("wsimport", uk.co.boothen.gradle.wsimport.WsImport::class.java) {
    wsdl("OneClickForAppServiceV3.wsdl", closureOf<uk.co.boothen.gradle.wsimport.Wsdl> {
        packageName = "de.dpag.oneclickforapp.webservice"
    })
    isKeep = true
    setXnocompile(true)
}
