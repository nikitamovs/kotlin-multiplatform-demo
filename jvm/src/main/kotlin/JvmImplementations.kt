package common


actual class ExpectedClass actual constructor(val target: String) {

    actual fun greet() {
        println("Hello $target, I am the JVM implementation")
    }
}

/**
 * A function that is multi-platform, i.e. the implementation differs per platform.
 */
actual fun multiPlatformFunction(): String {
    return "I am the JVM implemented multiplatform function"
}