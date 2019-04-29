package listas

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("Jose", "Gabriel", "Joel")
    for (name in names) {
        println(name)
    }


    var mixtos = listOf("Jose", 1, 2.445, 's')

    val emptyList: List<String> = emptyList<String>()


    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)
}