package Taller01
/*
?modelado
?Enunciado:
*En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se
*necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
*Escriba una función que determine el número de cables a comprar a partir del número de computadores que
*hay en la sala.
?Entrada:
*Numero de los pc-->Int-->numerosPC
?Salida:
*Cantidad de cables--Int-->cantidadC
*/

fun calculoCables(numerosPC: Int): String {
    val parCables = numerosPC%2
    val cantidadC= if (parCables == 0){
        val cablesU = numerosPC/2
        return "Necesita un total de ${cablesU} cables"
    }else{
        return "Debe tener una cantidad par de computadoras"
    }
    return cantidadC
}

fun main(){

    println("Cantidad de computadores que hay en sala:")
    val numerosPC = readLine()!!.toInt()
    println(calculoCables(numerosPC))
}
