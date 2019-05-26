fun throwError(): Nothing {
    throw RuntimeException()
}

// running infinite loops
fun infyLoop(): Nothing {
    while(true){
        println("this is infinite loop")
    }
}

fun main(args:Array<String>)
{
    infyLoop();
    println("después del infinito")
}