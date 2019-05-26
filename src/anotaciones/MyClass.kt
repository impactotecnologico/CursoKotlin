package anotaciones

@Anotacion(value = 100)
class MyClass {

}

fun main(args: Array<String>) {
    var c = MyClass()
    var x = c.javaClass.getAnnotation(Anotacion::class.java)
    if (x != null) {
        println("Valor:" + x?.value)
    }
}  