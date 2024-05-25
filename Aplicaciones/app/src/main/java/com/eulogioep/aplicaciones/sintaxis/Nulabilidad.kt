package com.eulogioep.aplicaciones.sintaxis

// En Kotlin, las variables pueden ser nulas.
// Kotlin tiene seguridad contra los nulos.
fun main(){
    var nombre: String? = null // Con ? indicamos que la variable puede ser nula.

    // Con !! indicamos que estoy seguro que la variable no es nula, pero si es nula crash!!!
    //println(nombre!!.get(3)
    // Con ?: indicamos que si la variable es nula, se le asigna un valor por defecto
    println(nombre?.get(3) ?: "Valor por defecto")

}