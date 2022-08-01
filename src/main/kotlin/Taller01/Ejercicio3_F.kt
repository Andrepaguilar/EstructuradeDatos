package Taller01
/*
?modelado
*Enunciado:Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo utilizan. Considere
*que el cobro es con base en las horas que lo disponen y que las fracciones de hora se toman como completas y
*realice una función que permita determinar el cobro.
?Estrada:
*Valor de la hora-->Double-->valor_hora
*Tiempo estacionado en minutos-->Double-->tiempo_estacionado
?Salida:
*Valor a cobrar al usuairo--Double-->valor_a_pagar
*/

fun conversionHora(valor_hora:Double,tiempo_estacionado:Double):Double{

    val  valor_a_pagar =(tiempo_estacionado/60)*valor_hora
    return valor_a_pagar

}

fun main(){

    print("Ingrese el valor por hora : ")
    val valor_hora = readln()!!.toDouble()
    print("Ingrese el tiempo estacionado en minutos : ")
    val tiempo_estacionado = readln()!!.toDouble()

    val  valor_a_pagar= conversionHora(valor_hora,tiempo_estacionado)
    print ("La valor a pagar es $: ${valor_a_pagar}")

}
