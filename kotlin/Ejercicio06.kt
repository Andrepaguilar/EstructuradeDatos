import kotlin.math.pow

fun masa_corporal(masa:Int,altura:Double):Double{
    var masa_corporal= (altura.pow(2))*masa
    return masa_corporal
}

fun main(){
    println("Cuantos personas va a ingresar")
    val reps = readLine()!!.toInt()
    var i = 0

    var nombre:String
    var masa:Int
    var altura:Double
    var total_masa: Double
    var personas: MutableList<Pair<String,Double>> = mutableListOf()

    while (i != reps){
        println("Ingrese el nombre de la persona ${i+1}")
        nombre = readLine()!!.toString()
        println("Ingrese la cantidad de masa de ${nombre}")
        masa = readLine()!!.toInt()
        println("Ingrese la altura de ${nombre}")
        altura = readLine()!!.toDouble()
        total_masa = masa_corporal(masa,altura)
        personas.add(Pair(nombre,total_masa))
        println(total_masa)
        i++
    }

    var masas: MutableList<Double> = mutableListOf()
    var max_masa :Double
    for((nombre,masas_totales )in personas){
        masas.add(masas_totales)
    }
    max_masa = masas.max()

    for((nombre,masas_totales )in personas){
        if (masas_totales == max_masa){
            println("La persona mas obesa es ${nombre} con una masa corporal de ${masas_totales}")
        }
    }
}