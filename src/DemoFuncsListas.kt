fun MutableList<Int>.sumar(numero: Int): MutableList<Int> {
    var numeros = mutableListOf<Int>()
    for (i in this) {
        numeros.add(i + numero)
    }

    return numeros
}

fun main(args: Array<String>) {
    var numeros: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var resultado = numeros.sumar(2)

    println("La lista resultante es $resultado")
    // La lista resultante es [3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
}