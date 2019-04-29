package clases.abstractas.anulacion

open class BaseA (open val baseProp: String) {
 
}
 
class DerivedA : BaseA("") {
 
    private var derivedProp: String = ""
 
    override var baseProp: String
        get() = derivedProp
        set(value) {
            derivedProp = value
        }
}