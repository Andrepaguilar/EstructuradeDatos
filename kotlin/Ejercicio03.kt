import kotlin.time.Duration.Companion.seconds

fun main(){
    var poblacionMenor=""
    var lista : MutableList<Triple<String,Int, String>> = mutableListOf()
    print ("Ingrese el nombre del municipio: ")
    var nombre = readLine()!!.toString()
    print ("Ingrese la población: ")
    var poblacion = readLine()!!.toInt()
    print ("Ingrese el nombre del municipio: ")
    var departamento = readLine()!!.toString()
    lista.add(Triple(nombre,poblacion,departamento))

    while(nombre!="" ||poblacion>0){
        print ("Ingrese el nombre del municipio: ")
        var n = readLine()!!.toString()
        print ("Ingrese la población: ")
        var p = readLine()!!.toDouble()
        print ("Ingrese el nombre del municipio: ")
        var d = readLine()!!.toString()
        lista.add(Triple(nombre,poblacion,departamento))
    }

println("El municipio menos poblado es: ${primerafuncion(lista)}")


}
fun primerafuncion(list:MutableList<Triple<String,Int, String>>):String{

    var poblacion_menor:Int = 99999999
    var nombre_menor:String = ""
    for ((nombre, poblacion, departamento) in  list ) {
            if (nombre==""){

            }else if(poblacion<poblacion_menor){
                poblacion_menor=poblacion
                nombre_menor=nombre


            }
        }



return nombre_menor


}