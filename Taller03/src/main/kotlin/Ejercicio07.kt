package Instrucciones_de_repeticion
fun main(){
  println("ingrese el número del cual desea saber la cantidad de divisores")
    var numero= readLine()!!.toInt()
    println("los números divisores son: ${divisores(numero)}")
}
fun divisores(numero:Int):Int{
    var contar=0

    for (i in 1 ..numero+1) {
        if (numero%i==0) {
            println("${i}")
           contar++
         }
    }

return contar
}