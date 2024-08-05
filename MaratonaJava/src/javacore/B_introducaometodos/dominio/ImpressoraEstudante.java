package javacore.B_introducaometodos.dominio;

public class ImpressoraEstudante {
	
	public void imprimeEstudante(Estudante estudante) {
		
		
		System.out.printf("Nome: %s%n",estudante.name);
		System.out.printf("Idade: %d%n",estudante.age);
		System.out.printf("Sexo: %c%n",estudante.gender);
		estudante.name = "Goten";
		
	}
}
