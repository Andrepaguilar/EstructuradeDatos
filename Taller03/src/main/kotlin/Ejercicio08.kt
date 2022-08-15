package Instrucciones_de_repeticion

fun main(){
    println("ingrese numero")
    val numero = readLine()!!.toInt()
    var num=0
    println("El numero es primo?: ${checkprimo(numero)}")
    if (checkprimo(num)){
        print(numero.toString()+ " ")
        ++num
    }

}

fun checkprimo(numero:Int):Boolean{
    var primo=true
    for (i in 2 ..numero/2) {
        if (numero%i==0) {
            primo=false
            break
        }
    }

    return primo
}

