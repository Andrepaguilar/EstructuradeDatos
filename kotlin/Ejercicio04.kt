//Funcion

fun definitivasEstudiantes(listaD:MutableList<Float>): Pair<Int,Float> {

    var sumaN = 0
    var promedioN = 0.0.toFloat()
    for(i in listaD){
        if(i>=60){
            sumaN+=1
        }
        promedioN+=i
    }
    return Pair(sumaN,promedioN/listaD.size)
}

//Programa

fun main(){
    var listaD: MutableList<Float> = mutableListOf()
    do {

        print("Ingrese las notas de los etudiantes de la clase y para dejar de ingresar notas" +
                "digite un numero negativo (ejemplo-1): ")
        var notaE = readLine()!!.toFloat()
        if(notaE<0.0.toFloat()){
            break
        }
        listaD.add(notaE)

    }while(true)
    var (aprobaron,promedioClase) = definitivasEstudiantes(listaD)

    println("La cantidad de estudiantes que aprobaron es de: $aprobaron y la cantidad de los que perdieron es de: ${(listaD.size)-aprobaron}")
    println("Promedio de definitivas de la clase: $promedioClase")

}