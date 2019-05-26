package clases

class Persona {

    var nombre: String = ""
    get() = field.capitalize()
    set(value) {
        field = value + " ---- "
    }

    var apellido = ""
    set(value) {
        if (!value.isNotEmpty()) {
            throw IllegalArgumentException("Debes escribir el apellido")
        }
        field = value
    }

    var edad: Int = 0

    fun esMayorEdad(): Boolean = edad >= 18
}

fun main(args:Array<String>) {
    var alguien = Persona()
    alguien.nombre = "Luis"
    alguien.edad = 34
    println("¿Es ${alguien.nombre} mayor de edad? ${alguien.esMayorEdad()}")
}