package javacore.G_associacao.test;
import javacore.G_associacao.dominio.Jogador;

public class JogadorTest01 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Messi");
		Jogador jogador2 = new Jogador("Fernandão");
		Jogador jogador3 = new Jogador("Cristiano Ronaldo");
		Jogador [] jogadores = {jogador1, jogador2, jogador3};
		for (Jogador jog : jogadores) {
			jog.printInfo();
		}
		
		
		

	}

}
