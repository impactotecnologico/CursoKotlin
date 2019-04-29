package enums

enum class Estado1 {
    PENDIENTE, COMPLETADO, ENVIADO
}

enum class Estado(val codigo: Int, val descripcion: String) {
    PENDIENTE(1, "Pendiente de envío"), COMPLETADO(2, "Reporte     completado, pendiente de envío"), ENVIADO(3, "Sincronizado correctamente");
    fun imprimirCodigoYDescripcion() = "$codigo $descripcion"
}


enum class TarjetaDeCredito : ICardLimit {
    SILVER {
        override fun calculaPorcentaje() = 0.25f
        override fun getCreditLimit() = 100000
    },
    GOLD {
        override fun calculaPorcentaje() = 0.5f
        override fun getCreditLimit() = 100000
    },
    PLATINUM {
        override fun calculaPorcentaje() = 0.75f
        override fun getCreditLimit() = 100000
    };

    abstract fun calculaPorcentaje(): Float
}



fun main() {
    println(Estado.PENDIENTE.imprimirCodigoYDescripcion())

    val porcentaje = TarjetaDeCredito.SILVER.calculaPorcentaje()
    val limite = TarjetaDeCredito.PLATINUM.getCreditLimit()

    for (cardType in TarjetaDeCredito.values()) {
        println(cardType.name)
    }
}