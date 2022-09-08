package ean.estructuradedatos.tallerpilas

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Facultad de Ingeniería
 *
 * Proyecto Taller de Pilas
 * Autor: Universidad EAN - Marzo 11, 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Ejercicio 01
 * Obtener el fondo de la pila
 */
fun <T> IStack<T>.bottom(): T {//Está función es O(n)
    val copia=this.copy()
    //definir el tope con T
    var ultimo_tope: T =copia.peek()
    while (!copia.isEmpty){
        ultimo_tope=copia.peek()
        copia.pop()
    }
return ultimo_tope
}

/**
 * Ejercicio 02
 * Función para sumar los números pares de tres cifras que hay en una pila de enteros
 */
//funcion externa toca llamar a la pila, función interna con el this
fun sumarParesTresCifras(pila: IStack<Int>): Int {//la función es O(n^2)
    val copia=pila.copy()
    var ultimo_tope:Int
    var suma=0
    while (!copia.isEmpty) { //O(n)
    ultimo_tope=copia.peek()//O(1)
        if((ultimo_tope in 100..999)&& ultimo_tope%2==0){ //O(n)
            suma+=ultimo_tope //O(n)

        }
         copia.pop()      //O(1)
    }
    return suma //01
    }

/**
 * Ejercicio 03
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe ningún número de dos cifras, retorne
 * null
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? { //Está función es O(n^2)
    val copia = pila.copy()
    var ultimo:Int?
    var maximo:Int=0
    var nulo:Int? = null

    if (copia.isEmpty ){
        return null
    }else{
        while (!copia.isEmpty ){
            ultimo = copia.peek()

            if ((ultimo in 10..99) && (ultimo > maximo)){
                maximo = ultimo
            }
            if(maximo == 0){
                return null
            }
            copia.pop()
        }
        return maximo
    }
}

/**
 * Ejercicio 04
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T): Unit { //Está función es O(n^2)

    val Pila_auxiliar:IStack<T> = TArrayStack()
    // pasar los datos a la pila auxiliar
    while (!p.isEmpty) { // O👎
        val tope = p.peek()
        Pila_auxiliar.push(tope)
        p.pop()
    }
    p.push(elem) //O(1)
    // pasamos los elementos de aux a p
    while (!Pila_auxiliar.isEmpty){ // O👎
        p.push(Pila_auxiliar.peek())
        Pila_auxiliar.pop()
    }
}

/**
 * Ejercicio 05
 * Función genérica para obtener el tamaño de una pila
 */
fun <T> tamPila(p: IStack<T>) : Int {////Está función es O(n^2)
    val copia = p.copy()
    var contador:Int = 0
    while (!copia.isEmpty){
        copia.pop()
        contador = contador+1
    }
    return contador
}

/**
 * Ejercicio 06
 * Función genérica que permite Invertir una pila en otra. Recibe la pila y retorna la pila, pero invertida.
 * Solo puede usarse las operaciones de las pilas, no listas.
 */
fun <T> invertirPila(pila: IStack<T>): IStack<T> {////Está función es O(n^2)
    val copia = pila.copy()
    var ultimo: T = copia.peek()
    while (!pila.isEmpty){
        pila.pop()
    }
    while (!copia.isEmpty){
        ultimo = copia.peek()
        pila.push(ultimo)
        copia.pop()
    }
    return pila
}


/**
 * Ejercicio 07
 * Función genérica que copia una pila en otra.
 * La función recibe la pila y retorna la copia.
 * No debe usarse el método copy de la pila ni listas
 */
fun <T> copiarPila(pila: IStack<T>): IStack<T> {////Está función es O(n^2)
    val Pila_auxiliar:IStack<T> = TArrayStack()
    val copia:IStack<T> = TArrayStack()
    var ultimo = pila.peek()
    while (!Pila_auxiliar.isEmpty){
        Pila_auxiliar.pop()
        copia.pop()
    }
    while (!pila.isEmpty){
        ultimo = pila.peek()
        Pila_auxiliar.push(ultimo)
        pila.pop()
    }

    while (!Pila_auxiliar.isEmpty){
        ultimo=Pila_auxiliar.peek()
        copia.push(ultimo)
        pila.push(ultimo)
        Pila_auxiliar.pop()
    }
    return copia
}


/**
 * Ejercicio 08
 * Función genérica que recibe una pila y un elemento y que elimina de la
 * pila todas las ocurrencias del elemento que se recibe como parámetro.
 * No debe retornar nada.
 */
fun <T> eliminarElementoPila(pila: IStack<T>, elem: T) {////Está función es O(n^2)
    val Pila_auxiliar:IStack<T> = TArrayStack()

    var ultimo = pila.peek()
    while (!Pila_auxiliar.isEmpty){
        Pila_auxiliar.pop()

    }
    while (!pila.isEmpty){
        ultimo = pila.peek()
        Pila_auxiliar.push(ultimo)
        pila.pop()
    }

    while (!Pila_auxiliar.isEmpty){
        ultimo=Pila_auxiliar.peek()
        if (ultimo != elem){

            pila.push(ultimo)

        }
        Pila_auxiliar.pop()
    }
}

/**
 * Ejercicio 09
 * Invertir una lista de números utilizando una pila. La función no retorna,
 * debe modificar la lista
 */
