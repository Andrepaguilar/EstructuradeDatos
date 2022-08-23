fun main(){
    var lista: MutableList<String> = mutableListOf()
    println("Ingrese un país:")
    var ciudad = readLine()!!.toString()

    while(ciudad!="0"){
        lista.add(ciudad)
        println("Ingrese una ciudad:")
        ciudad = readLine()!!.toString()
    }

    println("Indique que ciudad quiere buscar:")
    val option = readLine()!!.toString()

    println(lista)
    println("la ciudad= ${option} ${ciudades(lista,option)} se encuentra en la lista")

}
fun ciudades(lista: MutableList<String>, option:String):String{
    var verif = ""
    for(ciudad in lista){
        if (ciudad.equals(option)){
            verif = "Si"
        }else{
            verif = "No"
        }
    }
    return verif
}