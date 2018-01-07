package common

/**
 * Expected class by platform dependant implementations
 */
expect class ExpectedClass(target: String) {
    fun greet()
}

/**
 * Extension function for the expected class
 */
fun ExpectedClass.printMessage() = println("This is the message from the expected class!")

/**
 * A class that is the same on all platforms.
 */
class CommonClass(val name: String) {

    override fun toString() = "I am the common class, I love print names, $name :)"
}

/**
 * A function that is the same on all platforms.
 */
fun commonFunction() = "This function implementation is the same on all platforms"

/**
 * A function that is multi-platform, i.e. the implementation differs per platform.
 */
expect fun multiPlatformFunction(): String

