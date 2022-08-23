fun main(){
var lista: MutableList<Double> = mutableListOf()
    print("Ingrese el número: ")
    var numero= readLine()!!.toInt()

    print("Ingrese la altura en metros: ")
    var altura= readLine()!!.toDouble()

    while((altura>0) and (altura<3)) {
        lista.add(altura)
        print("Ingrese la altura en metros: ")
        altura = readLine()!!.toDouble()

    }
    print(lista)
    println(" las cantidad de alturas menor al número es: ${calcular_menor(lista,numero)}")
    println("El promedio de las alturas es: ${promedio_atlturas(lista)}")
}

fun calcular_menor(List:MutableList<Double>,numero:Int):Int{
    var contador=0
    for(altura in  List){
        if (numero > altura){
            contador++
        }
    }
return contador
}

fun promedio_atlturas(List:MutableList<Double>):Double{
    var suma=0.0
    for (altura in List){
        suma+=altura
    }
    var promedio=suma/List.size
    return promedio
}