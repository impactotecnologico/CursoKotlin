infix fun Int.entre(numero:Int) = this / numero

fun main(args:Array<String>) {
    val division = 20 entre 5
    println("El resultado de la division es $division")
    // El resultado de la division es 4
}