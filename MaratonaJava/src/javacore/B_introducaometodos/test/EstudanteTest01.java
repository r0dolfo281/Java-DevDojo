package javacore.B_introducaometodos.test;

import javacore.B_introducaometodos.dominio.Estudante;
import javacore.B_introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		
		estudante01.name = "Constantine";
		estudante01.age = 45;
		estudante01.gender = 'M';
		
		
		estudante02.name = "Josefa";
		estudante02.age = 32;
		estudante02.gender = 'F';
		

		ImpressoraEstudante impEstudante = new ImpressoraEstudante();
		impEstudante.imprimeEstudante(estudante01);
		System.out.printf("%n");
		impEstudante.imprimeEstudante(estudante02);
		System.out.printf("%n");
		impEstudante.imprimeEstudante(estudante01);
		System.out.printf("%n");
		impEstudante.imprimeEstudante(estudante02);

	}

}
