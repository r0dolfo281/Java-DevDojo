package javacore.L_classesabstratas.dominio;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String name, double salary) {
		super(name, salary);
	}
	@Override
	public String toString() {
		return "Dsenvolvedor: " + name + "\n" +
				"Salário: R$" + salary + "\n";
	}
	@Override
	public void bonusCalculation() {
		this.salary = this.salary + this.salary * 0.05;
	}
	
	
	 
}
