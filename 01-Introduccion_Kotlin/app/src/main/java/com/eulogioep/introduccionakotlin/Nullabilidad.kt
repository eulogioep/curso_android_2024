package com.eulogioep.introduccionakotlin

fun main(){
    val nombre: String? = null // Con ? indicamos que la variable puede ser nula.

    // Con el símbolo ? indicamos que la variable puede ser nula y gestionamos la excepción.
    // Indicamos un valor por defecto si la variable es nula.
    //val c = nombre?.length ?: "Leo".length

    //println(c)

    /*****************************/

    // Con let indicamos que, si la variable no es nula, se ejecuta el código.
    // Más limpio y eficiente que el código anterior.
    nombre?.let {
        println(it)
    }
}