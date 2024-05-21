package com.eulogioep.introduccionakotlin

fun main(){
    Elemento(2)
    Elemento("Pedro")
    Elemento(Person("Pedro", "Perez", 20))
}

data class Person(val nombre: String, val apellido: String, val edad: Int)

// Al indicar <T> (Puede ser cualquier letra), se indica que es un tipo genérico.
// Se pueden agregar todas las que quieran según los datos necesarios <T, R, ...>
class Elemento<T>(valor: T){

    // Con init indicamos que se va a ejecutar cuando se instancie la clase.
    init{
        println("El valor es: $valor")
    }

}