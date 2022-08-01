package Taller01
/*
?modelado
*Enunciado:Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura. Considere que se
*cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente
?Estrada:
*Costo del metro cuadrado-->Double-->costo_metro
*Metros a pintar-->Int-->metros_totales
?Salida:
*Valor total a cobrar--Double-->valor_a_cobrar
*/

fun conversionmetros(costo_metro:Double,metros_totales:Int):Double{

    val valor_a_cobrar=costo_metro*metros_totales
    return valor_a_cobrar
}

fun main(){

    print ("Ingrese el costo de un metro: ")
    val costo_metro = readLine()!!.toDouble()
    print ("Ingrese el total de metros a pintar: ")
    val metros_totales = readLine()!!.toInt()
    val valor_a_cobrar =conversionmetros(costo_metro,metros_totales)
    print ("El valor total a cobrar por ${metros_totales} metros es: $ ${valor_a_cobrar}")

}
