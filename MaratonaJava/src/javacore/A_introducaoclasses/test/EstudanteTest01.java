package javacore.A_introducaoclasses.test;
import javacore.A_introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		
		Estudante studant = new Estudante();
		studant.name = "Afonso";
		studant.age = 29;
		studant.gender = 'M'; 
		
		System.out.printf("Nome: %s %nIdade: %d %nGênero: %c",studant.name, studant.age, studant.gender);

	}

}
