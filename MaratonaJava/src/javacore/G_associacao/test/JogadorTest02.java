package javacore.G_associacao.test;
import javacore.G_associacao.dominio.Jogador;
import javacore.G_associacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Afonso");
		Time time = new Time("Java", null);
		
		jogador1.setTime(time);
		jogador1.printInfo();

	}

}
