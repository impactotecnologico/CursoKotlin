package clases

fun eliminaPares(numeros: List<Int>): List<Int> {
    var resultado: MutableList<Int> = ArrayList()

    // Funcion local
    fun esPar(numero: Int): Boolean = (numero % 2 == 0)

    for (numero in numeros) {
        if (!esPar(numero)) {
            resultado.add(numero)
        }
    }

    return resultado
}