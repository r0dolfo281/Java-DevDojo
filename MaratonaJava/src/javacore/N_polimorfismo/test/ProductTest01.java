package javacore.N_polimorfismo.test;

import javacore.N_polimorfismo.dominio.Airplane;
import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Tomato;
import javacore.N_polimorfismo.servico.TaxCalculator;

public class ProductTest01 {

	public static void main(String[] args) {
		DesktopComputer computer = new DesktopComputer("Alienware Laptop Computer", 27500);
		Tomato tomato = new Tomato("Cherry Tomato", 8.50);
		Airplane airplane = new Airplane("C172 Skyhawk", 1715880);
		
		TaxCalculator.taxCalculator(computer);
		System.out.println("\n--------------------------------------------\n");
		TaxCalculator.taxCalculator(tomato);
		System.out.println("\n--------------------------------------------\n");
		TaxCalculator.taxCalculator(airplane);
	}

}
