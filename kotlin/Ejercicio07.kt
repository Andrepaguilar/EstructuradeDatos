fun precio_carro(lista:MutableList<Pair<String,Double>>,placa:String):Double{
    var p=-1.0
    for ((plac,precio) in lista){
        if (plac==placa){
            p=precio
        }
    }
    return p
}


fun main(){
    var lista:MutableList<Pair<String,Double>> = mutableListOf()
    var placa:String
    var precio:Double
    println("Ingrese placa")
    placa = readLine()!!.toString()
    println("Ingrese precio")
    precio = readLine()!!.toDouble()
    lista.add(Pair(placa,precio))
    while (placa!="" || precio>0){
        lista.add(Pair(placa,precio))
        println("Ingrese placa")
        placa = readLine()!!.toString()
        println("Ingrese precio")
        precio = readLine()!!.toDouble()
    }
    var placa_buscar = readLine()!!.toString()
    print(precio_carro(lista,placa_buscar))
}