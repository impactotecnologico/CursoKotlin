package interfaces.ejerciciouniversidad

import interfaces.ejerciciouniversidad.classes.UniversidadDataManager
import interfaces.ejerciciouniversidad.classes.models.Estudiante
import interfaces.ejerciciouniversidad.classes.models.Examen

fun main() {

    var ex1 = Examen(1,9)
    var ex2 = Examen(1,8)

    var examenes: Array<Examen> = arrayOf<Examen>(ex1,ex2)

    var jose = Estudiante(1,"Jose", "Ariza", "jose@jose.com", examenes)

    var estudiantes: Array<Estudiante> = arrayOf<Estudiante>(jose)

    var universidadDataManager: UniversidadDataManager = UniversidadDataManager(estudiantes)

    var e1 = universidadDataManager.getById(0)

    println(e1);

    var ex3 = Examen(1,10)

    var e2 = universidadDataManager.addExamen(jose,ex3)

    println(e2);
}