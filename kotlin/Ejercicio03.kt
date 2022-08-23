fun verbos(list: MutableList<String>):Int{

    var contador=0
    for (verbo in list) {
        var minuscula = verbo.lowercase()//convierte a minuscula
        if (minuscula.endsWith("ar") ||minuscula.endsWith("er") || minuscula.endsWith("ir")) {
            contador++
        }

    }

    return contador
}

fun main(){
    var num:Int
    println("cuantas palabras desea ingresar")
     num= readLine()!!.toInt()
    var lista : MutableList<String> = mutableListOf()
    repeat(num) {
        println("Ingresar la palabra ${it+1} :")
        var palabra = readLine()!!.toString()
        lista.add(palabra)
    }
    println("Del numero de palabras $num los verbos son ${verbos(lista)}")
}