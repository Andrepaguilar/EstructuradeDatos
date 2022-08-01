package Taller01
/*
?modelado
?Enunciado:
*Realice un algoritmo para determinar cuánto pagará finalmente una persona por un artículo x,
*considerando que tiene un descuento de 5%, y debe pagar 19% de IVA (debe retornar el precio con descuento
*y el precio final)
?Entrada:
*Precio del articulo-->Double-->precio_producto
?Salida:
*Total a pagar-->Double-->total_a_pagar
*/

fun ofertas (precio_producto: Double): Pair<Double,Double> {
    val descuento = precio_producto * 0.05
    val precio_con_descuento = precio_producto - descuento
    val iva = precio_con_descuento * 0.19
    val valorTotal = precio_con_descuento + iva
    return Pair(precio_con_descuento, valorTotal)
}

fun main(){
    println("Ingrese el precio del articulo:")
    val precio_producto = readLine()!!.toDouble()
    val first = ofertas(precio_producto).first
    val second = ofertas(precio_producto).second
    println("El valor total del producto con descuento del 5% sin IVA es de: ${first}")
    println("El valor total c descuento más el IVA es de: ${second} pesos")

}
