package javacore.G_associacao.test;
import java.util.Scanner;

public class LeituraTecladoTest01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String name = scan.nextLine();
		System.out.printf("Digite sua idade: ");
		int age = scan.nextInt();
		System.out.printf("Nome: %s%n", name);
		System.out.printf("Idade: %d%n", age);
		scan.close();
		
	}
}
