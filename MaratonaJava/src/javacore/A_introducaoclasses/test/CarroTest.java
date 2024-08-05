package javacore.A_introducaoclasses.test;

import javacore.A_introducaoclasses.dominio.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println("----C1----");
		c1.name = "Uno Mille";
		c1.model = "Hatch";
		c1.year = 1990;
		System.out.printf("Nome: %s %nModelo: %s %nAno: %d%n", c1.name, c1.model, c1.year);
		
		Carro c2 = new Carro();
		System.out.println("\n----C2----");
		c2.name = "Impala";
		c2.model = "Sedan";
		c2.year = 1967;
		System.out.printf("Nome: %s %nModelo: %s %nAno: %d", c2.name, c2.model, c2.year);

	}

}
