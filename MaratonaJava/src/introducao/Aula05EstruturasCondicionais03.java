package introducao;

public class Aula05EstruturasCondicionais03 {

	public static void main(String[] args) {
		double salary = 4000;
		String donateMsg = "Vou doar R$500.";
		String notDonateMsg = "Ainda não tenho condições.";
		String resultado = (salary > 5000) ? donateMsg : notDonateMsg;
		System.out.println(resultado);
		

	}

}
