fun sumar(numero1: Int, numero2: Int) = numero1 + numero2

fun mayor(numero1: Int, numero2: Int) = if (numero1 > numero2) numero1 else numero2

fun entreCeroYMax(numero: Int, max: Int) = numero in 0..max

fun main(args: Array<String>) {
    val numA = 2
    val numB = 5
    var suma = sumar(numA, numB)

    println("$numA + $numB = $suma")
    // 2 + 5 = 7

    var numeroMayor = mayor(numA, numB);
    println("El numero mas grande de $numA y $numB es $numeroMayor")
    // El numero mas grande de 2 y 5 es 5

    println("¿$numA esta entre 0 y $numB? ${entreCeroYMax(numA,numB)}")
    // ¿2 esta entre 0 y 5? true
}

