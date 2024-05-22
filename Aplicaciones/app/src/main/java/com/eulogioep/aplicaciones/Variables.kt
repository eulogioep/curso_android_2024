package com.eulogioep.aplicaciones

fun main(){

    /**
     * val: Son variables inmutables que no pueden ser redefinidas.
     * var: Son variablesmutables que pueden ser redefinidas.
     *
     * Se recomienda usar val siempre que sea posible, ya que es más eficiente.
     */

    /**
     * Variables Numéricas
     */

    // Byte (Números enteros: -128 a 127)
    val number: Byte = 10

    // Int (Números enteros: -2.147.483.648 a 2.147.483.647)
    val age: Int = 20

    // Long (Números enteros: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.8)
    val population: Long = 10_000_000

    // Float (Números decimales: 3.4028235E38 a 1.4E-45)
    val weight: Float = 70.5f

    // Double (Números decimales: 1.7976931348623157E308 a 5.0E-324)
    val temperature: Double = 36.5

    /**
     * Variables Alfanuméricas
     */

    // Char
    val letter: Char = 'A'

    // String
    val message: String = "Hola mundo"

    /**
     * Variables Booleanas
     */

    // Boolean
    val isRaining: Boolean = true
    val hasMoney: Boolean = false

    /**
     * Operaciones aritméticas
     */

    // Suma
    val sum = 5 + 3
    println(sum) // 8

    // Resta
    val subtraction = 10 - 4
    println(subtraction) // 6

    // Multiplicación
    val multiplication = 2 * 3
    println(multiplication) // 6

    // División
    val division = 10 / 2
    println(division) // 5

    // Módulo
    val modulo = 10 % 3
    println(modulo) // 1

    // Incremento
    var counter = 0
    counter++
    println(counter) // 1

    // Decremento
    counter--
    println(counter) // 0


    // Operadores de asignación
    var num = 5
    num += 3
    println(num) // 8

    // Operadores de comparación
    val isEqual = 5 == 3
    println(isEqual) // false

    // Operadores lógicos
    val isGreater = 10 > 5
    println(isGreater) // true

    // Operadores de rango
    val range = 1..5
    println(range) // 1, 2, 3, 4, 5

    // Operadores de pertenencia
    val list = listOf(1, 2, 3)
    println(1 in list) // true

    // Operadores de identidad
    val a = 5
    val b = 5
    println(a === b) // true

    // Operadores de bit a bit
    val bitwiseAnd = 5 and 3
    println(bitwiseAnd) // 1

    // Operadores de desplazamiento
    val leftShift = 5 shl 2
    println(leftShift) // 20

    // Operadores de concatenación
    val string = "Hola" + " " + "Mundo"
    println(string) // Hola Mundo

    // Operadores de asignación compuestos
    var count = 0
    count += 5
    println(count) // 5

    // Operadores de asignación de rango
    for (i in 1..5) {
        println(i)
    }

    // Operadores de asignación de lista
    val numbers = mutableListOf(1, 2, 3)
    numbers += 4
    println(numbers) // [1, 2, 3, 4]

    // Operadores de asignación de mapa
    val map = mutableMapOf("key" to "value")
    map["key2"] = "value2"
    println(map) // {key=value, key2=value2}

    // Operadores de asignación de conjuntos
    val set = mutableSetOf(1, 2, 3)
    set += 4
    println(set) // [1, 2, 3, 4]



}