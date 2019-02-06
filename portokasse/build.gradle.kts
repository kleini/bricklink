version = "0.1.0"

// TODO: Needed because of ghostdriver dependency of bricklink. This needs to be decoupled better.
repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    compile(project(":bricklink"))
    compile(project(":oneclickforapp"))
}
