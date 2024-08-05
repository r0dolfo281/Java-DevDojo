package javacore.G_associacao.test;

import javacore.G_associacao.dominio.Jogador;
import javacore.G_associacao.dominio.Time;

public class JogadorTest03 {
	public static void main(String[] args) {
		Jogador j1 = new Jogador("Lor");
		Jogador j2 = new Jogador("Expresso");
		Jogador j3 = new Jogador("Carioca");
		Jogador j4 = new Jogador("Arábica");
		Jogador [] jogadores1 = {j1, j2};
		Jogador [] jogadores2 = {j2, j3};
		Jogador [] jogadores3 = {j1, j4};
		Time time1 = new Time("Café", jogadores1);
		Time time2 = new Time("Pingado", jogadores2);
		Time time3 = new Time("Duplo", jogadores3);
		time1.printInfo();
		time2.printInfo();
		time3.printInfo();
		
	}

	
}
