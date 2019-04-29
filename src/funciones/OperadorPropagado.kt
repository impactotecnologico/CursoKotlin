package funciones

fun imprimir(myDouble: Double, vararg ints: Int, myFloat: Float) {
    println(myDouble)
    println(myFloat)
    for (n in ints) {
        print("$n\t")
    }
}

