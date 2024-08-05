package introducao;

public class Aula07Arrays04 {
	public static void main(String[] args) {
		int [] numbers2 = {1,2,3,4,5};
		
		for (int i = 0; i < numbers2.length; i++) {
			System.out.printf("%d ",numbers2[i]);
		}
		
		System.out.println("\n");
		
		//FOREACH
		for (int n : numbers2) {
			System.out.printf("%d ",n);
		}
		
	}

}
