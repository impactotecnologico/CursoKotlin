package interfaces

class Child : MyInterface {
    override val prop: Int = 29
}

fun main() {
    val c: Child = Child()
    println(c.prop);
    println(c.foo())
    c.foo()
    println(c.propiedadConImplementacionDirecta)
}