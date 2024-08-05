package javacore.B_introducaometodos.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double [] salarios;
	private double media = 0;
	
	public void imprime() {
		System.out.printf("Nome: %s%n",this.nome);
		System.out.printf("Idade: %d%n",this.idade);
		for(double salario : salarios) {
			System.out.printf("Salário: %.2f%n",salario);
		}
		media();
	}
	public void media() {
		for(double salario : salarios) {
			media += salario;
		}
		media /= salarios.length;
		System.out.printf("Média: %.2f", media);
	}
//----------------------------------------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//-----------------------------------------------	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
//--------------------------------------------
	public double[] getSalarios() {
		return salarios;
	}
	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}
//-------------------------------------------
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
}