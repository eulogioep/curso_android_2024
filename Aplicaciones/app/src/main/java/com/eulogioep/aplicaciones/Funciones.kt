package com.eulogioep.aplicaciones

fun main(){
    showMyName()
    showMyAge(43)
    showMyAgeDefault()
    val sume: Int = add(2, 3)

}

// Función Básica.
fun showMyName(){
    println("Me llamo Eulogio")
}

// Función Genérica.
fun showMyAge(age: Int){
    println("Tengo $age años")
}

// Función Genérica con valor por defecto.
fun showMyAgeDefault(age: Int = 18){
    println("Tengo $age años")
}

// Función Genérica con retorno.
fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

// Función Genérica con retorno en una sóla línea.
fun subtract(num1: Int, num2: Int) = num1 - num2
