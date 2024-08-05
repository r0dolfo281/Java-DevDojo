package javacore.N_polimorfismo.test;

import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Tomato;
import javacore.N_polimorfismo.servico.TaxCalculator;

public class ProductTest01 {

	public static void main(String[] args) {
		DesktopComputer computer = new DesktopComputer("Alienware", 27500);
		Tomato tomato = new Tomato("Cherry Tomato", 8.50);
		TaxCalculator.taxDesktopComputerCalculator(computer);
		System.out.println("--------------------------------------------");
		TaxCalculator.taxDesktopComputerCalculator(tomato);
	}

}
