fun main(args: Array<String>) {
    println("Hola Mundo!!");

// this will compile
    var carName = "BMW"
    var streetName = "Oke street"


    val firstName: String = "Jose Julian"

    val accountBalance = 200
    val bankMessage = "Your account balance is $accountBalance"

    val myString = "This is a String"
    val multipleStringLines = """
This is first line
        This is second line
        This is third line """

    println(multipleStringLines)

    val name = "Impacto"
    val message = "La primera letra es: ${name.first()}"

    println(message)

    val numbersArray = Array(5, { i -> i * 2 })

    println(numbersArray.size);

    val r1 = 1..5

    val r2 = 5 downTo 1

    val r3 = 5 downTo 1 step 2

    println(r3.first);
    println(r3.last);
    println(r3.isEmpty());
    println(r3.step);
    println(r2.step);
    println(r1.step);

    val lista = r1.toList().toTypedArray();

    println(lista);

    for (i in 4 downTo 1 step 2) print(i)

    for (i in 1 until 10) {
        // i in [1, 10), 10 is excluded
        println(i)
    }

    println((1..12 step 2).last == 11);

    val x = 8
    val y = 10
    if (x in 1..y - 1)
        println("OK")


    val age = 17

    val typeOfPerson = when(age){
        0 -> "New born"
        in 1..12 -> "Child"
        in 13..19 -> "Teenager"
        else -> "Adult"
    }

    println(typeOfPerson);



    var numeros = arrayListOf(10, 3, 5, 6, 7)
    for ((indice, numero) in numeros.withIndex()) {
        println("$indice = $numero")
    }

    for (letra in 'A'..'F') {
        println(letra)
    }

    fun esLetraMayuscula (letra:Char) = letra in 'A'..'Z'
    println(esLetraMayuscula('b')) //false
    println(esLetraMayuscula('Q')) //true


    buclePrincipal@ for(num in 1..10) {
        println("Multiplos de $num: ")
        for (num2 in 1..10) {
            if (num2 % num == 0)  {
                if (num % 5 == 0) {
                    println("Ya me canse")
                    break@buclePrincipal
                }
                print("$num2 ")
            }
        }
        println()
    }

    var nombre1: String?
    nombre1 = null

//    var longitud: Int = nombre1.length



    var nombre2: String? = null
//    var longitud2: Int = nombre2!!.length


    var nombre3: String? = null
    var longitud3: Int? = nombre3?.length
    println("Longitud: ${longitud3}")


    fun Int.multiplicar(numero: Int): Int {
        return this * numero;
    }
    var multiplicacion = 20.multiplicar(5)

    println("----------");

    val a = 1
    val b = true
    var c = 1

    var result: Int
    var booleanResult: Boolean

    result = -a
    println("-a = $result")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")


}



fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}