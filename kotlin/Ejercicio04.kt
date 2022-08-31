import kotlin.math.pow

fun distancia_ciudad (latitud:Double, longitud:Double):Double{
    var distancia=(latitud.pow(2)+longitud.pow(2))
    return distancia
}

fun main(){
    println("Cuantas ciudades va a ingresar")
    val repeticion = readLine()!!.toInt()
    var i = 0

    var lista: MutableList<Pair<String,Double>> = mutableListOf()
    var distancia:Double

    while (i != repeticion) {
        print("Ingrese el nombre de la ciudad: ")
        var nombre_ciudad = readLine()!!.toString()
        print("Ingrese la latitud de la ciudad +${nombre_ciudad}: ")
        var latitud = readLine()!!.toDouble()
        print("Ingrese la longitud de la ciudad +${nombre_ciudad}: ")
        var longitud = readLine()!!.toDouble()
        distancia=distancia_ciudad(latitud,longitud)
        lista.add(Pair(nombre_ciudad,distancia))
        i++
    }
    var latitud_bogota=4.60971
    var longitu_bogota=-74.08175
    var distancia_bogota=(latitud_bogota.pow(2)+longitu_bogota.pow(2))

    var distanciamax: MutableList<Double> = mutableListOf()
    var distancia_max :Double

    for ((nombre_ciudad,distancia) in lista){
        distanciamax.add(distancia)
    }
    distancia_max = distanciamax.max()

    for ((nombre_ciudad,distancia) in lista){
        if(distancia_max>distancia_bogota){
             println(distancia)
           println(nombre_ciudad)

        }
    }



}