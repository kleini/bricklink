version = "0.1.0"

dependencies {
    compile(group = "com.github.detro", name = "ghostdriver", version = "2.1.0") {
        repositories {
            maven {
                url = uri("https://jitpack.io")
            }
        }
    }
    compile(project(":bricklink"))
}
