package Instrucciones_de_repeticion

fun salario(horas:Double):Double{

    var sueldo =0.0
    if(horas<=35){
        sueldo = 15_000.0*horas
    }else if (horas>35 && horas <60){
        sueldo = (35.0*15_000.0)+((horas-35.0)*18_000.0)
    }else{
        sueldo = (35.0*15_000.0)+(25.0*18_000.0)+((horas-59.0)*25_000.0)
    }
    return sueldo
}

fun main(){
    var cantidad_empleados = 0
    var horas=0.0
    println("Ingrese la cantidad de empleados en la empresa: ")
    cantidad_empleados = readLine()!!.toInt()
    repeat(cantidad_empleados){
        println("Ingrese la cantidad de horas que trabajó el empleado ${it+1}")
        horas = readLine()!!.toDouble()
        println("El salario neto del empleado es de ${salario(horas)} pesos colombianos")

    }

}