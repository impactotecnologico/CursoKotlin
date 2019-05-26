package output

import java.io.File

fun main() {
    val fileName = "data.txt"

    var file = File(fileName)

    val isNewFileCreated :Boolean = file.createNewFile()

    if(isNewFileCreated){
        println("$fileName creado correctamente.")
    } else{
        println("$fileName Ya existe")
    }

    val isFileCreated :Boolean = file.createNewFile()

    if(isFileCreated){
        println("$fileName creado correctamente.")
    } else{
        println("$fileName Ya existe")
    }
}