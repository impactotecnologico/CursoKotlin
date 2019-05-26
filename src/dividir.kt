fun dividir(numero1:Int, numero2:Int = 2) = numero1 / numero2

fun main(args: Array<String>) {
    val division1 = dividir(20, 5)
    println("El resultado de la division1 es $division1")
    // El resultado de la division1 es 4

    val division2 = dividir(20)
    println("El resultado de la division2 es $division2")
    // El resultado de la division2 es 10
}