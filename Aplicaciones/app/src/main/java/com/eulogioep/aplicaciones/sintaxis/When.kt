package com.eulogioep.aplicaciones.sintaxis

// When es como el Switch en Java pero con un solo case.

fun main(){
    getMonth(3)
    getTrimester(5)
    println(getSemester(8))
    resultado(10)
}

fun getTrimester(month: Int){
    when(month){
        // Usamos el rango para agrupar los meses.
        in 1..3 -> println("Primer trimestre")
        in 4..6 -> println("Segundo trimestre")
        in 7..9 -> println("Tercer trimestre")
        in 10..12 -> println("Cuarto trimestre")
        !in 1..12 -> println("No es un mes válido")
        //else -> println("No es un mes válido")
    }
}

// Función con retorno de un string usando when.
fun getSemester(month: Int): String{
    return when(month){
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        else -> "No es un mes válido"
    }
}

fun getMonth(month: Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("John")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes válido")

    }
}

// El Any es un tipo genérico que puede ser cualquier tipo de dato.
// Any es como un Object en Java y no se recomienda usarlo.
fun resultado(value: Any){
    when(value){
        is Int -> println("Es un entero")
        is String -> println("Es un string")
        is Boolean -> println("Es un booleano")
        else -> println("No es un tipo válido")
    }
}

