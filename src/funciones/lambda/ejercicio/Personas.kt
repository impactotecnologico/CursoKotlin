package funciones.lambda.ejercicio

class Persona(val nombre: String, val edad: Int) {
    fun esMayor(fn:(Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

fun mayorEstadosUnidos(edad: Int): Boolean {
    if (edad >= 21)
        return true
    else
        return false
}

fun mayorEspana(edad: Int): Boolean {
    if (edad >= 18)
        return true
    else
        return false
}

fun main(parametro: Array<String>) {
    val persona1 = Persona("juan", 18)
    if (persona1.esMayor(::mayorEspana))
        println("${persona1.nombre} es mayor si vive en España")
    else
        println("${persona1.nombre} no es mayor si vive en España")
    if (persona1.esMayor(::mayorEstadosUnidos))
        println("${persona1.nombre} es mayor si vive en Estados Unidos")
    else
        println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}