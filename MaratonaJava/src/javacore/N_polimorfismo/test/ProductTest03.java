package javacore.N_polimorfismo.test;

import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Product;
import javacore.N_polimorfismo.dominio.Tomato;
import javacore.N_polimorfismo.servico.TaxCalculator;

public class ProductTest03 {
	public static void main(String[] args) {

		Product product = new DesktopComputer("Ryzen 9", 3000);

		Tomato tomato = new Tomato("Italian Tomato", 10);
		tomato.setExpirationDate("11/12/2025");
		
		TaxCalculator.taxCalculator(tomato);
		System.out.println("\n--------------------\n");
		TaxCalculator.taxCalculator(product);
	}

}
