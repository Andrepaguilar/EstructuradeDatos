fun main(){
    print("Digite la cantidad de estudiantes: ")
    var Cantidad_estudiantes = readLine()!!.toInt()
    var Nombre_alto=""
    var Nombre_bajo=""
    var Puntaje_Maximo=0.0
    var Puntaje_minimo=0.0
    var suma=0.0
    var pInferior=0.0
    var pSuperior=0.0
    for (i in 1..Cantidad_estudiantes){
        print("Digite el nombre del estudiente #$i: ")
        var nombre= readLine()!!.toString()
        print("Digite el puntaje final del estudiente #$i: ")
        var puntaje= readLine()!!.toDouble()
        if(puntaje>Puntaje_Maximo){
            Puntaje_Maximo=puntaje
            Nombre_alto=nombre
        }
        if(i==1 || puntaje<Puntaje_minimo){
            Puntaje_minimo=puntaje
            Nombre_bajo=nombre
        }
        when{
            puntaje<60 -> pInferior++
            else -> pSuperior++
        }
        suma+=puntaje
    }
    var promedio=suma/Cantidad_estudiantes
    //imprime respuestas
    println("$Nombre_alto es el estudiante con el puntaje más alto")
    println("$Nombre_bajo es el estudiante con el puntaje más bajo")
    println("El puntaje maximo es: $Puntaje_Maximo")
    println("El puntaje minimo es: $Puntaje_minimo")
    println("El promedio de los puntajes es de: $promedio")
    println("El ${(pInferior*100)/Cantidad_estudiantes}% de los estudiantes tiene un puntaje inferior a 60")
    println("El ${(pSuperior*100)/Cantidad_estudiantes}% de los estudiantes tiene un puntaje superior a 60")
}