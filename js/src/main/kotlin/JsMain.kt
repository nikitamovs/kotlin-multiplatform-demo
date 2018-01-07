import common.*


fun main(args: Array<String>) {
    val instance = ExpectedClass("Mark")
    instance.greet()
    instance.printMessage()
    println(commonFunction())
    println(multiPlatformFunction())
    println(CommonClass("Mark").toString())
    TODO("Brief Kotlin/JS Features overview")
}