package colecciones

fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    var names: List<String> = listOf("Jose", "Gabriel", "Joel")
    for (name in names) {
        println(name)
    }


    var mixtos = listOf("Jose", 1, 2.445, 's')

    val emptyList: List<String> = emptyList<String>()


    val nonNullsList: List<Int> = listOfNotNull(2, 45, 2, null, 5, null)

    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "You", "There")


    var mutableNames1 = names.toMutableList()
    mutableNames1.add("Ruth")


    val mutableListNames: MutableList<String> = mutableListOf<String>("Jose", "Gabriel", "Joel")
    mutableListNames.add("Mary")
    mutableListNames.removeAt(1)
    mutableListNames[0] = "Pepe"


    val mutableListMixed = mutableListOf("BMW", "Toyota", 1, 6.76, 'v')


    val mixedTypesSet = setOf(2, 4.454, "how", "far", 'c')

    var intSet: Set<Int> = setOf(1, 3, 4)


    val intsHashSet = hashSetOf(1, 2, 6, 3)
    intsHashSet.add(5)
    intsHashSet.remove(1)


    val intsSortedSet: java.util.TreeSet<Int>  = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(5)
    println(intsSortedSet);
    intsSortedSet.clear()

    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(5, 2, 7, 2, 5) // 5, 2, 7
    intsLinkedHashSet.add(4)
    intsLinkedHashSet.remove(2)
    println(intsLinkedHashSet)
    intsLinkedHashSet.clear()

    val intsMutableSet: MutableSet<Int> = mutableSetOf(3, 5, 6, 2, 0)
    intsMutableSet.add(8)
    intsMutableSet.remove(3)

}