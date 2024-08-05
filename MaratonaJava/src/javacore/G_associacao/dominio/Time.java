package javacore.G_associacao.dominio;

public class Time {
	private String name;
	private Jogador[] jogadores;

	
	public Time(String name, Jogador[] jogadores) {
		this.name = name;
		this.jogadores = jogadores;
	}
	
	public void printInfo() {
		System.out.printf("Time: %s%n", this.name);
		if(jogadores == null) {
			return;
		}else {
			for (Jogador jogador : jogadores) {
				System.out.printf("Jogador: %s%n",jogador.getName());
			}
		}
		System.out.println("-----------------------------");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Jogador[] getJogadores() {
		return jogadores;
	}
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
}
