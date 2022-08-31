fun mayor(lista:MutableList<Double>):Double{
    var Altura_mayor:Double = 0.0
    for (estatura in lista){
        if (estatura>Altura_mayor){
            Altura_mayor = estatura.toDouble()

        }
    }
    return Altura_mayor
}

fun main(){

    var lista:MutableList<Double> = mutableListOf()
    var Altura:Double
    var Altura_mayor:Double = 0.0


    println("Cuantos estudiantes vas a comparar? ")
    var n:Int = readln()!!.toInt()

    repeat (n ){
        println("Ingresa la edad del estudiante ${it +1}")
        Altura= readln()!!.toDouble()
        lista.add(Altura)
        Altura_mayor = mayor(lista)

    }
    print("La estatura mayor es: ${Altura_mayor} ")



}