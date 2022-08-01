package Taller01
/*
?modelado
*Enunciado:Una empresa que contrata personal requiere determinar la edad de las personas que solicitan trabajo, pero
*cuando se les realiza la entrevista sólo se les pregunta el año en que nacieron. Realice el algoritmo para
*solucionar este problema.*Estrada:
*Año del empleado-->Int-->año_empleado
*Año actual-->Int-->año_actual
*Salida:
*Edad empleado--Int-->edad_empleado
*/
fun calculoEdad(año_empleado:Int,año_actual:Int):Int{

    val edad_empleado=año_actual-año_empleado
    return edad_empleado

}

fun main(){
    print("Ingrese el año actual : ")
    val año_actual = readln()!!.toInt()
    print("Ingrese el año de nacimiento : ")
    val año_empleado = readln()!!.toInt()

   val  edad_empleado= calculoEdad(año_empleado,año_actual)
    print ("La edad del empleado es: ${edad_empleado}")

}
