package com.eulogioep.aplicaciones.sintaxis

fun main(){
    // Creación de un array de Strings. El índice de un array empieza en 0.
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays[1]) // Acceso al segundo elemento del array (Martes).

    weekDays[1] = "Martes 2" // Modificación del segundo elemento del array.

    println(weekDays.size) // Imprime el tamaño del array.

    // Para evitar un desebordamiento del Array, se puede verificar con un if.
    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay más elementos en el array")
    }

    // Bucles para Arrays
    // Bucle for si sólo nos interesa la posición de los elementos.
    for(position in weekDays.indices){
        println(weekDays[position])
    }

    // Bucle for si nos interesa la posición y el valor.
    for((position, day) in weekDays.withIndex()){
        println("Día $position: $day")
    }

    // Bucle for si nos interesa el valor.
    for(weekDay in weekDays){
        println("Hoy es: $weekDay")
    }

}