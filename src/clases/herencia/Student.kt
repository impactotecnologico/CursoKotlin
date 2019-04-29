package clases.herencia

import java.math.BigDecimal

open class Estudiante {
    open fun fees(): BigDecimal {
        return BigDecimal(1)
    }
}
 
class EstudianteGraduado : Estudiante() {
    override fun fees(): BigDecimal {
        return super.fees() + calculaFees()
    }

    private fun calculaFees(): BigDecimal {
        return BigDecimal(1)
    }
}