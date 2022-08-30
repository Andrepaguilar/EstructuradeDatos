fun resultados(list: MutableList<Triple<Double,Double,Double>>):Triple<Pair<Double,Double>,Pair<Int,Int>,Pair<Int,Int>>{

    var estudiantes_pasan=0
    var estudiantes_pierden=0
    var cantidad = 0
    var acumulado_notas = 0.0
    var estudiantes10 = 0
    var estudiantes100 = 0
    var nota_final=0.0

    for ((nota1:Double,nota2:Double,nota3:Double) in list){

        nota_final =  (nota1*0.25)+(nota2*0.25)+(nota3*0.5)
        acumulado_notas = acumulado_notas+nota_final

        if(nota_final >=60.0){
            estudiantes_pasan = estudiantes_pasan +1

        }else{
            estudiantes_pierden = estudiantes_pierden +1
        }

        if (nota_final == 10.0){
            estudiantes10 = estudiantes10 +1
        }else if(nota_final == 100.0){
            estudiantes100 = estudiantes100 +1
        }

        cantidad++



    }
    var promedio = acumulado_notas/cantidad
    var retorno = Triple(Pair(nota_final,promedio), Pair(estudiantes_pasan,estudiantes_pierden-1),
        Pair(estudiantes10,estudiantes100))
    return retorno


}

fun main() {

    var list:MutableList<Triple<Double,Double,Double>> = mutableListOf()
    println("Ingrese la nota 1")
    var nota1 = readln()!!.toDouble()
    println("Ingrese la nota 2")
    var nota2 = readln()!!.toDouble()
    println("Ingrese la nota 3")
    var nota3 = readln()!!.toDouble()

    list.add(Triple(nota1,nota2,nota3))
    var retorno  = resultados(list)
    println("la nota final fue de ${retorno.first.first}")
    while (nota1 >= 0 || nota2>= 0 || nota3>= 0){


        println("Ingrese la nota 1")
        nota1 = readln()!!.toDouble()
        println("Ingrese la nota 2")
        nota2 = readln()!!.toDouble()
        println("Ingrese la nota 3")
        nota3 = readln()!!.toDouble()

        if(nota1 >= 0 || nota2>= 0 || nota3>= 0) {
            list.add(Triple(nota1, nota2, nota3))
            retorno = resultados(list)
            println("la nota final fue de ${retorno.first.first}")
        }




    }
    println("Cantidad de estudiantes que ganaron la Unidad de Estudios ${retorno.second.first}")
    println("Cantidad de estudiantes que perdieron la Unidad de Estudios ${retorno.second.second}")
    println("Cantidad de estudiantes con nota final igual a 10.0 = ${retorno.third.first}")
    println("total de estudiantes con nota final igual a 100.0 = ${retorno.third.second}")
    println("Promedio de notas de todos los estudiantes ${retorno.first.second}")




}