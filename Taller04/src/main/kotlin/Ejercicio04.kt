import kotlin.math.pow

fun distancia_ciudad (latitud:Double, longitud:Double):Double{
    var distancia=(latitud.pow(2)+longitud.pow(2))
    return distancia
}

fun main(){
    print ("Ingrese el nombre de la ciudad: ")
    var nombre_ciudad = readLine()!!.toString()
    print ("Ingrese la latitud de la ciudad +${nombre_ciudad}: ")
    var latitud = readLine()!!.toDouble()
    print ("Ingrese la longitud de la ciudad +${nombre_ciudad}: ")
    var longitud = readLine()!!.toDouble()
    var latitud_bogota=4.60971
    var longitu_bogota=-74.08175
    var distancia_bogota=(latitud_bogota.pow(2)+longitu_bogota.pow(2))
    var distancia:Double=0.0
    var nombre=""


    var lista : MutableList<Triple<String,Double, Double>> = mutableListOf()
    for ((nombre_ciudad,latitud,longitud) in lista){
        distancia=(distancia_ciudad(latitud,longitud))
        if(distancia>distancia_bogota){
        distancia =distancia
        nombre=nombre_ciudad
        }
    }

return (distancia,nombre)

}