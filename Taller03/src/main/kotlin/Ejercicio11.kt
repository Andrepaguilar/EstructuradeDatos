package Instrucciones_de_repeticion

fun Perfectos(numeroE: Int): Boolean {

    var contar_perfectos = 0
    var verificar = false
    for (i in 1..numeroE - 1) {
        if (numeroE % i == 0)
            contar_perfectos += i
        verificar = contar_perfectos == numeroE
    }
    return verificar
}


//Programa

fun main() {

    var contar = 0
    println("Ingrese numero entero a dividir: ")
    var numero = readLine()!!.toInt()

    for (i in 1..numero) {
        if (Perfectos(i) == true) {
            println("${i} es numero perfecto")
            contar += 1
        }
    }
    println("La cantidad de numeros perefectos es de ${contar}, entre el numero 1 y el numero  ${numero}")
}