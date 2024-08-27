package com.teste.calcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "DEU ERRO SEU ARROMBADO");
	}
	@Test
	@DisplayName("Teste 100 - 25 = 75")
	void testMeno() {
		
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 100D;
		double valor2 = 25D;
		double esperado = 75D;
		
		//Act
		double resultado = calc.meno(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "DEU ERRO SEU ARROMBADO");
	}
	@Test
	@DisplayName("Teste 10 * 10 = 100")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 10D;
		double esperado = 100D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "DEU ERRO SEU ARROMBADO");
	}
	
	@Test
	@DisplayName("Teste 100 / 2 = 50")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 100D;
		double valor2 = 2D;
		double esperado = 50D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "DEU ERRO SEU ARROMBADO");
	}

}
