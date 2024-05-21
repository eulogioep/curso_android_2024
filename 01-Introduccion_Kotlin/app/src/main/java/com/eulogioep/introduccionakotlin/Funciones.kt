package com.eulogioep.introduccionakotlin

// Para crear funciones se utiliza la palabra reservada fun.
// También se indica que tipo de dato vamos a devolver.
// Veamos un ejemplo:

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun main() {
    println("Es par: ${esPar(3)}")
}