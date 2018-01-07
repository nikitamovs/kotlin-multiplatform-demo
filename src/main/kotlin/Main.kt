package common

fun main(args: Array<String>) {
    val instance = ExpectedClass("John")
    instance.greet()
    instance.printMessage()
    println(commonFunction())
    println(multiPlatformFunction())
    println(CommonClass("John").toString())
}