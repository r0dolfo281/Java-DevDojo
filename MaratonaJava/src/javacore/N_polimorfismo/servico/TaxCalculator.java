package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.dominio.Product;
import javacore.N_polimorfismo.dominio.Tomato;

public class TaxCalculator {

	public static void taxCalculator(Product product) {
		double tax = product.taxCalculator();
		double currentValue = product.getValue() + tax;
		System.out.printf("Tax Report:%n");
		
		System.out.printf("%nProduct: %s%n", product.getName());
		System.out.printf("Value: R$%.1f%n", product.getValue());
		System.out.printf("Tax to be paid: R$%.1f%n", tax);
		System.out.printf("Current value: R$%.1f%n", currentValue);
		if(product instanceof Tomato) {
			Tomato tomato = (Tomato) product;
			System.out.printf("Expiration Date: %s%n", tomato.getExpirationDate());
		}
		
	}

}
