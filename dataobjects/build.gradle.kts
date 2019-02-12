plugins {
    id("uk.co.boothen.gradle.wsimport") version "0.4"
}

group = "de.deutschepost.dpdhl.wsprovider"
version = "3.0"

tasks.register("wsimport", uk.co.boothen.gradle.wsimport.WsImport::class.java) {
    wsdl("prodws.wsdl", closureOf<uk.co.boothen.gradle.wsimport.Wsdl> {
        extraArg("-J-Djavax.xml.accessExternalDTD=all")
        packageName = "de.deutschepost.dpdhl.wsprovider.dataobjects"
    })
    setKeep(true)
    setXnocompile(true)
}
