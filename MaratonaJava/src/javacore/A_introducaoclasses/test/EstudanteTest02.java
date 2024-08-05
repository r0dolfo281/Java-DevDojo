package javacore.A_introducaoclasses.test;
import javacore.A_introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		System.out.println(estudante.age);
		System.out.println(estudante.gender);
		System.out.println(estudante.name);
		
		System.out.println("---------------");
		
		Estudante estudante2 = new Estudante();
		estudante2.name = "Gohan";
		System.out.println(estudante2.age);
		System.out.println(estudante2.gender);
		System.out.println(estudante2.name);
	}

}
