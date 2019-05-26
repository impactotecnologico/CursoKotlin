package clases

fun main(args:Array<String>) {
    val numeros: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numeroImpares = eliminaPares(numeros)
    println("Numeros impares: ${numeroImpares}")
    // Numeros impares: [1, 3, 5, 7, 9]
}