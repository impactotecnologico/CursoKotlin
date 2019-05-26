package ambito_funciones

import ambito_funciones.suma

fun main(args:Array<String>) {
    val numeroA = 2
    val numeroB = 5
    var resultado = suma(numeroA, numeroB)

    println("${numeroA} + ${numeroB} = ${resultado}")
}