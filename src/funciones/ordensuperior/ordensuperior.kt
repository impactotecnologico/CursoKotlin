package funciones.ordensuperior

fun main() {
    val stringList: List<String> = listOf("in", "the", "club")
    println(stringList.last { it .length == 3})



    val filter : (Int) -> Boolean = { it < 2 }
    println(filter)

    val filter2 = { x : Int -> x < 2 }
    println(filter2)

    val res = filter(5)
    println(res)


    val filter3 = fun(x : Int) : Boolean = x < 2

    val filter4 = String::filter



}