package javacore.H_heranca.dominio;

public class Pessoa{
	private String name;
	private String cpf;
	private Endereco endereco;
	static {
		System.out.println("Dentro do Bloco Estático de Inicialização de Pessoa");
	}
	{
		System.out.println("Dentro do Bloco de Inicialização de Pessoa 1");
	}
	{
		System.out.println("Dentro do Bloco de Inicialização de Pessoa 2");
	}
	
	
	public Pessoa(String name) {
		this.name = name;
		System.out.println("Dentro do construtor de Pessoa");
	}


	public void info() {
		System.out.printf("Nome: %s%n", this.name);
		System.out.printf("CPF: %s%n", this.cpf);
		System.out.printf("Endereço: %s%n", this.endereco.getRua());
		System.out.printf("CEP: %s%n", this.endereco.getCep());
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
