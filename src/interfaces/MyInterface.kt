package interfaces

interface MyInterface {
    val prop: Int // abstract

    val propiedadConImplementacionDirecta: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}