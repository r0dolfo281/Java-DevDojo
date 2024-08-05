package javacore.B_introducaometodos.test;
import javacore.B_introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();
		
		System.out.println("------SOMA------");
		c1.somaDoisNumeros();
		
		System.out.println("\n----SUBTRAÇÂO----");
		c1.subtraiDoisNumeros();
		
		

	}

}
