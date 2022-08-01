package Taller01

/*
?modelado
?Enunciado:
*En la universidad vamos a conectar los diversos computadores que hay en una sala de cómputo con cables. Se
*necesita un cable para conectar dos computadores, y debe haber conexión entre todos los computadores.
*Escriba una función que determine el número de cables a comprar a partir del número de computadores que
*hay en la sala.
?Entrada:
*Pesos colombianos-->Double-->pesos_colombianos
*Valor actual del dolar-->Double-->valor_dolar
?Salida:
*Cantidad de dolares--Double-->cantidad_dolares
*/

fun Pequeña1 (Edad1: Int, Edad2:Int): Int {
    if (Edad1<Edad2) {
    }
    return Edad1
}
fun Pequeña2 (Edad1: Int, Edad3:Int): Int {
    if (Edad3<Edad1){
    }
    return Edad3
}
fun Pequeña3 (Edad2: Int, Edad3:Int): Int {
    if (Edad2<Edad3){
    }
    return Edad2
}


fun main(){

    print("Ingrese el nombre de la primera persona : ")
    val Nombre1= readln()!!.toString()
    print("Ingrese la edad de la primera persona : ")
    val Edad1 = readln()!!.toInt()

    print("Ingrese el nombre de la segunda persona : ")
    val Nombre2= readln()!!.toString()
    print("Ingrese la edad de la segunda persona : ")
    val Edad2  = readln()!!.toInt()

    print("Ingrese el nombre de la tercera persona : ")
    val Nombre3= readln()!!.toString()
    print("Ingrese la edad de la tercera persona : ")
    val Edad3 = readln()!!.toInt()

    val  P1= Pequeña1(Edad1,Edad2)
    print ("La persona mas pequena es: ${ P1 }" + Nombre1)

    val  P2= Pequeña2(Edad3,Edad1)
    print ("La persona mas pequena es: ${ P2 }" + Nombre2)

    val  P3= Pequeña3(Edad2,Edad3)
    print ("La persona mas pequena es: ${ P3 }" + Nombre3)

}