package introducao;
import java.security.SecureRandom;

public class Aula08ArraysMultidimensionais02 {

	public static void main(String[] args) {
		
		int [][] numbers = new int [3][5];
		
		for(int l = 0; l < 3 ; l++) {
			for(int c = 0; c < 5; c++) {
				numbers[l][c] = new SecureRandom().nextInt(10);
			}
		}
		
		/*
		 	for(int l = 0; l < 3 ; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.printf("%d ", numbers[l][c]);
			}
			System.out.printf("%n");
		*/	
		
		
		for (int[] mat : numbers) {
			for(int n : mat) {
				System.out.printf("%d ", n);
			}
			System.out.printf("%n");
		}

	}

}
