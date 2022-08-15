package Instrucciones_de_repeticion

//Funcion

fun sumaDivisores(num:Int):Int {

    var sumaNums = 0
    for(i in 1..num-1){
        if(num % i ==0)
            sumaNums +=i
    }
    return sumaNums
}

//Programa

fun main(){

    println("Ingrese el numero entero a dividir: ")
    var numero= readLine()!!.toInt()
    println("La suma total de los divisores del numero $numero es de :${sumaDivisores(numero)}")
}