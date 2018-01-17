package org.sample.kotlin

import org.sample.java.JavaClass

fun main(args: Array<String>) {
    // inter-operability
    println(JavaClass().test("I don't wanna have whitespaces"))

    // high order functions
    println("High order function mult result : " + highOrderFunctionSample({ n1, n2 -> n1 * n2 }))
    println("High order function sum result : " + highOrderFunctionSample({ n1, n2 -> n1 + n2 }))

    // extensions
    println("Extension with integers: " + extensionSample(6))
    println("Extension with string: " + extensionSample("Mark"))

    // default arguments
    println(defaultArguments())
    println(defaultArguments("Called with this argument"))

    // data class + destructuring
    val (name, age) = getDeveloper()
    println("Got developer named $name, aged $age")

    //null safety
    var str: String? = "TEST"
    str = null
    str?.length
    try {
        str!!.length
    } catch (ex: NullPointerException) {
        println("Cannot get the length of a null")
    }
}


fun highOrderFunctionSample(operation: (Int, Int) -> Int): Int {
    return operation(1, 10)
}

fun Int.double() = this * 2
fun String.congratulate() = this.plus(" congratulations!")
fun extensionSample(param: Any): String {
    //smart casts
    return when (param) {
        is Int -> "Doubled number: ${param.double()}"
        is String -> param.congratulate()
        else -> throw RuntimeException("Not supported type")
    }
}

fun defaultArguments(subject: Any = "Called without argument"): String {
    return subject.toString()
}

class JavaInterOperable {
    private fun String.purgeWhitespaces() = this.replace(" ", "")

    fun execute(subject: String): String {
        return subject.purgeWhitespaces()
    }
}

data class Developer(val name: String, val age: Int)

fun getDeveloper(): Developer {
    return Developer(age = 30, name = "Mark")
}