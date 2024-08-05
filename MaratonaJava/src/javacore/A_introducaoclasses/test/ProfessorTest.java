package javacore.A_introducaoclasses.test;
import javacore.A_introducaoclasses.dominio.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.age = 53;
		professor.gender = 'F';
		professor.name = "Samanta";
		
		System.out.printf("Nome: %s / Sexo: %c / Idade: %d",professor.name, professor.gender, professor.age);
		

	}

}
