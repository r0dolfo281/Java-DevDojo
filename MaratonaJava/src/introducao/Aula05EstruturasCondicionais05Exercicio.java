package introducao;

public class Aula05EstruturasCondicionais05Exercicio {

	public static void main(String[] args) {
		/*	
		 	Dados valores de 1 a 7, imprima se é dia útil ou final de semana,
			considerando domingo como 1.
		*/ 
		
		int day = 7;
		switch(day) {
			case 2 : case  3 : case 4 : case 5 : case 6:
				System.out.println("Dia Útil.");
				break;
			case 1: case 7:
				System.out.println("Final de Semana.");
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
		}
	}

}
