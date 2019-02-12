version = "0.1.0"

dependencies {
    compile("org.seleniumhq.selenium", "selenium-java", "3.6.0") {
        exclude("org.seleniumhq.selenium", "selenium-ie-driver")
        exclude("org.seleniumhq.selenium", "selenium-safari-driver")
        exclude("org.seleniumhq.selenium", "selenium-opera-driver")
        exclude("org.seleniumhq.selenium", "selenium-edge-driver")
    }
    compile(group = "com.github.detro", name = "ghostdriver", version = "2.1.0") {
        repositories {
            maven {
                url = uri("https://jitpack.io")
            }
        }
    }
}
