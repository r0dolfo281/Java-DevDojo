package javacore.F_modificadoresestaticos.test;
import javacore.F_modificadoresestaticos.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Mercedes-Benz", 275);
		Carro c3 = new Carro("Audi", 290);
		System.out.println("Antes da mudança da velocidade limite!\n");
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		System.out.println("_________________________________________\n");
		
		Carro.setspeedLimit(180);
		System.out.println("Após da mudança da velocidade limite!\n");
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
	}
}
