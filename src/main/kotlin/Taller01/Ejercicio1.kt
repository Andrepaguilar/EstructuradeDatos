package Taller01

//Funciones

fun ejercicioA1 (x:Double, m:Double, n:Double): Double {
    val numerador = Math.pow(x-m,2.0)
    val denominador = n-1
    val S = Math.sqrt(numerador/denominador)
    return S

}
fun ejercicioB1 (y:Double):Double {
    val numerador = -(Math.pow(y,3.0)-1)
    val denominador = (y+1)-Math.sqrt(y+1)
    val P = numerador/denominador
    return P

}

fun ejercicioC1 (x:Double):Double {
    val numerador = x*Math.pow(Math.pow(x,2.0)+1,3.0)
    val denominador = Math.sqrt(2*x)+1
    val Z = numerador/denominador
    return Z

}

fun ejercicioD1 (x: Double, n: Double):Double{
    val numerador = Math.pow(x-2,1/n)
    val denominado = Math.pow(x,3.0)
    val T = 1-(numerador/denominado)
    return T
}

fun ejercicioE1 (x: Int, y: Int):Boolean {
    return ((x!=y)) && ((x<=y))
}

fun ejercicioF1 (a: Int, b: Int, c: Int):Boolean {
    return ((a>=b*c)) || ((b<=c))
}
//Programas

fun main () {

    println(ejercicioA1 (8.0,7.0,6.0))
    println(ejercicioB1 (5.0))
    println(ejercicioC1 (4.0))
    println(ejercicioD1 (3.0,2.0))
    println(ejercicioE1 (6,9))
    println(ejercicioF1 (7,3,5))

}