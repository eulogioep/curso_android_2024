package com.eulogioep.aplicaciones.sintaxis

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
}

fun ifBasico(){
    val name: String = "Eulogio"

    if(name == "Eulogio"){
        println("La variable name es Eulogio")
    }else{
        println("Este no es Eulogio")
    }
}

fun ifAnidado(){
    val animal: String = "dog"

    if(animal == "dog") {
        println("Es un perrito!")
    }else if(animal == "cat") {
        println("Es un gato!")
    }else if(animal == "bird") {
        println("Es un pajaro!")
    }else{
        println("No es un animal de los esperados!")
    }
}

fun ifBoolean(){
    var soyFeliz: Boolean = true

    if(!soyFeliz){//Con ! se invierte el valor booleano
        println("Estoy triste")
    }else{
        println("Estoy feliz")

    }
}