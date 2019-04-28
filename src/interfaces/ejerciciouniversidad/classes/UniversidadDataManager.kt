package interfaces.ejerciciouniversidad.classes

import interfaces.ejerciciouniversidad.classes.models.Estudiante
import interfaces.ejerciciouniversidad.classes.models.Examen
import interfaces.ejerciciouniversidad.interfaces.UniversidadRepository

class UniversidadDataManager (var estudiantes: Array<Estudiante>): UniversidadRepository  {

    override var abierta: Boolean
        get() = false
        set(value)  {
            if (value) {
                // do something
            }
        }

    override fun getById(id: Int): Estudiante{
        return this.estudiantes[id]
    }

    override fun getExamenesByEstudiante(id: Int): Array<Examen> {
        return this.estudiantes[id].examenes
    }

    override fun addExamen(estudiante: Estudiante, examen: Examen): Estudiante {
        //return super.addExamen(estudiante, examen)
        return estudiante
    }


}