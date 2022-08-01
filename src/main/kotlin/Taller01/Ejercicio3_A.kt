package Taller01

/*
?Modelado
*Enunciado:Realice una función que halle el área de un triángulo
*Entrada:
*Base del triangulo-->Double-->base_triangulo
*altura del triangulo-->Double-->altura_triangulo
*Salida:
*area de un triangulo-->Double-->area_triangulo
*/
fun main() {
    //fun
    print ("Ingrese la base del triangulo: ")
    val base_triangulo = readLine()!!.toDouble()
    print ("Ingrese la altura del triangulo: ")
    val altura_triangulo = readLine()!!.toDouble()
    val area_triangulo = areaTriangulo(base_triangulo,altura_triangulo)
    print ("El area del triangulo es: $area_triangulo")
    //print(""El area del triangulo es: ${(base_triangulo*altura_triangulo)/2}"")
}
fun areaTriangulo(base_triangulo:Double, altura_triangulo:Double):Double{

    val area=(base_triangulo*altura_triangulo)/2
    return area
}
