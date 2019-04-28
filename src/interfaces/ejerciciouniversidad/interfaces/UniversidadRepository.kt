package interfaces.ejerciciouniversidad.interfaces

import interfaces.ejerciciouniversidad.classes.models.Estudiante
import interfaces.ejerciciouniversidad.classes.models.Examen

public interface UniversidadRepository {

    var abierta: Boolean
        get() = false
        set(value) {
            if (value) {

            }
        }

    fun getById(id: Int): Estudiante
    fun getExamenesByEstudiante(id: Int): Array<Examen>

    fun addExamen(estudiante: Estudiante, examen: Examen): Estudiante {
        var examenes = estudiante.examenes.plus(examen)
        estudiante.examenes = examenes
        return estudiante
    }
}