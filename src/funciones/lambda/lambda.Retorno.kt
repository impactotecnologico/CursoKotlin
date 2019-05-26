package funciones.lambda

data class Personajes(val nombre: String, val id: Int)

private fun findSpock(lista: List<Personajes>) {
    lista.forEach label@{
        if (it.nombre == "Spock") {
            println("Encontramos a Spock")
            return@label
        }
    }
    println("Did we find Spock?")
}

fun findStudentTest() {
    val listado = listOf(Personajes("Kirk", 12345), Personajes("Spock", 54321))
    findSpock(listado)
    println("End of findStudentTest")
}