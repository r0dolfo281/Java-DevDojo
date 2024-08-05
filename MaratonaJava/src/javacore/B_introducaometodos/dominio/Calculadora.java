package javacore.B_introducaometodos.dominio;

public class Calculadora {
	
	public void somaDoisNumeros() {
		int n1 = 10;
		int n2 = 40;
		System.out.println(n1 + n2);
	}
	
	public void subtraiDoisNumeros() {
		int n3 = 40;
		int n4 = 10;
		System.out.println(n3 - n4);
	}
	
	public void multiplicaDoisNUmeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divideDoisNumeros(double num1, double num2) {
		return num1 / num2;
	
	}
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 99;
		num2 = 33;
		System.out.printf("Num1: %d%n", num1);
		System.out.printf("Num2: %d%n", num2);
	}
	
	public void somaArray(int[] numbers) {
		int soma = 0;
		for (int i : numbers) {
			soma += i;
		}
		System.out.println(soma);
	}
	
	public void somaVarArgs(int...numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		System.out.println(soma);
	}
}
