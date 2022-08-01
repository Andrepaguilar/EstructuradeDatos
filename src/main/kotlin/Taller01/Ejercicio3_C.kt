package Taller01

/*
?modelado
*Enunciado:
*Estrada:
*poblacion colombianos-->int-->poblacion_colombia
*Salida:
*personas desempleadas--int-->población_desempleada
 */
fun dane(poblacion_colombia:Int):Long{
    val población_desempleada=poblacion_colombia*0.0815
    return población_desempleada.toLong()
}

//Programa
fun main (){
    print("Digite poblacion colombiana: ")
    val poblacion_colombia = readln()!!.toInt()
    print("La poblacion desempleada es ${dane(poblacion_colombia)}")
}