package com.eulogioep.introduccionakotlin


fun main() {
    val dia = DIAS.LUNES.numero
    println(dia) // Imprime el número del día asignado a la variable.
}

// Clase enum.
/*
enum class DIAS {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO
}*/

enum class DIAS(val numero: Int) {
    LUNES(0),
    MARTES(1),
    MIERCOLES(2),
    JUEVES(3),
    VIERNES(4),
    SABADO(5),
    DOMINGO(6)
}
