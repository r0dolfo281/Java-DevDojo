package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Tomato;

public class TaxCalculator {
	public void taxDesktopComputerCalculator(DesktopComputer computer) {
		System.out.println("DesktopComputer's tax report");
		double tax = computer.taxCalculator();
		System.out.printf("Product's name: %s", computer.getName());
		System.out.printf("DesktopComputer's value: %d", computer.getValue());
		System.out.printf("DesktopComputer's tax: %d%n", tax);
	}
	public void taxDesktopComputerCalculator(Tomato tomato) {
		System.out.println("DesktopComputer's tax report");
		double tax = tomato.taxCalculator();
		System.out.printf("Product's name: %s", tomato.getName());
		System.out.printf("Tomato value: %d", tomato.getValue());
		System.out.printf("Toamto tax: %d", tax);
	}

}
