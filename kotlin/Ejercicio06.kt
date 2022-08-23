fun mayor(lista:MutableList<Pair<String,Int>>):String{
    var edad_mayor:Int = 0
    var nombre_mayor:String =""
    for ((nombre,edad) in lista){
        if (edad>edad_mayor){
            edad_mayor = edad.toInt()
            nombre_mayor = nombre
        }
    }
    return nombre_mayor
}

fun main(){

    var lista:MutableList<Pair<String,Int>> = mutableListOf()
    var nombre:String
    var edad:Int
    var nombre_mayor:String = ""


    println("Ingresa el nombre del estudiante 1")
    nombre= readln()!!.toString()
    println("Ingresa la edad del estudiante 1")
    edad= readln()!!.toInt()
    lista.add(Pair(nombre,edad))
    while (nombre!="" || edad >0 ){

        println("Ingresa el nombre del estudiante")
        nombre= readln()!!.toString()
        println("Ingresa la edad del estudiante")
        edad= readln()!!.toInt()
        lista.add(Pair(nombre,edad))
        nombre_mayor = mayor(lista)
    }
    print("El nombre del estudiante con mayor edad es: ${nombre_mayor} ")



}