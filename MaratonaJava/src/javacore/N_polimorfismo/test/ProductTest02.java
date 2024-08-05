package javacore.N_polimorfismo.test;

import javacore.N_polimorfismo.dominio.DesktopComputer;
import javacore.N_polimorfismo.dominio.Product;
import javacore.N_polimorfismo.dominio.Tomato;

public class ProductTest02 {
	public static void main(String[] args) {

		Product product = new DesktopComputer("Ryzen 9", 3000);
		System.out.println(product.getName());
		System.out.println(product.getValue());
		System.out.println(product.taxCalculator());

		System.out.println("--------------------");

		Product product2 = new Tomato("Italian", 10);
		System.out.println(product2.getName());
		System.out.println(product2.getValue());
		System.out.println(product2.taxCalculator());

	}

}
