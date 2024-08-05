package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.dominio.DesktopComputer;

public class TaxCalculator {
	public void taxDesktopComputerCalculator(DesktopComputer computer) {
		System.out.println("DesktopComputer's tax report");
		double tax = computer.taxCalculator();
		System.out.printf("Product's name: %s", computer.getName());
		System.out.printf("DesktopComputer's value: %d", computer.getValue());
		System.out.printf("DesktopComputer's tax: %d", tax);
		
	}

}
