package clases.abstractas

abstract class Empleado (val nombre: String, val apellido: String) {
    abstract fun ganacias(): Double

    val propFoo: String = "bla bla"

    fun completo(): String {
        return apellido + ", " + nombre;
    }
}