package interfaces.ejerciciouniversidad.classes.models

import java.util.*

class Estudiante (var id: Int, var nombre: String, var apellido: String, var email: String, var examenes: Array<Examen>) {

    override fun toString(): String {
        return "Estudiante(id=$id, nombre='$nombre', apellido='$apellido', email='$email', examenes=${Arrays.toString(
            examenes
        )})"
    }
}