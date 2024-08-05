package introducao;

public class Aula04Operadores {

	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 10;
		int n3 = 7;
		int n4 = 3;
		
		System.out.println("-----Operadores Aritméticos-----");
		System.out.println("----- + ; - ; *  ; / ;  % ----- ");
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n3 % n4);
		
		System.out.printf("%n");
		
		System.out.println("-----Operadores Relacionais-----");
		System.out.println("--- > ; < ; >= ; <= ; == ; != ---");
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		System.out.printf("%n");
		
		System.out.println("---- Operadores Lógicos ----");
		System.out.println("--------- && ; || ----------");
		
		int age = 35;
		float salary = 2500;
		if(age > 30 && salary >= 4612) {
			System.out.println("Está dentro da lei para maiores de 30 anos");
		}else if(age < 30 && salary >= 3381) {
			System.out.println("Está dentro da lei para menores de 30 anos");
		}else {
			System.out.println("Está em desacordo com a lei");
		}
		
		double currentAcount = 200;
		double savings = 10000;
		float ps5Value = 15000;
		if(currentAcount > ps5Value || savings > ps5Value) {
			System.out.println("Pode-se comprar o PS5");
		}else {
			System.out.println("Não é possível comprar o PS5");
		}
		
		System.out.printf("%n");
		
		System.out.println("-----Operadores de Atribuição-----");
		System.out.println("----- += ; -= ; *= ; /= ; %= -----");
		int bonus = 1800;
		System.out.println(bonus); //1800
		bonus += 1000;
		System.out.println(bonus); //2800
		bonus -= 800;
		System.out.println(bonus); //2000
		bonus *= 2;
		System.out.println(bonus); //4000
		bonus /= 8;
		System.out.println(bonus); // 500
		bonus %= 78421;
		System.out.println(bonus); // 500
				
		
		
		
		

	}

}
