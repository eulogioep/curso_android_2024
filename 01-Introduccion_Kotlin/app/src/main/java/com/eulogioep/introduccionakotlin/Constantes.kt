package com.eulogioep.introduccionakotlin

// Constantes. Siempre escribir en mayusuclas

fun main(){

    println(Constantes.DIRECCION)

}

class Constantes{
    // Objeto de compañia
    companion object{
        const val DIRECCION: String = "25 de julio"
    }
}