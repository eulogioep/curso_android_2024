package com.eulogioep.aplicaciones.sintaxis

fun main(){

    //inmutableList()
    mutableList()
}

fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábadoo", "Domingo")

    println(readOnly.size) // Muestra el tamaño de la lista.

    println(readOnly) // Muestra la lista completa como si usásemos .toString()

    println(readOnly[3]) // Muestra el cuarto elemento de la lista)

    println(readOnly.last()) // Muestra el último elemento de la lista.

    println(readOnly.first()) // Muestra el primer elemento de la lista.

    // Filtrar
    val example = readOnly.filter { it.contains("a") } //it es la iteración de la lista.

    println(example)

    // Bucle con listas
    // Recorre la lista y muestra cada elemento. {println(it)} es igual: { weekDay -> println(weekDay) }
    // Pero se ve mejor indicando la segunda opción.
    readOnly.forEach { weekDay -> println(weekDay) }

}

fun mutableList(){
    var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábadoo", "Domingo")

    println(weekDays)

    // Añadir elementos a una lista mutable.
    //weekDays.add("EuDay") // Por defecto se agrega en la última posición.
    weekDays.add(0, "EuDay") // Se agrega el valor en la posición que yo quiera.
    println(weekDays)

    // Con .isEmpty() se comprueba si la lista está vacía.
    if(weekDays.isEmpty()){
        //No voy a pintar nada porque no hay elementos.
    }else{
        weekDays.forEach { println(it) }

    }

    // Con .isNotEmpty() se comprueba si la lista no está vacía.
    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    // Eliminar elementos de una lista mutable.
    weekDays.remove("Martes")
    println(weekDays)


}