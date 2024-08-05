package introducao;

public class Aula06EstruturasRepetição04Exercicio {
	public static void main(String[] args) {
		double totalValue = 20000;
		for(int portion = 1; portion <= totalValue; portion++) {
			double portionValue = totalValue / portion;
			if(portionValue >= 1000) {
				System.out.printf("Números de parcelas: %d de R$ %.1f.%n", portion, portionValue);
			}else{
				break;
			}
		}

	}

}
