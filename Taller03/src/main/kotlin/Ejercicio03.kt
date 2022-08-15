package Instrucciones_de_repeticion

fun comision(ventas:Int):Double{

    var com = 0.0
    if(ventas >50_000){
        com = ventas * 0.15
    }else{
        com = ventas.toDouble()

    }
    return com
}

fun main(){

    var ventas:Int
    var salario:Int
    var continuar:String =""
    println("Ingrese salario: ")
    salario= readLine()!!.toInt()
    println("Ingrese venta: ")
    ventas = readLine()!!.toInt()
    println("El salario es de ${salario} pesos colombianos y la comision es de ${comision(ventas)} pesos colombianos")
    print("Desea continuar?: ")

    continuar = readLine()!!.toString()
    while (continuar == "Si"){
        println("El salario es de ${salario} pesos colombianos y la comision es de ${comision(ventas)} pesos colombianos")

        print("Desea continuar?: ")

        continuar = readLine()!!.toString()
        println("Ingrese venta: ")
        ventas= readLine()!!.toInt()
    }

}