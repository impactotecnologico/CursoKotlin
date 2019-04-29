package funciones

fun imprimirVarArg(myDouble: Double, myFloat: Float, vararg ints: Int) {
    println(myDouble)
    println(myFloat)
    for (n in ints) {
        print("$n\t")
    }
}

fun main() {
    imprimirVarArg(1.34, 4.4F, 2, 3, 4, 5, 6)
}




fun printNumbers(myDouble: Double, vararg ints: Int, myFloat: Float) {
    println(myDouble)
    println(myFloat)
    for (n in ints) {
        print("$n\t")
    }
}

fun getUserAndProvincia(id: Int): Pair<String?, String?> {
    require(id > 0, { "Error: id es menor que 0" })

    val users: Map<Int, String> = mapOf(101 to "jose", 102 to "jack", 104 to "jhon")
    val provincias: Map<Int, String> = mapOf(101 to "Toledo", 102 to "Madrid", 104 to "Valencia")

    val user = users[id]
    val prov = provincias[id]
    return Pair(user, prov)
}





fun main(a: String) {
    printNumbers(1.34, 2, 3, 4, 5, 6, myFloat = 4.4F)


    val intsArray: IntArray = intArrayOf(1, 3, 4, 5)
    printNumbers(1.34, *intsArray, myFloat = 4.4F)

    val userAndProv: Pair<String?, String?> = getUserAndProvincia(101)
    println(userAndProv.first)
    println(userAndProv.second)

    val (name, prov) = getUserAndProvincia(101)
    println(name)
    println(prov)
}