fun invertirLista(list: IList<Int>) {////Está función es O(n^2)
    val Pila: IStack<Int> = TArrayStack()
    list.forEach { Pila.push(it) }
    list.clear()
    while (!Pila.isEmpty) {
        list.add(Pila.peek())
        Pila.pop()
    }
}


/**
 * Ejercicio 10
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean {////Está función es O(n^2)
    val size = frase.length
    val pile_a: IStack<String> = TArrayStack()
    val pile_b: IStack<String> = TArrayStack()
    if (size%2 == 0) {
        for (i in 0 .. size/2) {
            pile_a.push(frase[i].toString())
        }
        for (i in size downTo  size/2) {
            pile_b.push(frase[i].toString())
        }
    } else {
        for (i in 0 until  size/2) {
            pile_a.push(frase[i].toString())
        }
        for (i in size - 1 downTo (size/2) + 1) {
            pile_b.push(frase[i].toString())
        }
    }
    while (!pile_a.isEmpty && !pile_b.isEmpty) {
        if (pile_a.peek() == pile_b.peek()) {
            pile_a.pop()
            pile_a.pop()
        } else return false
    }

    return true
}

/**
 * Ejercicio 11
 * Determinar si dos pilas son iguales
 */
fun <T> igualesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean {
    val pile_a = pila1.copy()
    val pile_b = pila2.copy()
    while (!pile_a.isEmpty && !pile_b.isEmpty) {
        if (pile_a.peek() == pile_b.peek()) {
            pile_a.pop()
            pile_b.pop()
        } else return false
    }

    return true
}

class ProbarPila {
    @Test
    fun pruebaEjercicio01() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        println("La pila es $pila")
        println("El tope es ${pila.peek()}")
        println("El fondo es ${pila.bottom()}")

        assertEquals(1, pila.bottom())
    }

    @Test
    fun pruebaEjercicio02() {
        val p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(2500)
        p.push(100)
        p.push(125)
        p.push(81)

        assertEquals(350, sumarParesTresCifras(p))
    }

    @Test
    fun pruebaEjercicio03() {
        var p: IStack<Int> = TLinkedStack()

        p.push(2)
        p.push(25)
        p.push(250)
        p.push(50)
        p.push(100)
        p.push(95)
        p.push(81)

        assertEquals(mayorDeDosCifras(p), 95)

        p.clear()
        p.push(3)
        p.push(4)
        p.push(5)

        assertNull(mayorDeDosCifras(p))

   }

    @Test
    fun pruebaEjercicio04() {
        val pila: IStack<Int> = TLinkedStack()

        pila.push(1)
        pila.push(2)
        pila.push(3)
        pila.push(4)
        pila.push(5)
        pila.push(6)

        assertEquals(1, pila.bottom())

        guardarEnElFondo(pila, 10)

        assertEquals(10, pila.bottom())
        println("Prueba superada!")
    }


    @Test
    fun pruebaEjercicio05() {
        val pila: IStack<String> = TLinkedStack()

        assertEquals(0, tamPila(pila))

        pila.push("Hola")
        pila.push("nano")
        pila.push("shell")
        pila.push("rojo")

        assertEquals(4, tamPila(pila))
    }

    @Test
    fun pruebaEjercicio06() {
        val pila: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila.push(elem)
        }

        val inv = invertirPila(pila)
        for (elem in lista) {
            assertEquals(elem, inv.peek())
            inv.pop()
        }
    }

    @Test
    fun pruebaEjercicio07() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 6, 4, 31)

        for (elem in lista) {
            pila.push(elem)
        }

        val copia = copiarPila(pila)
        for (n in lista.size - 1 downTo 0) {
            assertEquals(lista[n], copia.peek())
            copia.pop()
        }
    }

    @Test
    fun pruebaEjercicio08() {
        val pila: IStack<Int> = TLinkedStack()
        val lista = TList(5, 11, 8, -3, 5, 4, 31, 5)

        for (elem in lista) {
            pila.push(elem)
        }

        eliminarElementoPila(pila, 5)

        for (n in lista.size - 1 downTo 0) {
            if (lista[n] != 5) {
                assertEquals(lista[n], pila.peek())
                pila.pop()
            }
        }
        assertTrue { pila.isEmpty }
    }

    @Test
    fun pruebaEjercicio09() {
        val lista = TList(8, 1, 7, 6, -4, 5, 1, 31)
        val invlst = lista.copy()

        invertirLista(lista)

        for (i in 0 until lista.size) {
            assertEquals(lista[i], invlst[lista.size - i - 1])
        }

    }

    @Test
    fun pruebaEjercicio10() {
        assertTrue { palindrome("nosubasabuson") }
        assertTrue { palindrome("lavanesabasenaval") }
        assertTrue { palindrome("logracasillasallisacargol") }
        assertFalse { palindrome("arrozconleche") }
    }

    @Test
    fun pruebaEjercicio11() {
        val pila1: IStack<String> = TLinkedStack()
        val pila2: IStack<String> = TLinkedStack()
        val pila3: IStack<String> = TLinkedStack()
        val lista = TList("uno", "dos", "tres", "cuatro", "cinco")

        for (elem in lista) {
            pila1.push(elem)
            pila2.push(elem)
            pila3.push(elem)
            pila3.push(elem)
        }

        assertTrue(igualesPilas(pila1, pila2))
        assertFalse(igualesPilas(pila3, pila2))
    }


}