package javacore.J_modificadorfinal.test;
import javacore.J_modificadorfinal.dominio.Carro;
import javacore.J_modificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.printf("Velocidade Limite: %.1f%n", c1.VELOCIDADE_LIMITE2);
		
		c1.COMPRADOR.setNome("Afonso");
		System.out.printf("Comprador: %s%n", c1.COMPRADOR.getNome());
		
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("812");
		ferrari.imprime();
		
	
	}
}
