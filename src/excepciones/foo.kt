package excepciones

fun foo() {
    try {
        throw Exception("Exception message")
    } catch (e: Exception) {
        println("Exception handled")
    } finally {
        println("inside finally block")
    }
}

fun foo(number: Int) {
    val result =  try {
        if (number != 1) {
            throw IllegalArgumentException()
        }
        true
    } catch (e: IllegalArgumentException) {
        false
    }

    println(result)
}