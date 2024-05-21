package com.eulogioep.introduccionakotlin

fun main(){

    // Creación de listas en Kotlin.

    // Lista mutable:
    var listaMutable = mutableListOf<String>(
        "Eulogio",
        "Hugo",
        "Juan",
        "Noelia",
        "Matilde"
    )

    // Agregar un elemento a la lista mutable.
    listaMutable.add("Maria")

    // Eliminar un elemento de la lista mutable. El índice empieza por 0.
    listaMutable.removeAt(2)

    // Imprimir la lista mutable.
    println(listaMutable)

    // Lista inmutable, que no cambia en el tiempo como la dirección de un server.
    // Sólo podemos obtener información y no modificarla.
    var listaInmutable = listOf<String>(
        "Automovil",
        "Motocicleta",
        "Bicicleta"
        )

    // Imprimir un elemento de la lista inmutable.
    println(listaInmutable[1])


    // Uso de For en Kotlin.
    for (nombre in listaMutable){
        println(nombre)
    }

    // Usando forEach.
    listaInmutable.forEach { elementos ->
        println(elementos)
    }

    // Uso de for por índice en Kotlin.
    for ((index,value) in listaMutable.withIndex()){
        println("Nombre: $value con índice: $index")
    }

    // Igual pero con forEachIndexed.
    listaInmutable.forEachIndexed { indice, elemento ->
        println("Nombre: $elemento con índice: $indice")
    }

}