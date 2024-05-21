package com.eulogioep.introduccionakotlin

// El condicional When es similar al Switch de otros lenguajes.
fun main(){

    val x = 1

    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Si no hay un valor que coincida, utilizamos else.
            println("x es diferente a 1 o a 2")
        }
    }
}