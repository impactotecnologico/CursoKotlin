package interfaces.herencia

interface Nombre {
    val nombre: String
}

interface Persona : Nombre {
    val primerNombre: String
    val apellido: String
    
    override val nombre: String get() = "$primerNombre $apellido"
}


data class Employee(
    // no es necesario implementar 'nombre'
    override val primerNombre: String,
    override val apellido: String
) : Persona