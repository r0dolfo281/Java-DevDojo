package javacore.H_heranca.dominio;

public class Funcionario extends Pessoa {
	private double salario;
	static {
		System.out.println("Dentro do Bloco Estático de Inicialização de Funcionário");
	}
	{
		System.out.println("Dentro do Bloco de Inicialização de Funcionário 1");
	}
	{
		System.out.println("Dentro do Bloco de Inicialização de Funcionário 2");
	}
	
	public Funcionario(String name) {
		super(name);
		System.out.println("Dentro do construtor de Funcionário");
	}
		
	public void info() {
		super.info();
		System.out.printf("Salário: %.1f%n", this.salario);
	}
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
