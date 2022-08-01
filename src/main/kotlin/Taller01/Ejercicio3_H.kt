package Taller01

/*
?Modelado
*Enunciado:Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
*considerando que lleva una velocidad constante. Realice una función para tal fin.
?ENTRADAS:
*Velocdiad a la que va el ciclista --> Int --> velocidad_ciclista
*Distancia recorrida --> Int --> distancia
?SALIDA
*Tiempo del recorrido --> Int --> tiempo_total
 */

//Funcion

fun tiempoRecorrido(velocidad_ciclista: Double, distancia: Int): Double {
    val tiempo_total = (distancia / velocidad_ciclista)
    return tiempo_total

}

//Progarama

fun main () {

    println("Ingrese la velocidad  en k/h programada para el rrecorrido")
    val velocidad_ciclista = readLine()!!.toDouble()
    println("Ingrese la distancia recorrida en km")
    val distancia = readLine()!!.toInt()
    val tiempo_total =tiempoRecorrido(velocidad_ciclista,distancia)
    println("El tiempo total para el recorrido será de: ${tiempo_total} horas")
}