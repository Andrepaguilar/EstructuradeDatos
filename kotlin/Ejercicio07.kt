fun main(){
    println("Cuantos personas vas a encuestar?")
    val repeticion = readLine()!!.toInt()
    var i = 0

    var consume_licor:String
    var personas_consumen_licor= 0
    var mujeres_menores=0
    var hombres_no_consumen_aguardiente = 0
    var total_whisky = 0
    var edades_cerveza =0
    var licor=0
    var edad:Int
    var sexo: Int
    var porcentaje: Int
    var promedio:Int


    while (i != repeticion){
        println("Persona # ${i+1}, Consume licor (Si o No)?")
        consume_licor = readLine()!!.toString()
        if (consume_licor.equals("Si")|| consume_licor.equals("si")){
            personas_consumen_licor+=1
            println("Persona # ${i+1}, Licor prefereido (1- Aguardiante, 2-Ron, 3-Cerveza, 4-Tequila,5-Whisky, 6-Otro) ")
            licor = readLine()!!.toInt()
        }

        if (licor == 5){
            total_whisky+=1
        }
        println("Persona # ${i+1}, Edad?")
        edad = readLine()!!.toInt()
        println("Persona # ${i+1}, Sexo(1-Masculino, 2-Femenino)?")
        sexo = readLine()!!.toInt()
        if(edad<18 && sexo==2){
            mujeres_menores+=1
        }
        if(licor!=1 && (edad>=20 && edad<=25)){
            hombres_no_consumen_aguardiente +=1
        }

        if (licor ==3){
            edades_cerveza+=edad
        }

        i++
    }

    porcentaje = (total_whisky*100)/repeticion
    promedio = edades_cerveza/repeticion

    println("Total de personas encuestadas que consumen licor= ${personas_consumen_licor}")
    println("Total de mujeres menores de edad= ${mujeres_menores}")
    println("Total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años de edad= ${hombres_no_consumen_aguardiente}")
    println("Promedio de edad de las personas que consumen cerveza= ${promedio} ")
    println("Porcentaje de personas que consumen whisky en relación con el total encuestado= ${porcentaje} ")
}