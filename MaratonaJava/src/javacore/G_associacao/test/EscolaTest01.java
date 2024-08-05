package javacore.G_associacao.test;
import javacore.G_associacao.dominio.Escola;
import javacore.G_associacao.dominio.Professor;

public class EscolaTest01 {

	public static void main(String[] args) {
		Professor p1 = new Professor("Mestre Kame", null);
		Professor p2 = new Professor("Mestre Karin", null);
		Professor[] professores = {p1, p2};
		Escola e1 = new Escola("Escola Tartaruga", professores);
		e1.printInfo();

	}

}
