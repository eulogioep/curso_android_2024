package com.eulogioep.introduccionakotlin

// Las extension functions son funciones que se pueden agregar a cualquier tipo de dato.

fun main(){

    val nombre = "Eulogio"
    val nombreMayusculas = nombre.uppercase()// esto es una extension function

    println(nombreMayusculas)

    println("Elimino el primer carácter: ${nombre.removerPrimerCaracter()}")

}

// Creando una extension function propia cuya función es eliminar el primer carácter de un string.

fun String.removerPrimerCaracter(): String{
    return this.substring(1, this.length)
}

/* También se puede usar el = si la función es pequeña.
fun String.removerPrimerCaracter(): String = return this.substring(1, this.length)
*/
