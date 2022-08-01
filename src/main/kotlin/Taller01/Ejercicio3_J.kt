package Taller01

/*
?Modelado
?Enunciado:
*Realice una función para determinar la nota final que obtendrá un alumno considerando que realiza tres
*exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de
*50%
?ENTRADAS:
*Nota primer examen --> Double --> Nota_1
*Nota segundo examen --> Double --> Nota_2
*Nota tercer examen --> Double --> Nota_3
?SALIDAS:
Nota final del alumno --> Double --> Nota_Final
 */

//Funcion

fun CalculoNotas (Nota1: Double, Nota2: Double, Nota3: Double): Double {
    val Examen1 = Nota1 * 0.25
    val Examen2 = Nota2 * 0.25
    val Examen3 = Nota3 * 0.50
    val notaFinal = Examen1 + Examen2 + Examen3
    return notaFinal
}

//Programa

fun main () {

    println("Ingrese la nota del primer examen")
    val Nota1 = readLine()!!.toDouble()
    println("Ingrese la nota del segundo examen")
    val Nota2 = readLine()!!.toDouble()
    println("Ingrese la nota del tercer examen")
    val Nota3 = readLine()!!.toDouble()
    println("La nota final del estudiante es: ${CalculoNotas(Nota1, Nota2, Nota3)}")
}