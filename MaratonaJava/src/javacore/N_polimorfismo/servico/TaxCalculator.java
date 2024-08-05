package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Tomato;

public class TaxCalculator {
	public static void taxDesktopComputerCalculator(DesktopComputer computer) {
		System.out.println("DesktopComputer's tax report:\n");
		double tax = computer.taxCalculator();
		System.out.printf("Product's name: %s%n", computer.getName());
		System.out.printf("DesktopComputer's value: R$ %.1f%n", computer.getValue());
		System.out.printf("DesktopComputer's tax: R$ %.1f%n", tax);
	}
		
	
	public static void taxDesktopComputerCalculator(Tomato tomato) {
		System.out.println("\nTomato's tax report:\n");
		double tax = tomato.taxCalculator();
		System.out.printf("Product's name: %s%n", tomato.getName());
		System.out.printf("Tomato value: R$ %.1f%n", tomato.getValue());
		System.out.printf("Toamto tax: R$ %.1f%n", tax);
	}

}
