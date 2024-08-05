package javacore.G_associacao.test;
import java.util.Scanner;

public class LeituraTecladoTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Sou o grande algoritmo de previsão do futuro.%n");
		System.out.printf("Digite sua pergunta e eu responderei SIM ou NÃO.");
		String ask = scan.nextLine();
		if(ask.charAt(0) == ' ') {
			System.out.printf("SIM");
		}else {
			System.out.printf("NÃO");
		}
		scan.close();
	}
}
