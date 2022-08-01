package Taller01
/*
?Modelado
?Enunciado:
*El presidente de la república ha decidido estimular a todos los estudiantes de una universidad mediante la
*asignación de becas mensuales, para esto se tomarán en consideración los siguientes criterios: Para alumnos
*mayores de 18 años con promedio mayor o igual a 90, la beca será de $2000.00; con promedio mayor o igual
*a 75, de$1000.00; para los promedios menores de 75 pero mayores o iguales a 60, de $500.00; a los demás se
*les enviará una carta de invitación incitándolos a que estudien más en el próximo ciclo escolar. A los alumnos
*de 18 años o menores de esta edad, con promedios mayores o iguales a 90, se les dará $3000; con promedios
*menores a 90 pero mayores o iguales a 80, $2000; para los alumnos con promedios menores a 80 pero
*mayores o iguales a 60, se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará
*carta de invitación. Realice la función correspondiente
?Entrada:
*Edad del estudiante-->Int-->edadestudiante
*Promedio del estudiante-->Double-->promedioestudiante
?Salida:
*Cantidad de dolares--Double-->cantidad_dolares
*/


fun tipobeca(edadestudiante: Int, promedioestudiante: Int): Any {
val beca1 = "$2000.00"
val beca2 = "$1000.00"
val beca3 = "$500.00"
val beca4 = "$3000"
val beca5 = "$2000"
val beca6 = "$100"
val mensaje1 = "No ganaste ninguna BECA, debes seguir estudiando , mantente motivado!"
val mensaje2 = "Haz ganado una BECA por un valor de"

val mensaje = if (edadestudiante>18 ){
    if (promedioestudiante>=90){
        return Pair(mensaje2,beca1)
    }else if (promedioestudiante>=75){
        return Pair(mensaje2,beca2)
    }else if (promedioestudiante<75 && promedioestudiante>=60){
        return Pair(mensaje2,beca3)
    }else{
        println(mensaje1)
    }
}else{
    if(promedioestudiante>=90){
        return Pair(mensaje2,beca4)
    }else if (promedioestudiante<90 && promedioestudiante>=80){
        return Pair(mensaje2,beca5)
    }else if (promedioestudiante<80 && promedioestudiante>=60){
        return Pair(mensaje2,beca6)
    }else{
        return mensaje1
    }
}
return mensaje
}


fun main(){
    println("Indique la edad del alumno:")
    val edadestudiante= readLine()!!.toInt()
    println("Indique el promedio del alumno:")
    val promedioestudiante= readLine()!!.toInt()
    println(tipobeca(edadestudiante,promedioestudiante))
}