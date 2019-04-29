package colecciones

fun main() {
    val codigos: Map<Int, String> = mapOf(234 to "Nigeria", 1 to "USA", 233 to "España")
    for ((key, value) in codigos) {
        println("$key corresponde a $value")
    }
    print(codigos[234])


    val monedas: MutableMap<String, String> = mutableMapOf("Naira" to "Nigeria", "Dollars" to "USA", "Pounds" to "UK")
    println("Paises ${monedas.values}")
    println("Monedas ${monedas.keys}")
    monedas.put("Euro", "España")
    monedas.remove("Dollars")


    val personsHashMap: java.util.HashMap<Int, String> = hashMapOf(1 to "Jose", 2 to "Peter", 3 to "Pepe")
    personsHashMap.put(4, "Maria")
    personsHashMap.remove(2)
    print(personsHashMap[1])

    val personsSortedMap: java.util.SortedMap<Int, String> = sortedMapOf(2 to "Pedro", 1 to "John", 3 to "Aitor")
    personsSortedMap.put(7, "Adam")
    personsSortedMap.remove(3)

    // FUNCIONES

    val stringList: List<String> = listOf("in", "the", "club")
    print(stringList.last())

    val intSet: Set<Int> = setOf(3, 5, 6, 6, 6, 3)
    print(intSet.last())
}