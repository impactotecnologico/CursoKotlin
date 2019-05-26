package singleton

import java.io.Serializable

object Singleton : Serializable {
    val text : String = "Hello from singleton"

    init {
        /* Do initialization here */
    }
}