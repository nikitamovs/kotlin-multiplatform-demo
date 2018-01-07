package common

actual class ExpectedClass actual constructor(val target: String) {

    actual fun greet() {
        console.log("Hello $target, I am the JS implementation")
    }
}

/**
 * A function that is multi-platform, i.e. the implementation differs per platform.
 */
actual fun multiPlatformFunction(): String {
   return "I am the JS implemented multiplatform function"
}