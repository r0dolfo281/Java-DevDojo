package javacore.G_associacao.dominio;

public class Jogador {
	private String name;
	private Time time;

	public Jogador(String name) {
		super();
		this.name = name;
	}
	
	public void printInfo() {
		System.out.printf("Nome: %s%n", this.name);
		System.out.printf("Time: %s%n", time.getName());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
	
}


