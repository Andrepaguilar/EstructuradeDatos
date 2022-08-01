package Taller01

/*
?Modelado
*Enunciado:
*Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas, determine cuántas bicicletas
*necesito y cuánto dinero voy a gastar en alquilarlas, para transportar a todos los estudiantes de la
*universidad
*Entrada:
*total_estudiantes-->Int-->total_estudiantes
*alquiler_bicicleta-->Double-->alquiler_bicicleta
*Salida
*Costo total del alquiler de biciletas-->Double-->costo_final
*Total de bicicletas-->Int-->numerobicicletas
*/
fun main() {
    //fun
    print ("Ingrese el total de estudiantes: ")
    val total_estudiantes = readLine()!!.toInt()
    print ("Ingrese el valor de alquiler por bicicleta: ")
    val alquiler_bicicleta = readLine()!!.toDouble()
    val costo_final = gastoBicicletas(total_estudiantes,alquiler_bicicleta)
    val numerobicicletas = totalbicicletas(total_estudiantes,alquiler_bicicleta)
    print ("El costo total de las bicicletas a alquielar es $: $costo_final")
    print ("El numero total de bicicletas a alquilar es: $numerobicicletas")

}
fun gastoBicicletas(total_estudiantes:Int, alquiler_bicicleta:Double):Double{

    val totalbicicletas=total_estudiantes/2
    val costototalquiler=alquiler_bicicleta*totalbicicletas
    return (costototalquiler)
}

fun totalbicicletas(total_estudiantes:Int, alquiler_bicicleta:Double):Int{

    val totalbicicletas=total_estudiantes/2
    return (totalbicicletas)
}
