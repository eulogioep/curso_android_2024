package com.eulogioep.introduccionakotlin

fun main() {

/*  Números: Enteros (Int, Long, Short, Byte), decimales (Double, Float)
    Caracteres: Char
    Booleanos: Boolean
    Cadenas de texto: String


// Declarando variables ('var' = mutables y 'val'= inmutables
// Se recomienda siempre utilizar val.
    var numeroEntero: Int = 10
    var numeroDecimal: Double = 3.14
    val caracter: Char = 'a'
    val esVerdadero: Boolean = true
    val texto: String = "Hola mundo"

*/
    val persona: Persona = Persona("Eulogio", "EP")
    persona.saludo()

    val persona2: Persona2 = Persona2()
    persona2.saludo()

    // Prueba del data class
    val usuario: User = User("Eulogio", 43)
    println(usuario.toString()) // Imprime todos los valores del objeto.

    val usuario2: User = usuario.copy(nombre = "Pepe") // Copia los valores modificando usuario.
    println(usuario2.toString())

    println("Son iguales: ${usuario == usuario2}") // En este caso false porque tienen nombres dif.

}

// Ejemplo de creación de Clases

class Persona(val nombre: String, val apellido: String){
    fun saludo(){
        println("Hola $nombre $apellido")
    }
}

// Ejemplo de clase con constructor vacío
// Además vamos a privatizar sus variables
class Persona2(private val nombre: String = "", private val apellido: String = ""){
    fun saludo(){
        println("Hola $nombre $apellido")
    }
}

// Data class: Son clases que almacenan y manipulan datos de manera sencilla.

data class User(val nombre: String, val edad: Int){

}