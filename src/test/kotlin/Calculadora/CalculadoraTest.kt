package Calculadora

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {
    val calculadora = Calculadora()
    @org.junit.jupiter.api.Test
    fun soma() {
        assertEquals(6,calculadora.soma(3,3))
    }

    @org.junit.jupiter.api.Test
    fun subtracao() {
        assertEquals(2,calculadora.subtracao(5,3))
    }

    @org.junit.jupiter.api.Test
    fun multiplicacao() {
        assertEquals(8,calculadora.multiplicacao(2,4))
    }

    @org.junit.jupiter.api.Test
    fun divisao() {
        assertEquals(2,calculadora.divisao(4,2))
    }
}