package Taller01
/*
?modelado
?Enunciado:
*Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo. Escriba una función
*que permita determinar cuántos minutos y segundos debo esperar para descargar la última película de La
*Mujer Maravilla.
?Entrada:
*Valor en gigabytes de la pelicula-->Double-->giga_pelicula
?Salida:
*tiempo de descarga--Double-->tiempo_de_descarga
*/

fun tiempoDeDescarga(giga_pelicula:Int):Pair< Double, Double>{
    val tiempo_de_descarga_en_segundos =((giga_pelicula/4)*3600)*60
    val tiempo_de_descarga_en_minutos =(giga_pelicula/4)*60
    return Pair (tiempo_de_descarga_en_segundos.toDouble(),tiempo_de_descarga_en_minutos.toDouble())
}

fun main(){
    print ("Ingrese los gigabytes de la pelicula: ")
    val giga_pelicula = readLine()!!.toInt()
    val tiempo_de_descarga_en_segundos = tiempoDeDescarga(giga_pelicula).first
    val tiempo_de_descarga_en_minutos = tiempoDeDescarga(giga_pelicula).second
    println ("El tiempo de descarga de la pelicula es de: ${tiempo_de_descarga_en_segundos} segundos")
    println ("El tiempo de descarga de la pelicula es de: ${tiempo_de_descarga_en_minutos} minutos")

}
