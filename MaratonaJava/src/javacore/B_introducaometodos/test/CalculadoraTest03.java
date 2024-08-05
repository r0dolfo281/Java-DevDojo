package javacore.B_introducaometodos.test;

import javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

	public static void main(String[] args) {
		Calculadora c3 = new Calculadora();
		double res = c3.divideDoisNumeros(20.0, 5.0);
		System.out.println(res);
	}

}
