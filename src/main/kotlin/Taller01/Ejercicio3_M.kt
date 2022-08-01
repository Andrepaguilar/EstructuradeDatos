package Taller01

/*
?modelado
?Enunciado:
*Escriba una función que halle el volumen de un cono
?Entrada:
*Altura de cono-->Double-->altura_cono
*Ingrese el radio del cono-->Double-->radio_cono
?Salida:
*Volumen del cono--Double-->volumen_cono
*/
fun volumenCono(altura_cono:Int, radio_cono:Double): Double {
    val volumen_cono = (Math.PI*Math.pow(radio_cono,2.0)*altura_cono)/3
    return volumen_cono
}

fun main(){
    println("Ingrese la altura del cono:")
    val altura_cono = readLine()!!.toInt()
    println("Ingrese el radio del cono:")
    val radio_cono = readLine()!!.toDouble()
    println("El volumen del cono es: ${volumenCono(altura_cono,radio_cono)}")

}
