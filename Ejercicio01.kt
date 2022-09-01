class Ascensor{
    var piso=0
    var sotano=0
    var actual=0
    var total_pisos=0

    constructor()
    constructor(piso: Int, sotano:Int, actual:Int) {
        this.piso = piso
        this.actual= actual
        this.sotano= sotano
        this.total_pisos= total_pisos
    }

    //get
    //set
    //metodos
    fun primera():Int{
        require(this.actual<this.piso)
        if(this.actual<this.piso){
            if (this.actual==-1){
                this.actual=this.actual+2
            }
            else{
                this.actual=this.actual++
            }
        }
        return this.actual

    }
    fun segunda():Int{
        require(this.actual>=2 && this.actual<this.piso)
        if(this.actual<this.piso){
            this.actual=this.actual-1
        }
        return this.actual
    }

    fun tercera():Int{
        require(this.sotano>=1 && this.piso>=1)
        if (this.sotano>=1 && this.piso>=1 )
        {
            this.total_pisos=this.sotano+this.piso
        }

        return this.total_pisos
    }

}

fun main(){

    var x = Ascensor()
    var opcion:Int
    do {
        println("0.salir\n1.Crear el ascensor\n2.imprimir detalles\n3.Subir un piso\n4.Bajar un piso \n" +
                "5.Cantidad de pisos\n 6.Piso actual")
        print("Elige una opcion: ")
        opcion = readLine()!!.toInt()
        when (opcion){
            1-> {
                print("Inserte el numero de pisos: ")
                val Entrada_pisos = readLine()!!.toInt()
                print("Ingrese el numero de sotanos en numero positivo: ")
                val Entrada_sotanos = readLine()!!.toInt()*-1
                print("Ingrese el piso actual: ")
                val Entrada_piso_actual = readLine()!!.toInt()
                x = Ascensor(Entrada_pisos, Entrada_sotanos,Entrada_piso_actual)

            }
            2-> {

                println("La cantidad de pisos es ${x.piso} y la cantidad de sotanos es ${x.sotano}")
            }
            3-> {
                println("El ascensor ha subido un piso, ahora esta en el piso ${x.primera()}")
            }
            4-> {
                println("El ascensor ha bajado un piso, ahora esta en el piso ${x.segunda()}")
            }
            5-> {
                println("El total de pisos que puede atender el ascensor son: ${x.tercera()}")
            }
            6-> {
                println("El piso actual es: ${x.actual}")
            }
        }
    }while (opcion!=0)
}

