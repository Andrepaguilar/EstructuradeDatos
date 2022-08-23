

fun ciclo_pasado(List:MutableList<Int>):Pair<Int, Double>{

    var siglo_p=0
    var suma=0.0
    for (edad in List) {
        if (edad >= 23) {
            siglo_p++
        }
        suma += edad
    }
    var promedio=suma/List.size
    return Pair(siglo_p, promedio.toDouble())
}

fun main(){
    var entero:Int=0
    var lista : MutableList<Int> = mutableListOf()
    println("Ingrese una edad")
    var edad= readLine()!!.toInt()
    while(edad>0){
        lista.add(edad)
        println("Ingrese una edad")
         edad= readLine()!!.toInt()
    }
    var (primera, segunda)=ciclo_pasado(lista)
    print(lista)
    println("los estudiantes del sigo pasado son: ${primera}")
            println("El promedio de edad es:: ${segunda}")
    }