package javacore.B_introducaometodos.test;

import javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {

	public static void main(String[] args) {
		
		Calculadora c5 = new Calculadora();
		int [] n = {10,20,30,40,50};
		c5.somaArray(n);
		c5.somaVarArgs(1,2,3,4,5);

	}

}
