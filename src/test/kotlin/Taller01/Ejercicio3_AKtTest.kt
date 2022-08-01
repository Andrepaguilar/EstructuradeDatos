package Taller01

import org.junit.jupiter.api.Assertions.*

internal class Ejercicio3_AKtTest {

    @org.junit.jupiter.api.Test
    fun areaTriangulo() {

        val expected = 9.1
        assertEquals(expected, areaTriangulo(3.5, 5.2))
    }
}