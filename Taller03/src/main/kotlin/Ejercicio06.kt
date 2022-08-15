package Instrucciones_de_repeticion

fun main() {

    print("Digite el numero entero positivo  multiplicador")
    var numero = readLine()!!.toInt()
    println("Tabla de multiplicar del $numero")
    repeat(11) {
        if (it>0) {
            println("$numero x $it =${numero * it}")

            /*esto igual a decir i=i+1 o si es en decrecimiento i--*/
        }
    }
}