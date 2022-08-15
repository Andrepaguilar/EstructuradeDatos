package Instrucciones_de_repeticion

//Funcion

fun numsFacto(numero: Int): Int{

    var factores = 1
    for (i in numero downTo 1) {
        factores *= i
    }
    return factores
}

//Programa

fun main() {

    print("Ingrese numero entero positivo para hallar el factorial: ")
    var numero = readLine()!!.toInt()
    for (i in 1..numero) {
        println("El factorial del numero #$i es $i! = ${numsFacto(i)}")
    }
}