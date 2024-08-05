package javacore.B_introducaometodos.test;

import javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
	public static void main(String[] args) {
		
		Calculadora c4 = new Calculadora();
		int num1 = 1;
		int num2 = 2;
		c4.alteraDoisNumeros(num1, num2);
		System.out.printf("Num1: %d%n", num1);
		System.out.printf("Num2: %d", num2);
		
		
	}
}
