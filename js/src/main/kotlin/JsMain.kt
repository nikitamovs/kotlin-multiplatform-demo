import common.*
import jquery.jq
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.p
import kotlin.browser.document
import kotlin.browser.window


fun main(args: Array<String>) {
    val instance = ExpectedClass("Mark")
    instance.greet()
    instance.printMessage()
    println(commonFunction())
    println(multiPlatformFunction())
    println(CommonClass("JSMark").toString())
    startGui()
}

// external declarations
external fun alert(message: Any?)

fun startGui() {
    //usage of external libraries & external functions
    jq("#alert_button").click { _ ->
        alert("This is the expected alert function")
    }
    //usage of standard JS
    document.getElementById("dynamic_button")!!.addEventListener("click", { event ->
        testDynamicType()
    })

    val intervalId = window.setInterval({
        val myDiv = document.create.div("panel") {
            p {
                +"Hello world "
                a("https://github.com/nikitamovs/kotlin-multiplatform-demo") { +"here are the examples" }
            }
        }
        document.getElementById("container")!!.appendChild(myDiv)
        document.getElementById("container")!!.append(document.create.div {
            +"added"
        })
    }, 1000)
    window.setTimeout({ window.clearInterval(intervalId) }, 6000)
}

//dynamic type
fun testDynamicType() {
    val obj: dynamic = JSON.parse("{\"name\": \"JSMark\", \"age\": 400}")
    println(obj.name)
}

