package javacore.L_classesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
	protected String name;
	protected double salary;

	public Funcionario(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		bonusCalculation();
	}

	public abstract void bonusCalculation();

	@Override
	public void printInfo() {
		System.out.println("Imprimindo..");
	}
	
	
	
	
		
}
