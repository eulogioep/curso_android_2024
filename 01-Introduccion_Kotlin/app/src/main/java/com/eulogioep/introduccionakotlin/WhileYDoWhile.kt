package com.eulogioep.introduccionakotlin

fun main(){

    // while con Kotlin
    var i = 1

    while(i <= 5){
        println("Valor: $i")
        i++
    }

    // do while con Kotlin.
    var sum = 0
    var input: String

    do{
        print("Ingrese un numero: ")
        input = readLine()!! // Los dos "!!" indica que el valor no puede ser nulo.
        sum += input.toInt() // Transforma el valor a entero.

    }while(input != "0") // Si el valor de input es 0, se sale del bucle.

    println("La suma es: $sum")

}