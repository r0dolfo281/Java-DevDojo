package javacore.L_classesabstratas.test;

import javacore.L_classesabstratas.dominio.Desenvolvedor;
import javacore.L_classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Goku", 7500);
		System.out.println(gerente);
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Picolo", 6500);
		System.out.println(desenvolvedor);
		
		gerente.printInfo();
		desenvolvedor.printInfo();

	}

}
