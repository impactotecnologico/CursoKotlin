package inputs

fun main(vararg args: String) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println(a + b)
}