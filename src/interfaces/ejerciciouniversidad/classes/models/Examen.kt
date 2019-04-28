package interfaces.ejerciciouniversidad.classes.models

class Examen (var id: Int, var calificacion: Int) {
    override fun toString(): String {
        return "Examen(id=$id, calificacion=$calificacion)"
    }
}