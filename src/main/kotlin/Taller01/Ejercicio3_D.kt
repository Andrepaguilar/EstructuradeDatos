package Taller01

/*
?modelado
*Enunciado:Se desea determinar cuántos dólares se puede adquirir con cierta cantidad de pesos colombianos
*Estrada:
*Pesos colombianos-->Double-->pesos_colombianos
*Valor actual del dolar-->Double-->dolar_actual
*Salida:
*Cantidad de dolares--Double-->cantidad_dolares
 */

fun conversion(pesos_colombianos:Double,dolar_actual:Double):Double{
    val conversion_dolar=pesos_colombianos/dolar_actual
    return conversion_dolar
}

fun main(){
    print("Ingrese el valor del dolar actual $: ")
    val dolar_actual = readln()!!.toDouble()
    print("Ingrese los pesos colombianos que quieres convertir $: ")
    val pesos_colombianos = readln()!!.toDouble()
    val cantidad_dolares =conversion(dolar_actual,pesos_colombianos)
    print ("${pesos_colombianos} pesos colombianos, equivalen a ${cantidad_dolares} dolares")

}
