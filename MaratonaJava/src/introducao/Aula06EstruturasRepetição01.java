package introducao;

public class Aula06EstruturasRepetição01 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("WHILE");
		while(count <= 10) {
			System.out.print(count + " ");
			count++;
		}
		
		System.out.println("\n---------------------------");
		
		System.out.println("DO WHILE");
		count = 0;
		do {
			System.out.print(count + " ");
			count++;
		}while(count <= 10);
		
		System.out.println("\n---------------------------");
		
		System.out.println("FOR");
		for(int n = 0; n <= 5; n++) {
			System.out.print(n + " ");
		}
			
		
		

	}
}
