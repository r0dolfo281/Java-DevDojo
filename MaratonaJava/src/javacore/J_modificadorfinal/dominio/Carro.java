package javacore.J_modificadorfinal.dominio;

public  class Carro {
	
	private String nome;
	public final double VELOCIDADE_LIMITE2 = 250;
	public final Comprador COMPRADOR = new Comprador();
	
	public final void imprime() {
		System.out.printf("Modelo Ferrari: %s%n", this.nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
