package Instrucciones_de_repeticion

//Funcion

fun sumaEntPosi(n:Int):Int{

    var sumaNums = 0
    for(i in 1..n){
        print("Repeticion ${i}, suma parcial de ${sumaNums}+${i} = ")
        sumaNums+=i
        println(sumaNums)
    }
    return sumaNums
}

//Programa

fun main(){

    val n = readln().toInt()
    println(sumaEntPosi(n))

}