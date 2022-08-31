
fun notas(list: MutableList<Triple<Double,Double,Double>>):Triple<Pair<Double,Double>,Pair<Int,Int>,Pair<Int, Int>>{


    var Estudiantes_aprueban=0
    var Estudiantes_pierden=0
    var Cantidad = 0
    var Acumulado_notas = 0.0
    var Estudiantes_nota_10 = 0
    var estudiantes_nota_100 = 0
    var Definitiva=0.0

    for ((nota1:Double,nota2:Double,nota3:Double) in list){

        Definitiva =  (nota1*0.25)+(nota2*0.25)+(nota3*0.5)
        Acumulado_notas = Acumulado_notas+Definitiva

        if(Definitiva >=60.0){
            Estudiantes_aprueban = Estudiantes_aprueban +1

        }else{
            Estudiantes_pierden = Estudiantes_pierden +1
        }

        if (Definitiva == 10.0){
            Estudiantes_nota_10 = Estudiantes_nota_10 +1
        }else if(Definitiva == 100.0){
            estudiantes_nota_100 = estudiantes_nota_100 +1
        }

        Cantidad++



    }
    var promedio = Acumulado_notas/Cantidad
    var resultad_final = Triple(Pair(Definitiva,promedio), Pair(Estudiantes_aprueban,Estudiantes_pierden-1),
        Pair(Estudiantes_nota_10,estudiantes_nota_100))
    return resultad_final


}

fun main() {

    var list:MutableList<Triple<Double,Double,Double>> = mutableListOf()
    println("Ingrese Nota 1")
    var Nota1 = readln()!!.toDouble()
    println("Ingrese Nota 2")
    var Nota2 = readln()!!.toDouble()
    println("Ingrese Nota 3")
    var Nota3 = readln()!!.toDouble()

    list.add(Triple(Nota1,Nota2,Nota3))
    var retorno  = notas(list)
    println("la nota final fue de ${retorno.first.first}")
    while (Nota1 >= 0 || Nota2>= 0 || Nota3>= 0){


        println("Ingrese Nota 1")
        var Nota1 = readln()!!.toDouble()
        println("Ingrese Nota 2")
        var Nota2 = readln()!!.toDouble()
        println("Ingrese Nota 3")
        var Nota3 = readln()!!.toDouble()
        if(Nota1 >= 0 || Nota2>= 0 || Nota3>= 0) {
            list.add(Triple(Nota1, Nota2, Nota3))
            retorno = notas(list)
            println("la nota final fue de ${retorno.first.first}")
        }




    }
    println("Cantidad de estudiantes que ganaron la Unidad de Estudios ${retorno.second.first}")
    println("Cantidad de estudiantes que perdieron la Unidad de Estudios ${retorno.second.second}")
    println("Cantidad de estudiantes con nota final igual a 10.0 = ${retorno.third.first}")
    println("total de estudiantes con nota final igual a 100.0 = ${retorno.third.second}")
    println("Promedio de notas de todos los estudiantes ${retorno.first.second}")




}